/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
package Biblioteca;
import java.lang.*;
public class Output {
    public void print(String display) {
        System.out.println(display);
        System.out.println();
    }
    public void print(String... args){
        int i=1;
        for(String n : args){
                System.out.println(i+". "+n);
            i++;
        }
    }
}
