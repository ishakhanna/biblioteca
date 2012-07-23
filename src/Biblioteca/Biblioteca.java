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
    --Database for user logins created fo future use
 */
public class Biblioteca {
    private Output output;
    private Input input;

    public Biblioteca(Output output, Input input){
        this.output = output;
        this.input = input;
        output.print("Welcome to the Bangalore Public Library System");

        try {
            selectMenuOption();} catch (IOException ioe){System.exit(1);}
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options");
        //Calling the overloaded method in Output class in order to print the menu
        output.print("Book Library","Movie Library","Exit");
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
                    System.exit(0);
                    break;
                }
                else
                    output.print("Select a Valid Option");

            }catch(IOException ioe) {System.out.println("ERROR");}
        }
    }

    public void checkLibraryNumber()throws IOException{
        output.print("Enter your library number");
        int libraryNumber = input.readOption();
        output.print("Talk to the Librarian");
    }

    public void login()throws IOException{

        LoginAndPasswordDatabase obj = new LoginAndPasswordDatabase();
        output.print("Enter your Login and Password\n Library Number : ");
        String login = input.readOption(0);
        output.print("Password : ");
        String password = input.readOption(0);
        int i;
        for(i=0;i<5;i++){
            if(login.equals(obj.Database[i][0]))
            {
                int trials = 1;
                while (trials < 4){
                if(password.equals(obj.Database[i][1]))
                {    output.print("Login and Password Accepted");
                    break;
                }
                else {output.print("Wrong Password\n Re-enter.");
                    password = input.readOption(0);
                    trials++;
                }
                }
                if(trials==4)output.print("Incorrect Login\nTalk to the Librarian");
                break;
            }
        }
        if(i>4){
            output.print("Incorrect Login\nTalk to the Librarian");
        }
    }

    public static void main(String[] args){
      Output out = new Output();
      Input in = new Input();
      Biblioteca object1 = new Biblioteca(out,in);
        try{object1.checkLibraryNumber();
        object1.login();}catch (Exception e){System.exit(1);}
    }
}