package models;

import java.util.*;
import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import com.avaje.ebean.Model;
import models.users.User;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Post extends Model {
    // Properties
    // Annotate id as the primary key
    @Id
    private Long id;

    // Other fields marked as being required (for validation purposes)

    @Constraints.Required
    @Column(columnDefinition="TEXT(20000)")
    private String postDescription;

    @ManyToOne
    private User user;

    @Constraints.Required
    private Calendar postDate;

    @ManyToOne
    private Topic topic;

    static final DateFormat dateTimeFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");

    // Default constructor
    public  Post() {
        }

    // Constructor to initialise object
    public  Post(Long id, String postDescription,User user, Topic topic, Calendar postDate) {
        this.id = id;
        this.postDescription = postDescription;
        this.user = user;
        this.topic = topic;
	this.postDate = postDate;
        }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Post> find = new Finder<Long,Post>(Post.class);


    public static List<Post> findAll() {
        return Post.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public User getUser() {
        return user;
        }
    public void setUser(User user) {
        this.user = user;
    }

    public Topic getTopic() {
        return topic;
        }

    public void setTopic(Topic topic) {
        this.topic = topic;
        } 
    public void setPostDate(Calendar postDate){
	this.postDate = postDate;}

    public String getPostDate(){
	return dateTimeFormat.format(postDate.getTime());}

}
