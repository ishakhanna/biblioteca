// TODO - java naming convention for naming package
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
    }

    public void start(){
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
                    (new BookLibrary(output,input)).start();
                    return;
                }
                else if(menuOption == 2){
                    (new MovieLibrary(output,input)).start();
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

    public void checkLibraryNumber()throws IOException{
        output.print("Enter your library number");
        int libraryNumber = input.readOption();
        output.print("Your Library Number "+libraryNumber+" Talk to the Librarian");
    }

    public void login()throws IOException{

        LoginAndPasswordDatabase loginObject = new LoginAndPasswordDatabase();
        output.print("Enter your Login and Password\n Library Number : ");
        String login = input.readOption(0);
        output.print("Password : ");
        String password = input.readOption(0);
        this.checkLogin(loginObject, login, password);
    }

    public void checkLogin(LoginAndPasswordDatabase loginObject,String login,String password){
        int i;
        for(i=0;i<5;i++){
            if(login.equals(loginObject.Database[i][0])&&password.equals(loginObject.Database[i][1]))
            {
                output.print("Login and Password Accepted");
                return;
            }
        }
            output.print("Incorrect Login\nTalk to the Librarian");
    }
    public static void main(String[] args){
        Output out = new Output();
        Input in = new Input();
        Biblioteca bibliotecaObject = new Biblioteca(out,in);
        bibliotecaObject.start();
        try{
            bibliotecaObject.checkLibraryNumber();
            bibliotecaObject.login();}catch (Exception e){System.out.println("ERROR!!");
            System.exit(1);}
    }
}