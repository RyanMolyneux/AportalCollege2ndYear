package models.users;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import models.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


@Entity

@Table(name="User")

@DiscriminatorValue("customer")

public class Customer extends User
{
	//Member Variables
	

	@OneToMany	
	private List<supportQuery> customersQueries;

	@OneToMany
	private List<FriendList> friends;

	@OneToMany
	private List<Message> messages;

	@ManyToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<Chat> chat = new ArrayList<Chat>();

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private Basket basket;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<ShopOrder> orders;
	

	public Customer()
	{

	}
	public Customer(String role,String email,String name,String password,List<Topic> topic, List<Post> post,List<supportQuery> customersQueries,List<FriendList> friends,List<Message> messages,List<Chat> chat)
	{
		super(role,email,name,password,topic,post);
		this.customersQueries= customersQueries;
		this.friends = friends;
		this.chat = chat;
		this.messages = messages;
		
	}
	public static Finder<String,Customer> find = new Finder<String,Customer>(Customer.class);

	public static List<Customer> findAllCustomers() 
	{
		return Customer.find.all();
	}

	public static List<Customer> findFilter(String name)
	{
		return Customer.find.where().ilike("name","%"+name+"%").orderBy("name asc").findList();
	}
	public static Customer getSpecificCustomer(String name) 
	{
		List<Customer> customers = findAllCustomers();
		Customer wantedCustomer = new Customer();
		for(Customer customer: customers)
		{
	 		if(customer.getName().equals(name))
	 		{
	 		 wantedCustomer = customer;
			}
		}
		return wantedCustomer;
	}
	

	//Methods
	 //Getters
	public List getCustomersQuery()
	{
	 	return customersQueries;
	}
	public List getFriends()
	{
	 	return friends;
	}
	public List getMessages()
	{
	 	return messages;
	}
	public List<Chat> getChat()
	{
	 	return chat;
	}
	
	public Basket getBasket() 
	{
		return basket;
	}

	public List<ShopOrder> getOrders()
	{
	 return orders;
	}
	 //Setters
	public void setCustomersQuery(List<supportQuery> customersQueries)
	{
	 	this.customersQueries = customersQueries;
	}
	public void setFriends(List <FriendList> friends)
	{
		this.friends = friends;
	}
	public void setMessages(List<Message> messages)
	{
	 	this.messages = messages;
	}
	public void setChat(List<Chat> chat)
	{
	 	this.chat = chat;
	}
	
	public void setBasket(Basket basket) 
	{
		this.basket = basket;
	}

	public void setOrders(List<ShopOrder> orders)
	{
	 	this.orders = orders;
	}



}
