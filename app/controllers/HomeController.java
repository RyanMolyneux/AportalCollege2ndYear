package controllers;

import controllers.security.AuthAdmin;
import controllers.security.Secured;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.Calendar;
import java.util.TimeZone;
import javax.inject.Inject;

import views.html.*;

// Import models
import models.*;
import models.users.*;



public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f, Environment e) {
        this.env = e;
        this.formFactory = f;
    }


    // Method retuns the logged in user (or null)
    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    public Result index() {
	List<Advert> adverts  = Advert.findAll();
	

	if(getUserFromSession() instanceof Customer || getUserFromSession() == null)
	{
        return ok(index.render(getUserFromSession(),adverts));
   	}
	else
	{
	 return redirect(controllers.routes.AdminController.indexAdmin());
	}
	 
   }

    public Result about() {

        return ok(about.render(getUserFromSession()));
    }
    public Result userSupport()
    {
	if(getUserFromSession() instanceof Customer)
	{	
		Form<supportQueryForm> supQuery = formFactory.form(supportQueryForm.class);
		return ok(userSupport.render(getUserFromSession(),supQuery));
	} else
	{
		flash("error","You must first be Signed Up & Signed In to use this Feature.");
		return redirect(routes.HomeController.index());
	}    	
    }
    public Result submitQuery()
    {
	if(getUserFromSession() instanceof Customer)
	{
		try
		{
			Form<supportQueryForm>supportForm = formFactory.form(supportQueryForm.class).bindFromRequest();
	
			if(supportForm.hasErrors())
			{
		 	 return badRequest(userSupport.render(getUserFromSession(),supportForm));	
			} 
			else
			{
	 			supportQueryForm newSupportQueryForm = supportForm.get();
	 
	 			
	 			supportQuery sQuery = new supportQuery();

	 			sQuery.setQueryType(QueryType.find.byId((newSupportQueryForm.getQueryTypeId())));
	 			sQuery.setQueryDescription(newSupportQueryForm.getDescription());
	
	 			sQuery.setQueryDate(Calendar.getInstance());
	 			sQuery.setQueryStatus(false);
	
	 			User queryingUser = getUserFromSession();

	 			Customer queryingCustomer = new Customer();
			
				if(userSupportCheck(sQuery) == false)
	 			{

			 	 queryingCustomer = (Customer) queryingUser;
			 	 sQuery.setQueryingCustomer(queryingCustomer);
			 	 sQuery.save();
		
	 		 	 flash("success","Your Query has been successfully sent.");
	 		 	 Form<supportQueryForm> queryForm = formFactory.form(supportQueryForm.class);
	 		 	 return ok(userSupport.render(getUserFromSession(),queryForm));
	 		
	 		 	}
	 		 	else
	 		 	{
	 		  	 flash("error","Your Query was not successfully sent something went wrong.");
	 	 	  	 return redirect(routes.HomeController.userSupport());
	 	 	 	}
	 	       }
	 	} catch(Exception ex)
	 	{
	 	 flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 	 return redirect(routes.HomeController.UhOh());
	 	}
	 } else
	 {
		flash("error","You must first be Signed Up & Signed In to use this Feature.");
		return redirect(routes.HomeController.index());
	 }
	
    }


  	  public Result products(Long catId,String filter) {

    	    // Get list of all categories in ascending order
     	   List<Category> categoriesList = Category.findAll();
     	   List<Product> productsList = new ArrayList<Product>();
	
      		  if (catId == 0) {
     	   	    // Get list of all categories in ascending order
     	  	     productsList = Product.findAll(filter);
     		   }
     	 	  else {
     	 	      // Get products for selected category
     	 	      // Find category first then extract products for that cat.
      	  	    productsList = Product.findFilter(catId,filter);
     	  	 }

      	  return ok(products.render(catId,filter,productsList, categoriesList, getUserFromSession(), env));
   	 }
	
	public Result moreProductInfo(Long prodId) 
	{
	 try
	 {
		Product selectedProd = Product.find.byId(prodId);
		User currentUser = getUserFromSession();
		return ok(moreProductInfo.render(selectedProd,currentUser,env));
	 } catch(Exception ex)
	 {
	  flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	  return redirect(routes.HomeController.UhOh());
	 }	
	}


	 public Result media(Long gen, String filter) {

        // Get list of all categories in ascending order
        List<Genre> genreList = Genre.findAll();
        List<Media> mediaList = new ArrayList<Media>();

        if (gen == 0) {
            // Get list of all categories in ascending order
            mediaList = Media.findAll(filter);
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            mediaList = Media.findFilter(gen, filter);
        }

        return ok(media.render(mediaList, genreList, gen, filter, getUserFromSession(), env));
   	 }




	public Result moreMediaInfo(Long medId)
	{
		Media selectedMedia = Media.find.byId(medId);
		User currentUser = getUserFromSession();
		return ok(moreMediaInfo.render(selectedMedia,currentUser));
	}


	public Result forum(String filter){
	try
	{
		if(getUserFromSession() instanceof Customer || getUserFromSession() instanceof Admin)
		{
	 	 List<Topic> topics = Topic.findFilter(filter);
         	 return ok(forum.render(topics,getUserFromSession(),filter, env));
    		} 
		else
		{
	 	flash("error","You must be signed in to access this feature.");
	 	return redirect(routes.HomeController.index());
		}
	} catch(Exception ex)
	{
	 flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 return redirect(routes.HomeController.UhOh());
	}
	}


    public Result deleteTopic(Long topicId){
	try
	{
		if(getUserFromSession() instanceof Admin)
		{
		Topic.find.ref(topicId).delete();
		flash("success", "Topic has been deleted");
		return redirect(routes.HomeController.forum(""));
		}
		return redirect(routes.HomeController.forum(""));
	}catch(Exception ex) {flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 return redirect(routes.HomeController.UhOh());
	}			
	} 
	

    public Result addPost(Long topicId){
	try{	    	
		if(getUserFromSession() instanceof User){
		Topic currentTopic = Topic.find.byId(topicId);
	        Form<PostForm> addPostForm = formFactory.form(PostForm.class);
	        return ok(addPost.render(addPostForm,currentTopic, getUserFromSession(), env));
		}else {
			return redirect(routes.HomeController.forum(""));
		}
	    	
	} catch(Exception ex){flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 return redirect(routes.HomeController.UhOh());
	}
	}

    @Transactional
    public Result addPostSubmit() {
	try{
		if(getUserFromSession() instanceof User)
		{
	       	    Form<PostForm> newPostForm = formFactory.form(PostForm.class).bindFromRequest();
	            PostForm postForm = newPostForm.get();
		    Post post = new Post();
		    post.setPostDescription(postForm.getPostDescription());
		    post.setUser(getUserFromSession());
		    post.setTopic(Topic.find.byId(postForm.getPostTopicId()));
		    post.setPostDate(Calendar.getInstance());
		    String stringCheck = post.getPostDescription().trim();
		    if(post.getPostDescription().length() > 2000 || stringCheck.length() == 0 )
		    { 
			flash("error","Something went wrong"); 
			return redirect(routes.HomeController.topic(post.getTopic().getTopicId()));								
		    } 
		    else
		    {
	    		post.save();
            		// Set a success message in temporary flash
            		flash("success", "Post by: " + post.getUser() + " has been created/ updated ");
        	        return redirect(routes.HomeController.topic(post.getTopic().getTopicId()));
		    }
		
           
	     }
	} catch (Exception ex)
	{
			flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
		 	return redirect(routes.HomeController.index());
	}
			return redirect(routes.HomeController.index());
			
	}
     
    public Result deletePost(Long postId,Long topicId) {
	try{
        	if(getUserFromSession().getEmail() .equals( Post.find.ref(postId).getUser().getEmail())){
        	Post.find.ref(postId).delete();
        	// Add message to flash session
        	flash("success", "Post has been deleted");

        	// Redirect to topic page
       	 	return redirect(routes.HomeController.topic(topicId));
        	}else{ 
		flash("error","did not delete"); 
		return redirect(routes.HomeController.forum(""));
		 }
	  } catch (Exception ex){flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 return redirect(routes.HomeController.UhOh());}
    }


    public Result topic(Long topicId){
	try{
		if(getUserFromSession() instanceof User){
	        Topic selectedtopic = Topic.find.byId(topicId);
	        User currentUser = getUserFromSession();
	        return ok(topic.render(selectedtopic,currentUser,env));
		}else {return redirect(routes.HomeController.forum(""));}
       } catch (Exception ex){flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	 return redirect(routes.HomeController.UhOh());
			}
		   }

    public Result addTopic() 
    {
	if(getUserFromSession() instanceof User){
        Form<Topic> addTopicForm = formFactory.form(Topic.class);
        return ok(addTopic.render(addTopicForm, getUserFromSession(), env));
	}else {return redirect(routes.HomeController.index());
	}
    }

    @Transactional
    public Result addTopicSubmit() {

        Form<Topic> newTopicForm = formFactory.form(Topic.class).bindFromRequest();


        if(newTopicForm.hasErrors()) {

            return badRequest(addTopic.render(newTopicForm, getUserFromSession(),env));
        }
	else
	{

        Topic topic = newTopicForm.get();

String stringCheck = topic.getName().trim();

String stringCheck2 = topic.getDescription().trim();
	    
	 if( topic.getName().length() > 101 || stringCheck.length() == 0 || topic.getDescription().length() > 201 || stringCheck2.length() ==0 )
		    { 
			flash("error","Something went wrong"); 
			return redirect(routes.HomeController.forum(""));								
		    }
		    else
		    {

	topic.setUser(getUserFromSession());

        if (topic.getTopicId() == null) {
        // Save to the database via Ebean 
            topic.save();
        }
        // Topic already exists so update
        else if (topic.getTopicId() != null) {
            topic.update();
        }


        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Topic " + topic.getName() + " has been created/ updated ");

        // Redirect to the forum
        return redirect(routes.HomeController.forum(""));
    	}
	}
     }






	//Friend & Chat Home Controller Methods
    public Result findFriends(String name) 
    	{
		User currentUser = getUserFromSession();
		//Used to Restrict Access From Admin or Users that are not signed in.
		if(currentUser instanceof Customer)
		{

			 Customer currentCustomer = (Customer) currentUser;

			 List<Customer> customerList = Customer.findFilter(name);

			 //Used to ensure user cannot send himself friend request.
			 customerList.remove(currentCustomer);
			 List<FriendList> currentCustomersFriends = FriendList.findFriends(currentCustomer);

			 //Run's through the current user's friendList & find's friends which 
			 //he currently has to ensure that they are not displayed.
			 for(FriendList customersFriend : currentCustomersFriends)
			 {
			  customerList.remove(Customer.getSpecificCustomer(customersFriend.getFriendListName()));
			 }
			 			
			 


			return ok(findFriends.render(currentCustomer,customerList,env));

		}
		else
		{

			flash("error","You must first be Signed Up & Signed In to use this Feature.");
			return redirect(routes.HomeController.index());	

		}
   	}

	//Sending Friend Requests
    public Result sendRequest(String name)
	{

		try
		{
		if(getUserFromSession() instanceof Customer) {
			//Finds Customer in DB
			Customer pendingFriend = (Customer) User.find.ref(Customer.getSpecificCustomer(name).getEmail());
			Customer currentCustomer = (Customer) getUserFromSession();

			//Check for if person is a Customer & Check if the you have already sent that user a friend request.

			boolean result = FriendList.getSpecificFriend(pendingFriend, currentCustomer.getName());

			if (result == false) {
				FriendList newFriend = new FriendList();
				newFriend.setFriendListName(getUserFromSession().getName());
				newFriend.setFriendStatus("pending");
				newFriend.setCustomer(pendingFriend);
				newFriend.save();

				flash("success", "Friend Request has been successfully sent.");

			} else {
				flash("error", "You Have Already sent this person a friend request .");
			}
			return redirect(routes.HomeController.findFriends(""));
		} else
		{
			flash("error","You must first be Signed Up & Signed In to use this Feature.");
			return redirect(routes.HomeController.index());
		}
		}
		catch(NullPointerException ex) {
		 	flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
		 	return redirect(routes.HomeController.UhOh());
		}
		
	}

    public Result addFriend(Long option,String name) 
	{
		Customer currentCustomer = (Customer) User.find.ref(getUserFromSession().getEmail());
		Customer pendingFriend = (Customer) User.find.ref(Customer.getSpecificCustomer(name).getEmail());
		try
		{
		 FriendList newAcceptedFriend = new FriendList();	
		 List<FriendList> friends = FriendList.findFriends(currentCustomer);	
 		 for(FriendList friend: friends)
		 {
		  if(friend.getFriendListName().equals(name))
		  {
		   newAcceptedFriend = FriendList.find.ref(friend.getFriendListId());
		  }
		 }
		 newAcceptedFriend.setFriendStatus("friend");
		 newAcceptedFriend.update();
		
		 //Create Chat Between Two friends when add is accepted
		 Chat friendChat = new Chat();
		 friendChat.setChatName(currentCustomer.getName()+"-"+pendingFriend.getName());
		 friendChat.getCustomer().add(currentCustomer);
		 friendChat.getCustomer().add(pendingFriend);
		 //Save New Chat to DB.
		 friendChat.save();
		 
		
		 

		 FriendList newAddedFriend = new FriendList();
		 newAddedFriend.setFriendListName(currentCustomer.getName());
		 newAddedFriend.setFriendStatus("friend");
		 newAddedFriend.setCustomer(pendingFriend);
		 newAddedFriend.save();

		 pendingFriend.getFriends().add(newAddedFriend);
		 pendingFriend.update();

		flash("success","Friend Request has Successfully been Accepted.");
		return redirect(routes.HomeController.Chat(option));
		} catch(NullPointerException ex)
		{
		 flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
		 return redirect(routes.HomeController.UhOh());
		}
	}
	public Result declineRequest(String name)
	{
		try {
			if (getUserFromSession() instanceof Customer)
			{
				Customer currentCustomer = (Customer) getUserFromSession();

				List<FriendList> friends = FriendList.findFriends(currentCustomer);
				Long customerId = null;
				for(FriendList customer: friends)
				{
					if(customer.getFriendListName().equals(name))
					{
						customerId = customer.getFriendListId();
					}
				}
				if(customerId != null) {
					FriendList.find.ref(customerId).delete();
					flash("success","Friend Request has been successfully declined.");
				} else {
					flash("error","You have not recieved a request from a user with this name.");
					return redirect(routes.HomeController.Chat(1));
				}


				return redirect(routes.HomeController.Chat(1));
			} else
			{
				flash("error","You must first be Signed Up & Signed In to use this Feature.");
				return redirect(routes.HomeController.index());
			}
		} catch(Exception ex)
		{
			flash("exception","Uh Oh Looks like something went wrong.");
			return redirect(routes.HomeController.UhOh());
		}

	}

        public Result Chat(Long option)
	{
		
		if(getUserFromSession() instanceof Customer)
		{

		 Customer currentCustomer = (Customer) getUserFromSession();
		 
		 List<FriendList> friends = new ArrayList<FriendList>();
		 List<FriendList> pendingFriends = new ArrayList<FriendList>();
		 List<FriendList> friendSelect = currentCustomer.getFriends();
		 for(FriendList friend : friendSelect)
		 {
		  if(friend.getFriendStatus().equals("friend"))
		  {
		   friends.add(friend);
		  } 
		  else
		  {
		   pendingFriends.add(friend);
		  } 
		 }
		 
		 return ok(Chats.render(currentCustomer,friends,pendingFriends,option,env));
		
		 		
		}
		else
		{
		 flash("error","You must first be Signed Up & Signed In to use this Feature.");
		 return redirect(routes.HomeController.index());
		}
	
	} 
   public Result MessageFriend(String name)
	{
	 //This try catch is used for when somebody messes with Message friend URL throws Null pointer exception.
	 try
	 {
	 	if(getUserFromSession() instanceof Customer)
	 	{
	  	 Customer currentCustomer = (Customer) getUserFromSession();
	  	 //This Method Wont Work
	  	 Chat currentChat = new Chat();
	  	 List<Chat> chatList = currentCustomer.getChat();
	  	 for(Chat chat : chatList)
	  	 {
			if(chat.getChatName().equalsIgnoreCase(currentCustomer.getName()+"-"+name)||chat.getChatName().equalsIgnoreCase(name+"-"+currentCustomer.getName()))
			{
		 	 currentChat = chat;
			}
	  	 }
	  	 List<Message> messages = currentChat.getMessage();
	  	 Form<Message> messageForm = formFactory.form(Message.class);
	  	 return ok(MessageFriend.render(currentCustomer,currentChat,messages,messageForm,env));
	 	} else
	 	{
	 	 flash("error","You must first be Signed Up & Signed In to use this Feature.");
	 	 return redirect(routes.HomeController.index());
	 	}	
	 }
	 catch(Exception ex)
	 {
	  flash("exception","Uh Oh Looks like something went wrong press back to get out of here.");
	  return redirect(routes.HomeController.UhOh());
	 }

	}

   public Result MessageFriendSubmit(Long chatId)
	{
	 Form<Message> messageForm = formFactory.form(Message.class).bindFromRequest();
	 String name =""; 
	 User currentUser = getUserFromSession();
	 try
	 {
		 if(currentUser instanceof Customer)
		 {	 	
			Customer currentCustomer = (Customer) currentUser;
			//This first part is used so when the page redirects to chat it remembers the coversation name it was writing this message from rather than passing in unsafely through html.
			int checkChat = 0;
			for(Chat chat : currentCustomer.getChat())
			{
				if(chat.getChatId()!= chatId)
				{
				 checkChat++;
				}
			}

			if(checkChat<currentCustomer.getChat().size())
			{
				List<Customer> chatMembers = Chat.find.byId(chatId).getCustomer();
				for(int i=0;i<2;i++)
				{
					if(chatMembers.get(i).getName()!=currentCustomer.getName())
					{
					 name = chatMembers.get(i).getName();
					}
				}	

				if(messageForm.hasErrors() )
	 			{
	  			 flash("error","Message could not be sent.");
	  			 return redirect(routes.HomeController.MessageFriend(name));
	 			} 
	 			else
	 			{
	  				Message messageSent = messageForm.get();
					
					if(messageSent.getMessageDesc().length()>0 && messageSent.getMessageDesc().length()<=20000)
				 	{
						messageSent.setMessageDate(Calendar.getInstance(TimeZone.getTimeZone("GMT")));	  			
						messageSent.setCustomer((Customer) getUserFromSession());
	  					messageSent.setChat(Chat.find.ref(chatId));
	  					messageSent.save();
					}
					else
					{
						flash("error","Message you send cannot be empty & must have less than 20000 characters.");
						return redirect(routes.HomeController.MessageFriend(name));
					}
	 			}
	 		}
			else
			{
			 flash("error","Sorry but this chat does not exist.");
			 return redirect(routes.HomeController.Chat(0));
			}
		}		
	 	else
	 	{
	  	flash("error","You must first be Signed up & In to use this Feature");
	  	return redirect(routes.HomeController.index());
	 	}
	 } catch(NullPointerException ex)
	 {
	  flash("exception","Uh Oh Looks like something went wrong press back to get out of here");
	  return redirect(routes.HomeController.UhOh());
	 }
	 return redirect(routes.HomeController.MessageFriend(name));
	}

	public boolean userSupportCheck(supportQuery sentForm)
	{
	 QueryType type = sentForm.getQueryType();
	 String description = sentForm.getQueryDescription().trim();
		
	 if(description.length() == 0 || description.length() <= 2000 || type != null)
	 {
	  return false;
	 } 
	 else
	 {
	  return true;
	 }
	
	}
	//Method used just for when Exceptiobs are triggered. 
	public Result UhOh()
	{
	 return ok(uhohpage.render());
	}
  


//EOF
}
