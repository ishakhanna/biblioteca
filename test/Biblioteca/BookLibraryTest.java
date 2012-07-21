package Biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;
/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookLibraryTest {

    @Test
    public void testSelectMenuOption() throws Exception {
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        when(mockInput.readOption()).thenReturn(1).thenReturn(2).thenReturn(5).thenReturn(4);
        (new BookLibrary(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("View Books");
        (new BookLibrary(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Reserve a Book");
        //To avoid program to go in infinite loop I have commented the following command.
        (new BookLibrary(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Select a Valid Option");
        verify(mockOutput).print("Exit");
    }

    @Test
    public void testViewBooks() throws Exception {
        Output mockOutput = mock(Output.class);
        (new BookLibrary(mockOutput,new Input())).viewBooks();
        verify(mockOutput).print("1 Head First Java Kathy Sierra");
        verify(mockOutput).print("2 Complete Reference Java Herbert Schildt");
        verify(mockOutput).print("3 Data Structures with C Tanenbaun");
        verify(mockOutput).print("4 Java SCJP Khalid A Mughal");
        verify(mockOutput).print("5 Fountain Head Ayn Rand");
        verify(mockOutput).print("Please Select one of the following menu options\n1. Reserve a Book\n2. Go to Main Menu\n3. Exit");

    }

    @Test
    public void testSelectSecondMenuOption() throws Exception {
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        // 4th thenReturn() is for avoiding the infinite while loop
        when(mockInput.readOption()).thenReturn(1).thenReturn(3).thenReturn(4).thenReturn(1);
        (new BookLibrary(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Reserve a Book");
        (new BookLibrary(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Exit");
        (new BookLibrary(mockOutput, mockInput)).selectSecondMenuOption();
        verify(mockOutput).print("Select a Valid Option");
    }

    @Test
    public void testReserveBook() throws Exception {
        Output mockOutput = mock(Output.class);
        Input mockInput = mock(Input.class);
        when(mockInput.readOption()).thenReturn(1).thenReturn(7);
        (new BookLibrary(mockOutput,mockInput)).reserveBook();
        verify(mockOutput).print("Thank You! Enjoy the book.");
        (new BookLibrary(mockOutput,mockInput)).reserveBook();
        verify(mockOutput).print("Sorry, we don't have that book yet");
    }
}
