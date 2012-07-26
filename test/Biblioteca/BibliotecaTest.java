/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:09 PM
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
    when(mockInput.readOptionString()).thenReturn(0);  //when function helps us to return the desired value whenever a function is invoked
    assertEquals(mockInput.readOptionString(),0);
    }

   @Test
    public void testSelectMenuOption() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        when(mockInput.readOptionString()).thenReturn(1).thenReturn(2).thenReturn(5).thenReturn(3);
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

    @Test
    public void testCheckLibraryNumber() throws Exception {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.readOptionString()).thenReturn(123);
        (new Biblioteca(mockOutput,mockInput)).checkLibraryNumber();
        verify(mockOutput).print("Enter your library number");
        verify(mockOutput).print("Your Library Number 123 Talk to the Librarian");

    }

    @Test
    public void testLogin() throws Exception{
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.readOptionInt()).thenReturn("111-1111").thenReturn("abc").thenReturn("111-1111").thenReturn("xyz");
        (new Biblioteca(mockOutput,mockInput)).login();
        verify(mockOutput).print("Enter your Login and Password\n Library Number : ");
        verify(mockOutput).print("Password : ");
        (new Biblioteca(mockOutput,mockInput)).login();
        verify(mockOutput).print("Incorrect Login\nTalk to the Librarian");
    }
}

