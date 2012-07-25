package Biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 10:20 PM
 */
public class BookLibrary {
    private Output output;
    private Input input;
    // TODO - read about java collections. Use collection data structure instead.
    // Details of the book Titles, Authors and Book Codes
    String[] Titles = {"Head First Java","Complete Reference Java","Data Structures with C","Java SCJP","Fountain Head"};
    String[] Authors = {"Kathy Sierra","Herbert Schildt","Tanenbaun","Khalid A Mughal","Ayn Rand"};
    int[] BookCodes = {1,2,3,4,5};
    List<Book> books = new ArrayList<Book>();

    public BookLibrary(Output output, Input input){
        this.output = output;
        this.input = input;
        output.print("BOOK LIBRARY");
        createLibraryBookBank();
    }

    public void start() {
        try {
            selectMenuOption();} catch (IOException ioe){System.out.println("EROOR!!");
            System.exit(1);}
    }

    //The method is used to create objects of Book class in order to make a library book bank data
    private void createLibraryBookBank() {
        for(int i = 0; i<5;i++){
            books.add(new Book(Titles[i],Authors[i],BookCodes[i]));
        }
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options");
        output.print("View Books","Reserve a Book","Main Menu","Exit");
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    output.print("View Books");
                    viewBooks();
                    return;
                }
                else if(menuOption == 2){
                    output.print("Reserve a Book");
                    reserveBook();
                    return;
                }
                else if(menuOption == 3) {
                    (new Biblioteca(output,input)).selectMenuOption();
                    return;
                }
                else if(menuOption == 4) {
                    output.print("Exit");
                    return;
                }
                else
                    output.print("Select a Valid Option");

            }catch(IOException ioe) {System.out.println("ERROR");}
        }
    }
    public void viewBooks(){
        for(Book book : books){
            output.print(book.getBookCode() + " " + book.getTitle() + " " + book.getAuthor()); }
        output.print("Please Select one of the following menu options");
        output.print("Reserve a Book","Go to Previous Menu","Exit");
        try {
            selectSecondMenuOption();} catch (IOException ioe){System.exit(1);}
    }
    public void selectSecondMenuOption()throws IOException{
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    output.print("Reserve a Book");
                    try {
                        reserveBook();
                    }catch(IOException ioe){System.out.println("ERROR");
                        System.exit(1);}
                    return;
                }
                else if(menuOption == 2){
                    selectMenuOption();
                    return;
                }
                else if(menuOption == 3) {
                    output.print("Exit");
                    return;
                }
                else
                    output.print("Select a Valid Option");

            }catch(IOException ioe) {System.out.println("ERROR");}
        }
    }

    public void reserveBook()throws IOException{
        output.print("Enter the Book Code");
        int bookCode = input.readOption();
        for(Book book : books){
            if(book.getBookCode()==bookCode)               {
                output.print("Thank You! Enjoy the book.");
                books.remove(book);
                return;
            }
        }
        output.print("Sorry, we don't have that book yet");
    }
}