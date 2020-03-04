package models;


import javax.persistence.*;
import models.users.Customer;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


@Entity
@Table(name = "Message")

public class Message extends Model
{
	//Member Variables
	@Id
 	private Long messageId;

	@Column(columnDefinition="TEXT(20000)")
	private String messageDesc;

	
	private Calendar messageTime;

	@ManyToOne
	private Chat chat;
	@ManyToOne
	private Customer customer;  

	static final DateFormat dateTimeFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy ");

	//Constructors
	 //Default
	public Message()
	{}
	 //Overloaded
	public Message(Long messageId,String messageDesc,Date messageTime,Chat chat,Customer customer)
	{
	 this.messageId = messageId;
	 this.messageDesc = messageDesc;
	 this.chat = chat;
	 this.customer = customer;
	}
	//Method
	 //Getters
	public Long getMessageId()
	{
	 return messageId;
	}
	public String getMessageDesc()
	{
	 return messageDesc;
	}
	public String getMessageTime()
	{
	 
	 return dateTimeFormat.format(messageTime.getTime());	
	}
	public Chat getChat()
	{
	 return chat;
	}
	public Customer getCustomer()
	{
	 return customer;
	}
	 //Setters
	public void setMessageId(Long messageId)
	{
	 this.messageId = messageId;
	}
	public void setMessageDesc(String messageDesc)
	{
	 this.messageDesc = messageDesc;
	}
	public void setMessageDate(Calendar messageTime)
	{
	 this.messageTime = messageTime;
	}
	public void setChat(Chat chat)
	{
	 this.chat = chat;
	}
	public void setCustomer(Customer customer)
	{
	 this.customer = customer;
	}
}
