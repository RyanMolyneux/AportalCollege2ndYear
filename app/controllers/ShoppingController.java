package controllers;


import play.mvc.*;
import play.db.ebean.Transactional;
import models.OrderItem;
import play.mvc.Result;
import views.html.*;
import java.util.Calendar;
import java.util.List;
import java.util.Iterator;
import models.ShopOrder;
import models.Basket;
import models.Product;
import models.users.Customer;
import models.users.User;



public class ShoppingController extends Controller{


    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    @Transactional
    public Result showBasket(){
	try
	{
	 if(getUserFromSession() instanceof Customer)
	 {
	  Customer currentCustomer = (Customer)getUserFromSession();
	  Basket currentCustomerBasket = currentCustomer.getBasket();
	  List<OrderItem> orderItems = currentCustomerBasket.getBasketItems();
	  Iterator<OrderItem> items = orderItems.iterator();
	  
	  while(items.hasNext()) 
	  {
	   Product currentProduct = items.next().getProduct();
	   
	   if(currentProduct.getStock() == 0)
	   {
	    items.remove();
	   }
	  }
	  currentCustomerBasket.update();
	  double total = currentCustomer.getBasket().getBasketTotal()*100;
          return ok(cart.render(currentCustomer,total));
	 } else
	 {
	  flash("error","You must be Signed Up & In to use this feature.");
	  return redirect(controllers.routes.HomeController.index());
	 }	
	} catch(Exception ex)
	{
	 flash("error","You must be Signed Up & In to use this feature.");
	 return redirect(controllers.routes.HomeController.index());
	}
    }

    @Transactional
    public Result addToBasket(Long id) {
	if(getUserFromSession() instanceof Customer)
	{
        	Product p = Product.find.byId(id);
		if(p.getStock()>0)
		{

        		Customer customer = (Customer)getUserFromSession();

        		if (customer.getBasket() == null) {
           		 customer.setBasket(new Basket());
            		 customer.getBasket().setCustomer(customer);
            		 customer.update();
        		}

        		customer.getBasket().addProduct(p);
        		customer.update();
		    	double total = customer.getBasket().getBasketTotal()*100;


        		return ok(cart.render(customer,total));
		} else
		{
	 	 flash("error","Sorry but this Item is currently out of stock.");
	 	 return redirect(controllers.routes.HomeController.index());
		}
	} else
	{
	 flash("error","You must be Signed Up & In to use this feature.");
	 return redirect(controllers.routes.HomeController.index());
	}
    }

    @Transactional
    public Result viewOrders(){
	return ok(viewOrders.render((Customer) getUserFromSession()));
    }


    @Transactional
    public Result addOne(Long itemId)
    {	
      if(getUserFromSession() instanceof Customer)
      {
       OrderItem item = OrderItem.find.byId(itemId);
       Customer currentCustomer = (Customer) getUserFromSession();
       if(currentCustomer.getBasket().checkItemStock(item.getProduct()) == false)
       {
      	  item.increaseQty();
     	  item.update();
     	  return redirect(routes.ShoppingController.showBasket());
       } else
       {
	  flash("error","Sorry but there is not enough in stock at this moment in time.");
	  return redirect(routes.ShoppingController.showBasket());
       }
      } else
      {
	 flash("error","Sorry but you must be Signed Up & In to use this feature.");
	 return redirect(controllers.routes.HomeController.index());
      }
     
    }
    @Transactional
    public Result removeOne(Long itemId){
        OrderItem item = OrderItem.find.byId(itemId);
        Customer c = (Customer)getUserFromSession();
        c.getBasket().removeItem(item);
        c.getBasket().update();
        return redirect(routes.ShoppingController.showBasket());
    }
    public Result placeOrder()
    {	
	if(getUserFromSession() instanceof Customer)
	{
		Customer currentCustomer = (Customer) getUserFromSession();
		boolean itemOutStock = false;
		for(OrderItem item :currentCustomer.getBasket().getBasketItems()) 
		{
			if(item.getProduct().getStock() == 0) 
			{
			 itemOutStock = true;
			}
		}

		if(currentCustomer.getBasket().getBasketItems().size() !=0 && itemOutStock != true)
		{
			ShopOrder order = new ShopOrder();	
		
			order.setCustomer(currentCustomer);
		
			order.setItems(currentCustomer.getBasket().getBasketItems());
		
			order.setOrderDate(Calendar.getInstance());

			order.save();

			for(OrderItem item : order.getItems())
			{
				item.setOrder(order);
				item.setBasket(null);
				Product decProd = Product.find.ref(item.getProduct().getId());
				decProd.decrementStock(item.getQuantity());
				decProd.update();
				item.update();
			}
			
			order.update();

			flash("success","Your order has been successfully made.");
			return redirect(routes.ShoppingController.showBasket());
		} else
		{
		 flash("error","Sorry looks like something went wrong please try again.");
		 return redirect(routes.ShoppingController.showBasket());
		}
	
	} else
	{
	 flash("error","Sorry but you must be Signed Up & In to use this feature.");
	 return redirect(controllers.routes.HomeController.index());
	}



    }



}
