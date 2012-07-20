package Biblioteca;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieLibrary {
    private Output output;
    private Input input;
    // Details of the movie Titles, Directors and Ratings
    String[] Titles = {"COCKTAIL","WANTED","CHRONICLE","AMERICNAN PSYCHO","CONSTANTINE","BOL BACHCHAN","PEARL HARBOR","LITTLE MANHATTEN","THE AMAZING SPIDERMAN","CONTAGION"};
    String[] Director = {"Homi Adajania","Timur Bekmambetoy", "Josh Trank","Mary Haron","Francis Lawrence","Rohit Shetty","Michael Bay", "Mark Levin","Marc Webb", "Steven Soderbergh"};
    String[] Rating = {"RATING","N/A","6.7","7.1","8","8.1","6.9","7.5","8","N/A","8.2"};
    Movie movies[] = new Movie[10];

    public MovieLibrary(Output output, Input input) {
        this.output = output;
        this.input = input;
        output.print("MOVIE LIBRARY");
        createLibraryMovieBank();
        //try {
          //  selectMenuOption();} catch (IOException ioe){System.exit(1);}
    }
    //The method is used to create objects of Movie class in order to make a library movie bank data
    private void createLibraryMovieBank() {
        for(int i = 0; i<10;i++){
            movies[i] = new Movie(Titles[i],Director[i],Rating[i]);
        }
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options\n1. View Movies\n2. Main Menu\n3. Exit");
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    output.print("View Movies");
                    //viewMovies();
                    break;
                }
                else if(menuOption == 2) {
                    new Biblioteca(output,input);
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

    private void viewMovies() {
        for(int i = 0; i<10;i++){
            output.print(movies[i].getTitle()+" "+movies[i].getDirector()+" "+movies[i].getRating()); }
    }
}