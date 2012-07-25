package Biblioteca;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 10:30 PM
 */
public class MovieLibrary {
    private Output output;
    private Input input;
    // Details of the movie Titles, Directors and Ratings
    String[] Titles = {"COCKTAIL","WANTED","CHRONICLE","AMERICAN PSYCHO","CONSTANTINE","BOL BACHCHAN","PEARL HARBOR","LITTLE MANHATTEN","THE AMAZING SPIDERMAN","CONTAGION","3 IDIOTS","AGNEEPATH","A BEAUTIFUL MIND","THE AVENGERS","MYSTIC RIVER"};
    String[] Director = {"Homi Adajania","Timur Bekmambetoy", "Josh Trank","Mary Haron","Francis Lawrence","Rohit Shetty","Michael Bay", "Mark Levin","Marc Webb", "Steven Soderbergh","Rajkumar Hirani","Karan Malhotra","Ron Hoverd","Joss Whedon","Clint Eastwood"};
    String[] Rating = {"N/A","6.7","7.1","8","8.1","6.9","7.5","8","N/A","8.2","8.3","7.2","8.1","8.7","7.4"};
    Movie movies[] = new Movie[15];

    public MovieLibrary(Output output, Input input) {
        this.output = output;
        this.input = input;
        output.print("MOVIE LIBRARY");
        createLibraryMovieBank();
    }

    public void start(){
        try {
            selectMenuOption();} catch (IOException ioe){System.out.println("ERROR!!");
            System.exit(1);}
    }

    //The method is used to create objects of Movie class in order to make a library movie bank data
    private void createLibraryMovieBank() {
        for(int i = 0; i<15;i++){
            movies[i] = new Movie(Titles[i],Director[i],Rating[i]);
        }
    }

    public void selectMenuOption()throws IOException {
        output.print("Please Select one of the following menu options");
        output.print("View Movies","Main Menu","Exit");
        while(true){
            try {int menuOption = input.readOption();
                if(menuOption == 1){
                    output.print("View Movies");
                    viewMovies();
                    return;
                }
                else if(menuOption == 2) {
                    new Biblioteca(output,input);
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

    public void viewMovies() {
        for(int i = 0; i<15;i++){
            output.print(movies[i].getTitle()+" "+movies[i].getDirector()+" "+movies[i].getRating()); }
    }
}