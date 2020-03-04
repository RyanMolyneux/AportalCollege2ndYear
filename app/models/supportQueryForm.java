package models;



public class supportQueryForm
{
	//Member Variables
	
	private Long queryTypeId;
	private String description;
	
	
	//Constructors
	 //Default
	public supportQueryForm()
	{
	}
	 //Overloaded
	public supportQueryForm(Long queryTypeId,String description)
	{
	 this.queryTypeId = queryTypeId;
	 this.description = description;
	}
	//Methods
	 //Getters
	public Long getQueryTypeId()
	{
	 return queryTypeId;
	}
	public String getDescription()
	{
	 return description;
	}
	 //Setters
	public void setQueryTypeId(Long queryTypeId)
	{
	 this.queryTypeId = queryTypeId;
	}
	public void setDescription(String description)
	{
	 this.description = description;
	}
}
