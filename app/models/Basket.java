package models;

import models.users.*;
import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Basket extends Model {

    @Id
    private Long id;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;

    @OneToOne
    private Customer customer;


    public void addProduct(Product p) {
        boolean itemFound = false;

        for (OrderItem i : basketItems){
            if(i.getProduct().getId() == p.getId()){
		
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false){
            //add orderItem to list
            OrderItem newItem = new OrderItem(p);
            //add to items
            newItem.setQuantity(1);
	    newItem.setPrice(p.getPrice());
	    basketItems.add(newItem);
	    
        }
    }

    public void removeItem(OrderItem item){
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();){
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId())){
                if (i.getQuantity()>1){
                    i.decreaseQty();
                }else{
                    i.delete();
                    iter.remove();
                    break;
                }
            }
        }
    }
    public OrderItem findBasketItem(Product p)
    {
	OrderItem itemWanted = new OrderItem();
	for(OrderItem item : basketItems)
	{
	 if(item.getProduct().getId() == p.getId())
	 {
	  itemWanted = item;
	 }
	}
	return itemWanted;
    }
    //Check Stock
    public boolean checkItemStock(Product p)
    {
	OrderItem itemWanted = findBasketItem(p);
	if(p.getStock() == itemWanted.getQuantity())
	{
	 return true;
	}
	return false;
    } 
    //Getters

    public Long getId() 
    {
    	return id;
    }

    public Customer getCustomer() 
    {
    	return customer;
    }

    public List<OrderItem> getBasketItems() 
    {
    	return basketItems;
    }
    public double getBasketTotal()
    {
	double basketTotal = 0;
	for(OrderItem item : basketItems)
	{
	 basketTotal += item.getItemTotal();
	}
	return basketTotal;	
    }

    //Setters
    public void setId(Long id) 
    {
        this.id = id;
    }

    public void setCustomer(Customer customer)
    {
    	this.customer = customer;
    }

}
