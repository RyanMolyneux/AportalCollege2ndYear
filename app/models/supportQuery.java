package models;



import javax.persistence.*;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import models.users.Customer;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class supportQuery extends Model
{
	//Local Variables
	@Id
	private Long queryID;
		
	@ManyToOne
	private QueryType queryType;

	@Constraints.Required
	@Column(columnDefinition="VARCHAR2(2000)")
	private String queryDescription;
	/*This is the customer that sent the query.*/	
	@ManyToOne
	@Constraints.Required	
	private Customer queryingCustomer;
	
	
	@Constraints.Required
	private Calendar queryDate;
	
	@Constraints.Required	
	private boolean queryStatus;

	static final DateFormat dateTimeFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
	
	//Constructors
	 //Default
	public supportQuery()
	{}
	 //Overloaded
	public supportQuery(Long queryID,QueryType queryType,String queryDescription,Customer queryingCustomer,Calendar queryDate)
	{
		this.queryID = queryID;
		this.queryType = queryType;
		this.queryDescription = queryDescription;
		this.queryingCustomer = queryingCustomer;
		this.queryDate = queryDate;
		this.queryStatus = false;
	}
	//Finder Very Useful for returning entity objects of type object your using from the db.
	public static Finder<Long,supportQuery> find = new Finder<Long,supportQuery>(supportQuery.class);

	//Used to gather all the query's from the DataBase
	public static List<supportQuery> findAll() {
		return supportQuery.find.where().orderBy("query_id asc").findList();	
	
	}


	//Methods
	 //Getters
	public Long getQueryID()
	{
	 return queryID;
	}
	public QueryType getQueryType()
	{
	 return queryType;
	}
	public String getQueryDescription()
	{
	 return queryDescription;
	}
	public Customer getQueryingCustomer()
	{
	 return queryingCustomer;
	}
	public String getQueryDate()
	{
	return dateTimeFormat.format(queryDate.getTime());

	}
	public boolean getQueryStatus()
	{
	 return queryStatus;
	}
	public String printQueryDate()
	{
	 return queryDate.toString();
	}
	 //Setters
	public void setQueryID(Long queryID)
	{
	 this.queryID = queryID;
	}
	public void setQueryType(QueryType queryType)
	{
	 this.queryType = queryType;
	}
	public void setQueryDescription(String queryDescription)
	{
	 this.queryDescription = queryDescription;
	}
	public void setQueryingCustomer(Customer queryingCustomer)
	{
	 this.queryingCustomer = queryingCustomer;
	}
	public void setQueryDate(Calendar queryDate)
	{
	 this.queryDate = queryDate;
	}
	public void setQueryStatus(boolean queryStatus)
	{
	 this.queryStatus = queryStatus;
	}
	

}

