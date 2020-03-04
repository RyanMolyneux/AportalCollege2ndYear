package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import models.users.User;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Topic extends Model {
    // Properties
    // Annotate id as the primary key
    @Id
    private Long topicId;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    @Column(columnDefinition="TEXT(200)")
    private String name;

    @Constraints.Required
    @Column(columnDefinition="TEXT(200)")
    private String description;

    @ManyToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    List<Post> post = new ArrayList<Post>();

    // Default constructor
    public  Topic() {
    }

    // Constructor to initialise object
    public  Topic(Long topicId, String name, String description,User user, List<Post> post) {
	this.topicId = topicId;
        this.name = name;
        this.description = description;
        this.user = user;
	this.post = post;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Topic> find = new Finder<Long,Topic>(Topic.class);

    public static List<Topic> findFilter(String filter) {
        return Topic.find.where().ilike("name", "%" + filter +"%").orderBy( "name").findList();
    }
     
    
    public static List<Topic> findAll() {
        return Topic.find.all();
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDescription(String description) {
        this.description = description;
    } 
    public List<Post> getPost(){ return post; }
    public void setPost(List<Post> post){this.post = post; }


}
