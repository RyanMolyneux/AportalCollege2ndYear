package controllers.security;

import play.api.Environment;
import play.mvc.*;
import play.data.*;

import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Http.MultipartFormData;
import java.io.File;

// File upload imports & editing images
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import javax.inject.Inject;

import views.html.*;

// Import user models
import models.users.*;
import models.FriendList;
import java.util.List;
import java.util.ArrayList;

public class LoginSignUpController extends Controller {

    /** Dependency Injection **/
    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public LoginSignUpController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }
    public User getUserFromSession()
    {
	return User.getUserById(session().get("email"));
    }

    // Render and return  the Login view
    public Result login() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Login> loginForm = formFactory.form(Login.class);
	Form<SignUp> signUpForm = formFactory.form(SignUp.class);
        // Render the Add Product View, passing the form object
        return ok(login.render(loginForm, User.getUserById(session().get("email")),signUpForm));
    }

    //Profile edit method
    public Result editProfile() 
    {
	
	User user = getUserFromSession();
	if(user instanceof Admin) 
	{	flash("error","Admin cannot edit there details.");
		return redirect(controllers.routes.HomeController.index());
	} else
	{
		Customer currentCustomer = (Customer) user;
		return ok(editProfile.render(currentCustomer,env));
	}
    }
    public Result editProfilePhoto()
    {
	Form<editProfileForm> signUpForm = formFactory.form(editProfileForm.class);

	if(getUserFromSession() instanceof Customer)
	{
		Customer currentCustomer = (Customer) getUserFromSession(); 
		return ok(editPhoto.render(currentCustomer,signUpForm,env));	
	} else
	{
		flash("error","You must be Signed Up & In to use this feature.");
		return redirect(controllers.routes.HomeController.index());
			
	}
    }

    public Result editProfilePhotoSubmit()
    {
	Customer currentCustomer = (Customer) getUserFromSession();
	Form<editProfileForm> profileEditForm = formFactory.form(editProfileForm.class).bindFromRequest();
	if(profileEditForm.hasErrors())
	{
	 return redirect(routes.LoginSignUpController.editProfile());
	}
	else
	{
	 		try
			{
			//Used if user is editing there account.
			editProfileForm profileEdit = profileEditForm.get();
			
			

			MultipartFormData file = request().body().asMultipartFormData();
			FilePart image = file.getFile("upload");
			saveFile(currentCustomer.getName(),image); 

			currentCustomer.update();
			flash("success","The User's Details have been updated.");
			return redirect(routes.LoginSignUpController.editProfilePhoto());
			} catch(Exception ex)
			{
			 flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
			 return redirect(controllers.routes.HomeController.UhOh());
			}
		
	}
    }

    //Sign Up methods
    public Result signUpSubmit() {
	Form<Login> loginForm = formFactory.form(Login.class);
	Form<SignUp> signUpForm = formFactory.form(SignUp.class).bindFromRequest();
	
	if(signUpForm.hasErrors())
	{
		return badRequest(login.render(loginForm,User.getUserById(session().get("email")),signUpForm));
	}
	else
	{
		
		SignUp signUp = signUpForm.get();		

		
		Customer newCustomer;
		
		newCustomer = new Customer();
		newCustomer.setName(signUp.getUserName());
		newCustomer.setEmail(signUp.getEmail());
		newCustomer.setPassword(signUp.getPassword());
		
		
		
			
		
		newCustomer.save();
		
		
		
		flash("success","you have successfully created your account.");
		return redirect(controllers.routes.HomeController.index());
    	}
    }

    // Handle login submit
    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
	Form<SignUp> signUpForm = formFactory.form(SignUp.class); 
        // Check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()) {
            // If errors, show the form again
            return badRequest(login.render(loginForm, User.getUserById(session().get("email")),signUpForm));
        }
        else {
            // User Logged in successfully
            // Clear the existing session - resets session id
            session().clear();
            // Store the logged in email in the session (cookie)
            session("email", loginForm.get().getEmail());
        }
        // Return to admin or customer home page
        User u = User.getUserById(session().get("email"));
	
        if (u instanceof Admin) {
            return redirect(controllers.routes.AdminController.indexAdmin());
        }
        else {
            return redirect(controllers.routes.HomeController.index());
        }
    }

    // Logout
    public Result logout() {
        // Delete the current session
        // Generates a new session id
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.LoginSignUpController.login());
    }

    public void saveFile(String name,FilePart<File> image) throws Exception 
    {
     if(image != null)
     {
	String mimeType = image.getContentType();
	if(mimeType.startsWith("image/")) 
	{
		File file = image.getFile();
		
		ConvertCmd cmd = new ConvertCmd();

		IMOperation standardImage = new IMOperation();
		IMOperation thumbImage = new IMOperation();	
		
		standardImage.addImage(file.getAbsolutePath());

		standardImage.resize(300,200);		

		standardImage.addImage("public/images/userImages/"+name+".jpg");
		
		thumbImage.addImage(file.getAbsolutePath());
		thumbImage.resize(60);
		thumbImage.addImage("public/images/userImages/thumbnails/"+name+".jpg");	
		
		 cmd.run(standardImage);
		 cmd.run(thumbImage);
		
	}
     }

	
    }


}
