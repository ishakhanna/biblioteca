package Biblioteca;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:08 AM
 *
 *  --The customer should see a welcome when they start the application.
    --A customer should have a list of menu options at the start of the application.
    --A customer should be able to select a menu option.
    --A customer should be notified if they do not select a valid option with “Select a valid option!!”
    --A customer should be able to view all books the library has.
    --A customer should be able to reserve a book for collection.
    --A customer should be notified if their selected book was reserved successfully with “Thank You! Enjoy the book.”
    --A customer should be notified if their selected book is not available with “Sorry we don't have that book yet.”
    --A customer should be able to check their library number and be notified with “Please talk to Librarian. Thank you.”
    --Implement Movie Library that displays movie name, its director and its rating
 */
public class Biblioteca {
    private Output output;
    private Input input;

    public Biblioteca(Output output, Input input){
        this.output = output;
        this.input = input;

        output.print("Welcome to the Bangalore Public Library System");

       // try {
         //   selectMenuOption();} catch (IOException ioe){System.exit(1);}
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options\n1. Book Library\n2. Movie Library\n3. Exit");
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    new BookLibrary(output,input);
                    break;
                }
                else if(menuOption == 2){
                    new MovieLibrary(output,input);
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

    public static void main(String[] args){
      Output out = new Output();
      Input in = new Input();
      Biblioteca object1 = new Biblioteca(out,in);
    }
}