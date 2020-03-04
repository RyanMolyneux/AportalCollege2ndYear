package models;

import java.util.*;

import javax.persistence.*;



import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


@Entity
@Table(name="QueryType")
public class QueryType extends Model
{
	//Local Variables
	@Id
	private Long queryTypeID;
	
	
	@Constraints.Required
	private String queryTypeName;
	
	@OneToMany
	private List<supportQuery> queryList;
	
	//Constructors
	 //Default
	public QueryType()
	{}
	 //Overloaded
	public QueryType(Long queryTypeID,String queryTypeName,List<supportQuery> queryList)
	{
	 this.queryTypeID = queryTypeID;
	 this.queryTypeName = queryTypeName;
	 this.queryList = queryList;	
	}
	//Methods
	//This is a ebean helper tool to find QueryType obectsin the database
	public static Finder<Long,QueryType> find = new Finder<Long,QueryType>(QueryType.class);
	
	//This is a static method that uses the finder to get all the QueryType objects 	//from the db
	public static List<QueryType> findAll()
	{
	 return QueryType.find.where().orderBy("query_type_id asc").findList();
	}	

	public static Map<String,String> options()
	{
	 LinkedHashMap<String,String> options = new LinkedHashMap();

	 //Gets all the Query type objects from DB & adds them to the options hash map
	 for(QueryType qt: QueryType.findAll())
	 {
	  options.put(qt.getQueryTypeID().toString(),qt.getQueryTypeName());
	 }
	 return options;
	}
	

	 //Getters
	public Long getQueryTypeID()
	{
	 return queryTypeID;
	}
	public String getQueryTypeName()
	{
	 return queryTypeName;
	}
	public List<supportQuery> getQueryList()
	{
	 return queryList;
	}
	 //Setters
	public void setQueryTypeID(Long queryTypeID)
	{
	 this.queryTypeID = queryTypeID;
	}
	public void setQueryName(String queryTypeName)
	{
	 this.queryTypeName = queryTypeName;
	}
	public void setQueryList(List<supportQuery> queryList)
	{
	 this.queryList = queryList;
	}

}
