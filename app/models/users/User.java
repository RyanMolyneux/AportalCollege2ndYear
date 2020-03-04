package models.users;

import java.util.*;
import javax.persistence.*;


import models.Post;
import models.Topic;
import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
import play.Logger;

// Product Entity managed by the ORM
@Entity


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="role")


public class User extends Model {


    
    @Column(insertable=false,updatable=false)
    private String role;    

    @Id
    @Column(columnDefinition="VARCHAR2(255)")
    private String email;
   
    @Column(columnDefinition="VARCHAR2(255)")
    @Constraints.Required
    private String name;

    @Column(columnDefinition="VARCHAR2(1000)")
    @Constraints.Required
    private String password;

    @OneToMany
    private List<Topic> topic = new ArrayList<Topic>();

    @OneToMany
    List<Post> post = new ArrayList<Post>();

    public User()
    {

    }
    //Overloaded Constructors
    public User(String role,String email,String name,String password,List<Topic> topic, List<Post> post)
    {
    	
	this.role = role;
	this.email = email;
	this.name = name;
	this.password = password;
    	this.topic = topic;
	this.post = post;
	
    }

    //Generic query helper for entity User with unique id String
    public static Finder<String,User> find = new Finder<String,User>(User.class);

    // Find all Users in the database
    public static List<User> findAll() {
        return User.find.all();
    }

    // Static method to authenticate based on username and password
    // Returns user object if found, otherwise NULL
    public	static User authenticate(String email, String password) {
        // If found return the user object with matching username and password
        return find.where().eq("email", email).eq("password", password).findUnique();
    }

    // Check if a user is logged in (by id - email address)
    public static User getUserById(String id) {
        if (id == null)
            return null;
        else
            // Find user by id and return object
            return find.byId(id);
    }

    public String getEmail() 
    {
        return email;
    }
    public String getRole() 
    {
        return role;
    }
    public String getName() 
    {
        return name;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public void setRole(String role)
    {
	this.role = role;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public List<Topic> getTopic() {
        return topic;
    }

    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPosts(List<Post> post) {
        this.post = post;
    }
}
