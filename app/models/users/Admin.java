package models.users;


import models.*;
import java.util.*;

import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.Model;

@Entity

@Table(name = "User")

@DiscriminatorValue("admin")

public class Admin extends User
{

	@OneToMany
	List<Advert> adverts = new ArrayList<Advert>();

	public Admin()
	{
	}

	public Admin(String role,String email,String name,String password,List<Topic> topic, List<Post> post)
	{
		super(role,email,name,password,topic,post);
	}
	//Methods
	public List getAdverts()	
	{
	 return adverts;
	}	
	public void setAdverts(List<Advert>adverts)
	{
	 this.adverts = adverts;
	}

}
