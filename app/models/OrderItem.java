package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.validation.*;


@Entity
public class OrderItem extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private int quantity;

    @Constraints.Required
    private double price;

    @ManyToOne
    private ShopOrder order;

    @ManyToOne
    private Basket basket;

    @ManyToOne
    private Product product;

    public OrderItem(){

    }

    public OrderItem(Long id, int quantity, double price){
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem(Product product){
        this.product = product;
    }

    public static Finder<Long, OrderItem> find = new Finder<Long,OrderItem>(OrderItem.class);

    public void increaseQty(){
            quantity++;
    }

    public void decreaseQty(){
            quantity--;
    }

    public double getItemTotal(){
        double itemTotal;
        itemTotal = price * quantity;
        return itemTotal;
    }

    
    //Getters
    public Long getId() 
    {
    return id;
    }
    public Product getProduct() 
    {
    return product;
    }
    public Basket getBasket() 
    {
    return basket;
    }
    public ShopOrder getOrder() 
    {
    return order;
    }
    public int getQuantity() 
    {
    return quantity;
    }
    public double getPrice() 
    {
    return price;
    }


    //Setters
    public void setid(Long id)
    {
    this.id = id;
    }
    public void setProduct(Product product)
    {
    this.product = product;
    }
    public void setBasket(Basket basket)
    {
    this.basket = basket;
    }
    public void setOrder(ShopOrder order)
    {
    this.order = order;
    }
    public void setQuantity(int quantity)
    {
    this.quantity = quantity;
    }
    public void setPrice(double price)
    {
    this.price = price;
    }

}
