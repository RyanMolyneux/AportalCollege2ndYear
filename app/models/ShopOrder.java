package models;

import models.users.Customer;
import java.util.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;

    private Calendar OrderDate;

    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    @ManyToOne
    private Customer customer;


    static final DateFormat dateTimeFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy ");

    //Constructors
     //Default
    public ShopOrder()
    {}
     //Overloaded
    public ShopOrder(Long id,Calendar OrderDate)
    {
    	this.id = id;
	this.OrderDate = OrderDate;
    }
    //Getter
    public Long getId()
    {
	return id;
    }
    public String getOrderDate()
    {
	 return dateTimeFormat.format(OrderDate.getTime());	
    }
    public List<OrderItem> getItems()
    {
	return items;
    }
    public Customer getCustomer()
    {
	return customer;
    }
    //Setter
    public void setId(Long id)
    {
	this.id = id;
    }
    public void setOrderDate(Calendar OrderDate)
    {
	this.OrderDate = OrderDate;
    }
    public void setCustomer(Customer customer)
    {
	this.customer = customer;
    }
    public void setItems(List<OrderItem> items)
    {
	this.items = items;
    }
}
