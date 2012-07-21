package Biblioteca;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookLibrary {
    private Output output;
    private Input input;
    // Details of the book Titles, Authors and Book Codes
    String[] Titles = {"Head First Java","Complete Reference Java","Data Structures with C","Java SCJP","Fountain Head"};
    String[] Authors = {"Kathy Sierra","Herbert Schildt","Tanenbaun","Khalid A Mughal","Ayn Rand"};
    int[] BookCodes = {1,2,3,4,5};
    Book books[] = new Book[5];

    public BookLibrary(Output output, Input input){
        this.output = output;
        this.input = input;
        output.print("BOOK LIBRARY");
        createLibraryBookBank();

        try {
            selectMenuOption();} catch (IOException ioe){System.exit(1);}
    }

    //The method is used to create objects of Book class in order to make a library book bank data
    private void createLibraryBookBank() {
        for(int i = 0; i<5;i++){
            books[i] = new Book(Titles[i],Authors[i],BookCodes[i]);
        }
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Main Menu\n4. Exit");
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    output.print("View Books");
                    viewBooks();
                    break;
                }
                else if(menuOption == 2){
                    output.print("Reserve a Book");
                    reserveBook();
                    break;
                }
                else if(menuOption == 3) {
                    (new Biblioteca(output,input)).selectMenuOption();
                    break;
                }
                else if(menuOption == 4) {
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
                    }catch(IOException ioe){System.out.println("ERROR");}
                    break;
                }
                else if(menuOption == 2){
                    selectMenuOption();
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

    public void reserveBook()throws IOException{
        output.print("Enter the Book Code");
        int bookCode = input.readOption();
        int i;
        for(i=0;i<5;i++){
            if(books[i].getBookCode()==bookCode)               {
                output.print("Thank You! Enjoy the book.");
                books[i].setBookCode(999);
                break;
            }
        }
        if(i>4)output.print("Sorry, we don't have that book yet");
        //checkLibraryNumber();
    }
}