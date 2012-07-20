/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
package Biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
public class BibliotecaTest {

   @Test
    public void testPrint() throws Exception{
    Output mockOutput = mock(Output.class);  // Creating a mock object of Output class to monitor interactions that occur.
    new Biblioteca(mockOutput,new Input());
    verify(mockOutput).print("Welcome to the Bangalore Public Library System"); // Using verify function to check if the print function has got the desired argument
    }

    @Test
    public void testReadOption() throws Exception{
    Input mockInput = mock(Input.class);     // Creating a mock object of Input class to monitor interactions that occur.
    Output mockOutput = mock(Output.class);
    new Biblioteca(mockOutput, mockInput);
    when(mockInput.readOption()).thenReturn(0);  //when function helps us to return the desired value whenever a function is invoked
    assertEquals(mockInput.readOption(),0);
    }

   @Test
    public void testSelectMenuOption() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        when(mockInput.readOption()).thenReturn(1).thenReturn(2).thenReturn(5).thenReturn(3);
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("BOOK LIBRARY");
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("MOVIE LIBRARY");
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Select a Valid Option");
       //To avoid program to go in infinite loop I have commented the following command.
        //(new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Exit");
    }
}

