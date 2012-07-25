package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private String Title;
    private String Director;
    private String Rating;

    public Movie(String Title, String Director, String Rating){
        this.Title = Title;
        this.Director = Director;
        this.Rating = Rating;
    }

    // TODO - use comments if method name not clear enough
    //returns the title of the calling Book object
    public String getTitle(){return(this.Title);}

    //returns the author of the calling Book object
    public String getDirector(){return(this.Director);}

    //returns the book code of the calling book object
    public String getRating(){return(this.Rating);}
}
