package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private String Title;
    private String Author;
    private int BookCode;

    public Book(String Title, String Author, int BookCode){
        this.Title = Title;
        this.Author = Author;
        this.BookCode = BookCode;
    }
    //setBookCode method sets the book code of the calling object to the argument passed
    public void setBookCode(int newBookCode){this.BookCode = newBookCode;}

    //returns the title of the calling Book object
    public String getTitle(){return(this.Title);}

    //returns the author of the calling Book object
    public String getAuthor(){return(this.Author);}

    //returns the book code of the calling book object
    public int getBookCode(){return(this.BookCode);}
}
