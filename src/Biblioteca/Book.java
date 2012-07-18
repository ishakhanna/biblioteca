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
    public String getTitle(){return(this.Title);}
    public String getAuthor(){return(this.Author);}
    public int getBookCode(){return(this.BookCode);}
}
