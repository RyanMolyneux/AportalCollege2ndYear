package controllers;

import controllers.security.AuthAdmin;
import controllers.security.Secured;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import play.api.Environment;

import views.html.admin.*;
import models.*;
import models.users.Admin;
import models.users.User;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

// File upload and image editing dependencies
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

// Require Login
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)
public class AdminController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public AdminController(Environment e, FormFactory f) {
        this.formFactory = f;
        this.env = e;
    }

    // Method returns the logged in user (or null)
    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }


    public Result products(Long cat) {

        // Get list of all categories in ascending order
        List<Category> categoriesList = Category.findAll();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
	    
            // Get list of all categories in ascending order
            productsList = Product.findAll();
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Category.find.ref(cat).getProducts();
        }

        return ok(products.render(productsList, categoriesList, getUserFromSession(), env));
    }

     //This is the start page for the administrator.
     public Result indexAdmin()
     {
	return ok(indexAdmin.render(getUserFromSession(), env));
     }

     public Result adminSupport(Long queryType,boolean queryStatus)
     {
	List<supportQuery> queries = new ArrayList<supportQuery>();
	List<supportQuery> displayQueries = new ArrayList<supportQuery>();
	if(queryType == 0)
	{
	 queries = supportQuery.findAll(); 
	} else
	{
	 queries = QueryType.find.ref(queryType).getQueryList();
	}
	for(supportQuery query : queries)
	{
	   if(queryStatus == query.getQueryStatus())
	   {
	    displayQueries.add(query);
	   }
	 }
	
	
	 
	return ok(adminSupport.render(getUserFromSession(),env,displayQueries));
     }

     public Result changeQueryStatus(Long queryId) 
     {
	 try
	 {
	  List<supportQuery> queries = supportQuery.findAll();
	  supportQuery query = supportQuery.find.ref(queryId);
	  query.setQueryStatus(true);
	  query.update();
	  flash("success","Query Status Successfully Changed");
	  return redirect(routes.AdminController.adminSupport(0,false));	
	 } catch(Exception ex)
	 {
	  flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	  return redirect(routes.AdminController.UhOh());
	 }
     }




    // Render and return  the add new product page
    // The page will load and display an empty add product form

    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addProductForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getUserFromSession(), env));
    }

    @Transactional
    public Result addProductSubmit() {
	try
	{
        String saveImageMsg;
        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession(), env));
        } else
	{

        	// Extract the product from the form object
        	Product p = newProductForm.get();
	
		boolean check = productCheck(p);
		
		if(check == true)
		{
		 flash("error","Data constraint has been violated .");
		 return redirect(routes.AdminController.addProduct());
		}
		

		p.setCategory(Category.getCatConv(p.getCatSelect()));



	        if (p.getId() == null) {
	            // Save to the database via Ebean (remember Product extends Model)
	            p.save();
	        }
	        // Product already exists so update
	        else if (p.getId() != null) {
	            p.update();
	        }

	        // Save image
	        // Get image data
	        MultipartFormData data = request().body().asMultipartFormData();
	        FilePart image = data.getFile("upload");

	        // Save the image file
	        saveImageMsg = saveFile(p.getId(),"product", image);

	        // Set a success message in temporary flash
	        // for display in return view
	        flash("success", "Product " + p.getName() + " has been created/ updated " + saveImageMsg);

        	// Redirect to the admin home
        	return redirect(routes.AdminController.products(0));
	}
	} catch(Exception ex)
	{
	 flash("exception","Uh Oh looks like something went wrong press back to get out of here.");
	 return redirect(routes.AdminController.UhOh());
	}
    }

    // Update a product by ID
    // called when edit button is pressed
    @Transactional
    public Result updateProduct(Long id) {

        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            // Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);

            } catch (Exception ex) 
	    {
                flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
		return redirect(routes.AdminController.UhOh());
            }
        // Render the updateProduct view - pass form as parameter
        return ok(addProduct.render(productForm, getUserFromSession(), env));
    }

    // Delete Product by id
    @Transactional
    public Result deleteProduct(Long id) {
	if(Product.find.byId(id).getStock()==0)
	{
        // find product by id and call delete method
        Product.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Product has been deleted");
	} else
	{
	 flash("error","Sorry but this item must first be out of stock for it to be removed.");
	}
        // Redirect to products page
        return redirect(routes.AdminController.products(0));
    }

    public Result adminAdvert()
    {
	Admin currentAdmin = (Admin) getUserFromSession();
	List<Advert> adverts = Advert.findAll();

	return ok(adminAdvert.render(adverts,currentAdmin,env));
    }

    public Result addAdvert()
    {
	Form<Advert> advertisementForm = formFactory.form(Advert.class);

	Admin currentAdmin = (Admin) getUserFromSession(); 

	return ok(addAdvert.render(advertisementForm,currentAdmin,env));
    }
    public Result addAdvertSubmit()
    {
	Form<Advert> advertisementForm = formFactory.form(Advert.class).bindFromRequest();
	if(advertisementForm.hasErrors())
	{
	  Admin currentAdmin = (Admin) getUserFromSession();
	  return badRequest(addAdvert.render(advertisementForm,currentAdmin,env));
	} else
	{
	 
	 Advert newAdvert = advertisementForm.get();
	 for(Advert advert : Advert.findAll())
	 {
	  if(advert.getAdvertId() == newAdvert.getAdvertId())
	  {
	   flash("error","Unique key constraint violated please retry & please do not insert your own primary key.");
	   return redirect(routes.AdminController.addAdvert());
	  }
	 }

	
	 if(newAdvert.getAdvertName().length()<=60 && newAdvert.getAdvertName().length()>=8)
	 {
	 newAdvert.setAdvertAdmin((Admin) getUserFromSession());	
	 newAdvert.setAdvertDateAdded(Calendar.getInstance());

	 newAdvert.save();
	 MultipartFormData file = request().body().asMultipartFormData();
	 FilePart image = file.getFile("upload");
	 

	 saveFile(newAdvert.getAdvertId(),"advert",image);

	 flash("success","Advert has been successfully Added.");
	 return redirect(routes.AdminController.adminAdvert());
	 } else
	 {
	 flash("error","Data Constraint Violated Advert name must be equal to or greater than 12 characters & less than or equal to 60 characters long");
	 return redirect(routes.AdminController.addAdvert());
	}
	}
	
    }
    public Result deleteAdvert(Long advertId)
    {
	//Uses static method in advert to find advert you want to delete and removes it from the database.
	Advert.find.ref(advertId).delete();
	
	flash("success","Advert has been successfully Deleted.");

	return redirect(routes.AdminController.adminAdvert());
    }

    // Save an image file
    public String saveFile(Long id,String type,FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
		//Standard Image
                IMOperation op = new IMOperation();
		// thumbnail
                IMOperation thumb = new IMOperation();

                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                
                
		if(type.equalsIgnoreCase("product"))
		{
		// Resize using height and width constraints
		op.resize(300,200);
                // Save the  image
                op.addImage("public/images/productImages/" + id + ".jpg");
                
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
		}
		else if(type.equalsIgnoreCase("media"))
		{
			op.resize(300,200);
			op.addImage("public/images/mediaImages/"+id+".jpg");
			thumb.addImage(file.getAbsolutePath());
			thumb.thumbnail(60);
			thumb.addImage("public/images/mediaImages/covers/"+id+".jpg");
		}
		else
		{
		 // Resize using height and width constraints
		 op.resize(1000,300);
		 //This is used for saving normal sized image
		 op.addImage("public/images/advertImages/"+id+".jpg");
		
		 thumb.addImage(file.getAbsolutePath());

		 thumb.thumbnail(60);
		 thumb.addImage("public/images/advertImages/thumbnails/"+id+".jpg");		
		}                
		// execute the operation
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }

	//Media Section
	    public Result adminMedia(Long gen) {

        // Get list of all categories in ascending order
        List<Genre> genreList = Genre.findAll();
        List<Media> mediaList = new ArrayList<Media>();

        if (gen == 0) {

            // Get list of all categories in ascending order
            mediaList = Media.findAll();
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            mediaList = Genre.find.ref(gen).getMedia();
        }

        return ok(adminMedia.render(mediaList, genreList, getUserFromSession()));
    }



        public Result addMedia() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Media> addMediaForm = formFactory.form(Media.class);

        // Render the Add Product View, passing the form object
        return ok(addMedia.render(addMediaForm, getUserFromSession(), env));
    }

    @Transactional
    public Result addMediaSubmit() {

        String saveImageMsg;
        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Media> newMediaForm = formFactory.form(Media.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newMediaForm.hasErrors()) {
            // Display the form again
            return badRequest(addMedia.render(newMediaForm, getUserFromSession(), env));
        }

        // Extract the product from the form object
        Media m = newMediaForm.get();



        m.setGenre(Genre.getGenConv(m.getGenSelect()));



        if (m.getMedia_ID() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            m.save();
        }
        // Product already exists so update
        else if (m.getMedia_ID() != null) {
            m.update();
        }

        // Save image
        // Get image data
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        // Save the image file
        saveImageMsg = saveFile(m.getMedia_ID(),"media", image);

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Media " + m.getTitle() + " has been created/ updated " + saveImageMsg);

        // Redirect to the admin home
        return redirect(routes.AdminController.adminMedia(0));
    }

    // Update a product by ID
    // called when edit button is pressed
    @Transactional
    public Result updateMedia(Long id) {

        Media m;
        Form<Media> mediaForm;

        try {
            // Find the product by id
            m = Media.find.byId(id);

            // Create a form based on the Product class and fill using p
            mediaForm = formFactory.form(Media.class).fill(m);

        } catch (Exception ex) {
            // Display an error message or page
            return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(addMedia.render(mediaForm, getUserFromSession(), env));
    }

    // Delete Product by id
    @Transactional
    public Result deleteMedia(Long id) {

        // find product by id and call delete method
        Media.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Media has been deleted");

        // Redirect to products page
        return redirect(routes.AdminController.adminMedia(0));
    }

    public Result UhOh()
    {
	return ok(uhohpage.render());
    }


    public boolean productCheck(Product p)
    {
	
	if(p.getStock()< 10000000 && p.getPrice() < 1000000 && p.getStock()>0 && p.getPrice() >= 0)
	{
		if(p.getName().length()<255&&p.getDescription().length()<1000)
		{
		 return false;
		}
		
	}
	return true;
	

    }

}
