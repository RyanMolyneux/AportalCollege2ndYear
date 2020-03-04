package models;

import javax.persistence.*;
import models.users.Customer;
import java.util.List;


import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="Chat")

public class Chat extends Model
{
	//Member Variables
	@Id
	private Long chatId;

	private String chatName;

	@OneToMany
	List<Message> message;

	@ManyToMany(cascade = CascadeType.ALL)
	List<Customer> customer;
	//Constructors
	 //Default
	public Chat()
	{}
	 //Overloaded	
	public Chat(Long chatId,String chatName,List<Message> message,List<Customer> customer)
	{
	 this.chatId = chatId;
	 this.chatName = chatName;
	 this.message = message;
	 this.customer = customer;
	}

	public static Finder<Long,Chat> find = new Finder<Long,Chat>(Chat.class);
	//Used to find specific chat you wish to view using your name & the name of friend you have added
	public static Chat findChat(String chatName)
	{
	 Chat friendChat = new Chat();
	 for(Chat chat : find.all())
	 {
	  if(chat.getChatName().equals(chatName))
	  {
	   friendChat = chat;
	  }
	 }
	 return friendChat;
	}
	
	//Methods
	 //Getters
	public Long getChatId()
	{
	 return chatId;
	}
	public String getChatName()
	{
	 return chatName;
	}
	public List<Message> getMessage()
	{
	 return message;
	}
	public List<Customer> getCustomer()
	{
	 return customer;
	}
	
	 //Setters
	public void setChatId(Long chatId)
	{
	 this.chatId = chatId;
	}
	public void setChatName(String chatName)
	{
	 this.chatName = chatName;
	}
	public void setChatMessages(List<Message> message)
	{
	 this.message = message;
	}
	public void setCustomer(List<Customer> customer)
	{
	 this.customer = customer;
	}



}
