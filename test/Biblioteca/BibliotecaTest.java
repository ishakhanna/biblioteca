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
    public void Testprint() throws Exception{
    Output mockOutput = mock(Output.class);
    new Biblioteca(mockOutput,new Input());
    verify(mockOutput).print("Welcome to the Bangalore Public Library System");
    //verify(mockOutput).print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
    }

    @Test
    public void TestreadOption() throws Exception{
    Input mockInput = mock(Input.class);
    Output mockOutput = mock(Output.class);
    new Biblioteca(mockOutput, mockInput);
    when(mockInput.readOption()).thenReturn(0);
    assertEquals(mockInput.readOption(),0);
    }

    @Test
    public void TestselectMenuOption() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        when(mockInput.readOption()).thenReturn(3).thenReturn(5).thenReturn(1).thenReturn(2);
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Exit");
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Select a Valid Option");
        //(new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("View Books");
        (new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Reserve a Book");
    }

    @Test
    public void TestviewBooks() {
        Output mockOutput = mock(Output.class);
        (new Biblioteca(mockOutput,new Input())).viewBooks();
        verify(mockOutput).print("1 Head First Java Kathy Sierra");
        verify(mockOutput).print("2 Complete Reference Java Herbert Schildt");
        verify(mockOutput).print("3 Data Structures with C Tanenbaun");
        verify(mockOutput).print("4 Java SCJP Khalid A Mughal");
        verify(mockOutput).print("5 Fountain Head Ayn Rand");
        verify(mockOutput).print("Please Select one of the following menu options\n1. Reserve a Book\n2. Go to Main Menu\n3. Exit");

    }

    @Test
    public void TestselectSecondMenuOption() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        // 4 thenReturn() is for avoiding the infinite while loop
        when(mockInput.readOption()).thenReturn(1).thenReturn(3).thenReturn(4).thenReturn(1);
        (new Biblioteca(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Reserve a Book");
        (new Biblioteca(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Exit");
        (new Biblioteca(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Select a Valid Option");
    }

    @Test
    public void TestreserveBook() throws Exception{
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.readOption()).thenReturn(1).thenReturn(7);
        (new Biblioteca(mockOutput,mockInput)).reserveBook();
        verify(mockOutput).print("Thank You! Enjoy the book.");
        (new Biblioteca(mockOutput,mockInput)).reserveBook();
        verify(mockOutput).print("Sorry, we don't have that book yet");
    }

    @Test
    public void TestcheckLibraryNumber()throws Exception{
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.readOption()).thenReturn(123);
        (new Biblioteca(mockOutput,mockInput)).checkLibraryNumber();
        verify(mockOutput).print("Enter your library number");
        verify(mockOutput).print("Talk to the Librarian");

    }
}
