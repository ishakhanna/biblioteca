package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 11:03 PM
 */
public class Book {
    private String title;
    private String author;
    private int bookCode;

    public Book(String Title, String Author, int BookCode){
        this.title = Title;
        this.author = Author;
        this.bookCode = BookCode;
    }

    public void setBookCode(int newBookCode){this.bookCode = newBookCode;}

    public String getTitle(){return(this.title);}

    public String getAuthor(){return(this.author);}

    public int getBookCode(){return(this.bookCode);}
}
