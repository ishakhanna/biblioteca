package Biblioteca;
//import BibliotecaProject.Input;
//import BibliotecaProject.Output;
import java.io.IOException;
/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:08 PM
 *
 *  --The customer should see a welcome when they start the application.
    --A customer should have a list of menu options at the start of the application.
    --A customer should be able to select a menu option.
    --A customer should be notified if they do not select a valid option with “Select a valid option!!”
    --A customer should be able to view all books the library has.
    A customer should be able to reserve a book for collection.
    A customer should be notified if their selected book was reserved successfully with “Thank You! Enjoy the book.”
    A customer should be notified if their selected book is not available with “Sorry we don't have that book yet.”
    A customer should be able to check their library number and be notified with “Please talk to Librarian. Thank you.”

 */
public class Biblioteca {
    private Output output;
    private Input input;
    // Details of the book Titles, Authors and Book Codes
    String[] Titles = {"Head First Java","Complete Reference Java","Data Structures with C","Java SCJP","Fountain Head"};
    String[] Authors = {"Kathy Sierra","Herbert Schildt","Tanenbaun","Khalid A Mughal","Ayn Rand"};
    int[] BookCodes = {1,2,3,4,5};
    Book books[] = new Book[5];
    public Biblioteca(Output output, Input input){
        this.output = output;
        this.input = input;
        output.print("Welcome to the Bangalore Public Library System");
        output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
        createLibraryBookBank();
        //try {
          //  selectMenuOption();} catch (IOException ioe){System.exit(1);}
    }

    private void createLibraryBookBank() {
        for(int i = 0; i<5;i++){
            books[i] = new Book(Titles[i],Authors[i],BookCodes[i]);
    }
    }

    // Method to Allow the User to select menu options
    public void selectMenuOption()throws IOException{
        while(true){
        try {int menuOption = input.readOption();
            if(menuOption == 1){
                output.print("View Books");
                viewBooks();
               break;
            }
            else if(menuOption == 2){
                output.print("Reserve a Book");
                //reserveBook();
                break;
            }
            else if(menuOption == 3) {
                output.print("Exit");
                break;
            }
            else
                output.print("Select a Valid Option");

        }catch(IOException ioe) {System.out.println("ERROR");}
    }
    }
    public void viewBooks(){
       for(int i = 0; i<5;i++){
        output.print(books[i].getBookCode()+" "+books[i].getTitle()+" "+books[i].getAuthor()); }
        output.print("Please Select one of the following menu options\n1. Reserve a Book\n2. Go to Main Menu\n3. Exit");
        //try {
        //  selectSecondMenuOption();} catch (IOException ioe){System.exit(1);}
    }
    public static void main(String[] args){
      Output out = new Output();
      Input in = new Input();
      Biblioteca o1 = new Biblioteca(out,in);
    }
}