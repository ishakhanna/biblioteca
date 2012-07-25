package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 5:54 PM
 */
public class Movie {
    private String title;
    private String director;
    private String rating;

    public Movie(String title, String director, String rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle(){return(this.title);}

    public String getDirector(){return(this.director);}

    public String getRating(){return(this.rating);}
}
