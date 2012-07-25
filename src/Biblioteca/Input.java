package Biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 1:50 PM
 */
public class Input {
        public int readOption()throws IOException{
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String userInputString = userInput.readLine();
            //int userInputInt = Integer.parseInt(userInputString);
            return Integer.parseInt(userInputString);
        }

    // For function Overloading
    // TODO - why is parameter i not used in method ?
    public String readOption(int i)throws IOException{
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        //String userInputString = userInput.readLine();
        return userInput.readLine();
    }
}
