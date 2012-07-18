package Biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Input {
    public int readOption()throws IOException{
        BufferedReader brMenuOption = new BufferedReader(new InputStreamReader(System.in));
        String SMenuOption = brMenuOption.readLine();
        int MenuOption = Integer.parseInt(SMenuOption);
        return MenuOption;
    }
}
