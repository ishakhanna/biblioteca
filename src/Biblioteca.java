/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:08 PM
 *
 *  --The customer should see a welcome when they start the application.
    --A customer should have a list of menu options at the start of the application.
    A customer should be able to select a menu option.
    A customer should be notified if they do not select a valid option with “Select a valid option!!”
    A customer should be able to view all books the library has.
    A customer should be able to reserve a book for collection.
    A customer should be notified if their selected book was reserved successfully with “Thank You! Enjoy the book.”
    A customer should be notified if their selected book is not available with “Sorry we don't have that book yet.”
    A customer should be able to check their library number and be notified with “Please talk to Librarian. Thank you.”

 */
public class Biblioteca {

    public Biblioteca(Output output){
          output.print("Welcome to the Bangalore Public Library System");
          output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
    }
}
