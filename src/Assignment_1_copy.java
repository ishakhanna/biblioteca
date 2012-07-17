/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 16/7/12
 * Time: 7:39 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.IOException;
import java.util.ArrayList;

public class Assignment_1_copy {

    //Array Lists to save the Available and Unavailable books in the Library
    String result;
    ArrayList<Integer> availableBooks = new ArrayList<Integer>();
    ArrayList<Integer> unavailableBooks = new ArrayList<Integer>();
    String[] BOOKS = {"01. Head First Java by Kathy Sierra","02. Java Student Workbook","03. Complete Reference Java","04. Java SCJP by Khalid A MUghal","05. Data Structures by R.S. Salaria","06. Schaum Series for Data Structures","07. Data Structures by Tanenbaum"};

    public Assignment_1_copy(){

        System.out.println("\nWelcome to the Bangalore Public Library System\n");
        System.out.println("Please Select one of the following menu options\n");
        System.out.println("1.View All Books\n2.Issue a Book\n3.Exit\n");
        //Adding the books to the available array list
        for(int j = 1; j<8;j++){availableBooks.add(j);}
    }

    public String Start(int i) throws IOException{

        switch(i){
            case 1 : try { result = "List of Books";
                viewBooks();} catch(IOException ioe) {System.exit(1);}
                break;

            case 2 : result = "Enter the Book Code";
                System.out.println(result + "\n");
                //issueBook();
                break;

            case 3 : result = "Exit";
                break;

            default :  result = "Select a valid option!!!";
                System.out.println(result);
        }
        return result;
    }

    //Method to display all books present in the library
    public void viewBooks() throws IOException{
        System.out.println(result);
        for(String str : BOOKS)
            System.out.println(str);
    }
    // To display the further menu options
    public String Display(int i) throws IOException {
        System.out.println("Press 1 to Issue a Book\n Press 2 to exit");
        switch(i){
            case 1 : result = "Enter the Book Code";
                System.out.println(result + "\n");
                break;

            case 2 : result = "Exit";
                break;

            default : System.out.println("Select a valid option!!!");
        }
        return result;
    }
    //Method to issue a book
    public String issueBook(int bookCode) throws IOException
    {
        if(availableBooks.contains(bookCode))
        {
            unavailableBooks.add(bookCode);	//As a user reserves a book the book is added to unavailable list
            availableBooks.remove(bookCode);   // the book is deleted from the available books' list
            result = "Thank You!! Enjoy the Book.";
            System.out.println(result);
        }
        else{ result = "Sorry we don't have that book yet.";
            System.out.println(result);}
        //System.out.println("Enter your Library Number");

        //Reading the library number of the user
        //BufferedReader brLibNum = new BufferedReader(new InputStreamReader(System.in));
        //String SLibNum = brLibNum.readLine();
        //System.out.println("Please talk to the Librarian. Thank You");
        return result;
    }

    public static void main(String args[]){
    }
}