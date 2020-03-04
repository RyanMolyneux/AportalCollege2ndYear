package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Genre extends Model{
    @Id
    private Long genre_ID;

    @Constraints.Required
    private String genre;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Media> media;

    public Genre() {
    }

    public Genre(Long genre_ID, String genre, List<Media> media) {
        this.setGenre_ID(genre_ID);
        this.setGenre(genre);
        this.setMedia(media);
    }

    public static Boolean inGenre(Long gen,Long med)
    {
        return find.where().eq("media.id", med).eq("id",gen).findRowCount()>0;
    }


    public static Finder<Long,Genre> find = new Finder<Long,Genre>(Genre.class);

    //Find all Products in the database in ascending order by name
    public static List<Genre> findAll() {
        return Genre.find.where().orderBy("genre asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        // Get all categories from the DB and add to the options Hash map
        for(Genre g: Genre.findAll()) {
            options.put(g.getGenre_ID().toString(), g.getGenre());
        }
        return options;
    }

    public Long getGenre_ID() {
        return genre_ID;
    }

    public void setGenre_ID(Long genre_ID) {
        this.genre_ID = genre_ID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public static List getGenConv(List<Long> genSelect)
    {

        List<Genre> genres = new ArrayList<Genre>();

        for(int i=0;i<genSelect.size();i++)
        {
            genres.add(find.byId(genSelect.get(i)));
        }
        return genres;
    }
}
