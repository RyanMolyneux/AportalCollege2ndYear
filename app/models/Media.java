package models;

import java.util.*;
import javax.persistence.*;
import javax.validation.Constraint;

import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class Media extends Model{

    @Id
    private Long media_ID;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String title;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "media")
    private List<Genre> genre = new ArrayList<>();

    private List<Long> genSelect = new ArrayList<Long>();

    @Column(columnDefinition="VARCHAR2(1000)")
    @Constraints.Required
    private String mediaDescription;

    @Constraints.Required
    private Long	mediaRating;

    @Constraints.Required
    private String animeURL;

    @Constraints.Required
    private String mangaURL;

    public Media() {
    }

    public Media(Long media_ID, String title, List<Genre> genre, String mediaDescription, Long mediaRating, String animeURL, String mangaURL) {
        this.media_ID = media_ID;
        this.title = title;
        this.genre = genre;
        this.mediaDescription = mediaDescription;
        this.mediaRating = mediaRating;
        this.animeURL = animeURL;
        this.mangaURL = mangaURL;
    }


    public static Finder<Long,Media> find = new Finder<Long,Media>(Media.class);

    public static List<Media> findAll() {
        return Media.find.all();
    }


    public static List<Media> findAll(String filter) {
        return Media.find.where().ilike("title", "%" + filter +"%").orderBy( "title").findList();
    }

    public static List<Media> findFilter(Long genID, String filter) {
        return Media.find.where().eq("genre.genre_ID", genID).ilike("title", "%" + filter + "%").orderBy( "title").findList();
    }
    //Find Top Media
    public static List<Media> findTopMedia()
    {
     
	List<Media> allMedia = findAll();
	List<Media> topMedia = new ArrayList<Media>();
	if(allMedia.size() !=0)
	{
		topMedia.add(allMedia.get(0));	
		topMedia.add(allMedia.get(1));
		topMedia.add(allMedia.get(2));
	}
	for(int x=0;x<topMedia.size();x++)
	{	
		for(int i=1;i<allMedia.size();i++)
		{
			if( x == 0 && topMedia.get(x).getMediaRating() < allMedia.get(i).getMediaRating())
			{
			 topMedia.set(x,allMedia.get(i));
			} else if(x == 1 && topMedia.get(x).getMediaRating() < allMedia.get(i).getMediaRating() && i != allMedia.indexOf(topMedia.get(0)))
			{
			 topMedia.set(x,allMedia.get(i));
			}
			else if(x == 2 && topMedia.get(x).getMediaRating() < allMedia.get(i).getMediaRating() && i != allMedia.indexOf(topMedia.get(0)) && i != allMedia.indexOf(topMedia.get(1)))
			{
			 topMedia.set(x,allMedia.get(i));
			}
		
			
		}
	
		
	}
	return topMedia;
      
   }



    public Long getMedia_ID() {
        return media_ID;
    }

    public void setMedia_ID(Long media_ID) {
        this.media_ID = media_ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setMedia(List<Genre> genre) {
        this.genre = genre;
    }

    public String getMediaDescription() {
        return mediaDescription;
    }

    public void setMediaDescription(String mediaDescription) {
        this.mediaDescription = mediaDescription;
    }

    public Long getMediaRating() {
        return mediaRating;
    }

    public void setMediaRating(Long mediaRating) {
        this.mediaRating = mediaRating;
    }

    public String getAnimeURL() {
        return animeURL;
    }

    public void setAnimeURL(String animeURL) {
        this.animeURL = animeURL;
    }

    public String getMangaURL() {
        return mangaURL;
    }

    public void setMangaURL(String mangaURL) {
        this.mangaURL = mangaURL;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }

    public List getGenSelect()
    {
        return genSelect;
    }

    public String printGenList()
    {
        String genres = "";
        for(Genre gen: genre)
        {

            genres+= " "+gen.getGenre() + ",";

        }
        return genres+"";
    }
}
