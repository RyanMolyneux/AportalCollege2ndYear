package models.users;

import java.util.List;

public class SignUp {
	//Local Variables
	
	
	
	String email;

	String userName;
	
	String password;
	
	String passwordConfirm;


	

	//Methods
	public String validate()
	{
		List<User> users = User.findAll();		
		Boolean userDetailStatus = false;
		
			if(password.equals(passwordConfirm))
			{
				for(User commonUser: users)
				{
					if(commonUser.getEmail().equals(email)||commonUser.getName().equals(userName))
					{
				 	 userDetailStatus = true;
					}
				}
				if(userDetailStatus == true)
				{
			 	 return "Either User Name OR email address has already been used.";
				}
			}
			else
			{
		 	 return "Both passwords do not match.";
			}
			//Check for @ symbol in name & that has over certain amount of characters.
			if(userName.length() >= 8 && userName.length() < 255 && password.length() <= 1000 && password.length() >= 8 )
			{
				for(int i=0;i<userName.length();i++)
				{
					if(userName.charAt(i) == '@')
					{
						return "Cannot use @ symbol in username.";
					}
				}
				int emailCheck=0;
				for(int y =0;y<email.length();y++)
				{

					if(email.charAt(y) != '@')
					{
					 emailCheck++;
					}
					
				}
				if(emailCheck == email.length())
				{
				 return "Invalid Email.";
				}
			} else
			{
			 return "Both password & username must be over 8 characters long, also usernames cannot exceed 255 characters & passwords cannot exceed 1000";
			}
			


			return null;
		
	}
	 //Getters
	public String getUserName()
	{
	 return userName;
	}
	public String getEmail()
	{
	 return email;
	}
	public String getPassword()
	{
	 return password;
	}
	public String getPasswordConfirm()
	{
	 return passwordConfirm;
	}


	public void setEmail(String email)
	{
	 this.email = email;
	}
		 //Setters
	public void setUserName(String userName)
	{
	 this.userName = userName;
	}
	public void setPassword(String password)
	{
	 this.password = password;
	}
	public void setPasswordConfirm(String passwordConfirm)
	{
	 this.passwordConfirm = passwordConfirm;
	}

	
	


}
