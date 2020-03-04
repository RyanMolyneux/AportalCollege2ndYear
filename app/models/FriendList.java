package models;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
import models.users.*;

@Entity
@Table(name="FriendList")

public class FriendList extends Model
{
	//Member Variables
	@Id	
	private Long friendListId;
	
	private String friendListName;
	
	private String friendStatus;
	@ManyToOne
	Customer customer = new Customer();

	//Constructors
	 //Default
	public FriendList()
	{}
	public FriendList(Long friendListId,String friendListName,String friendStatus,Customer customer)
	{
	 this.friendListId = friendListId;
	 this.friendListName = friendListName;
	 this.friendStatus = friendStatus;
	 this.customer = customer;
	}


	//Used to find all users in the DB Friends
	public static Finder<Long,FriendList> find = new Finder<Long,FriendList>(FriendList.class);
	//This is used to find all of a specific users friends in DB
	public static List findFriends(Customer customersFriends)
	{
	 List<FriendList> friendsList = new  ArrayList<FriendList>();
	 for(FriendList friend : FriendList.find.all())
	 {
	  if(friend.getCustomer().getEmail().equals(customersFriends.getEmail()))
	  {
	   friendsList.add(friend);
	  }
	 }
	 return friendsList;
	}
	


	public static boolean getSpecificFriend(Customer customersFriend,String name)
	{
		boolean result = false;
	 	List<FriendList>findFriends = findFriends(customersFriend);
	 	for(FriendList friend : findFriends)
		{
			if(friend.getFriendListName().equals(name))
			{
			 result = true;
			}
		}
	 return result;
	}
	

	//Methods
	 //Getters
	public Long getFriendListId()
	{
	 return friendListId;
	}
	public String getFriendListName()
	{
	 return friendListName;
	}
	public String getFriendStatus()
	{
	 return friendStatus;
	}
	public Customer getCustomer()
	{
	 return customer;
	}
	 //Setters
	public void setFriendListId(Long friendListId)
	{	
	 this.friendListId= friendListId;
	}
	public void setFriendListName(String friendListName)
	{
	 this.friendListName = friendListName;
	}
	public void setFriendStatus(String friendStatus)
	{
	 this.friendStatus = friendStatus;
	}
	public void setCustomer(Customer customer)
	{
	 this.customer = customer;
	}
}
