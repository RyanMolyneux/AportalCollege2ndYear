package models;


import models.users.Admin;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.Model;

@Entity

@Table(name="Advert")

public class Advert extends Model
{
	//Variables
	@Id
	private Long advertId;
	
	@Column(columnDefinition = "VARCHAR2(60)")
	@Constraints.Required
	private String advertName;
	
	
	private Calendar advertDateAdded;

	
	@ManyToOne
	private Admin advertAdmin;
	
	
	//Constructors
	 //Default
	public Advert()
	{}
	 //Overloaded
	public Advert(Long advertId,String advertName,Calendar advertDateAdded,Admin advertAdmin)
	{
	 this.advertId = advertId;
	 this.advertName = advertName;
	 this.advertDateAdded = advertDateAdded;
	 this.advertAdmin = advertAdmin;
	}	
	//Methods
	 //Entity Object Gather Variables & Methods
	public static Finder<Long,Advert> find = new Finder<Long,Advert>(Advert.class);
	
	public static List<Advert> findAll()
	{
	 return Advert.find.all();
	}
	

	 //Getters
	public Long getAdvertId()
	{
	 return advertId;
	}
	public String getAdvertName()
	{
	 return advertName;
	}
	public Date getAdvertDateAdded()
	{
	 
	 Date time= advertDateAdded.getTime();
	 return time;
	}
	public Admin getAdvertAdmin()
	{
	 return advertAdmin;
	}
	 //Setters
	public void setAdvertId(Long advertId)
	{
	 this.advertId = advertId;
	}
	public void setAdvertName(String advertName)
	{
	 this.advertName = advertName;
	}
	public void setAdvertDateAdded(Calendar advertDateAdded)
	{
	 this.advertDateAdded  = advertDateAdded;
	}
	public void setAdvertAdmin(Admin advertAdmin)
	{
	 this.advertAdmin = advertAdmin;
	}

}
