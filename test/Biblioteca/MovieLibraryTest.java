package Biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieLibraryTest {
    @Test
    public void testSelectMenuOption() throws Exception {
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        when(mockInput.readOption()).thenReturn(1).thenReturn(5).thenReturn(3);
        (new MovieLibrary(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("View Movies");
        (new MovieLibrary(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Select a Valid Option");
        //To avoid program to go in infinite loop I have commented the following command.
        //(new Biblioteca(mockOutput, mockInput)).selectMenuOption();
        verify(mockOutput).print("Exit");
    }
}