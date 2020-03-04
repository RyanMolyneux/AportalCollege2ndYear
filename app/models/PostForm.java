package models;


public class PostForm
{
	//Member Variables
	String postDescription;
	Long postTopicId;
	//Getters
	public String getPostDescription()
	{
	 return postDescription;
	}
	public Long getPostTopicId()
	{
	 return postTopicId;
	}
	//Setters
	public void setPostDescription(String postDescription)
	{
	 this.postDescription = postDescription;
	}
	public void setPostTopicId(Long postTopicId)
	{
	 this.postTopicId = postTopicId;
	}

}
