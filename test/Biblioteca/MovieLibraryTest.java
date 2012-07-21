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

    @Test
    public void testViewMovies() throws Exception{
        Output mockOutput = mock(Output.class);
        (new MovieLibrary(mockOutput,new Input())).viewMovies();
        verify(mockOutput).print("COCKTAIL Homi Adajania N/A");
        verify(mockOutput).print("WANTED Timur Bekmambetoy 6.7");
        verify(mockOutput).print("CHRONICLE Josh Trank 7.1");
        verify(mockOutput).print("AMERICAN PSYCHO Mary Haron 8");
        verify(mockOutput).print("CONSTANTINE Francis Lawrence 8.1");
    }
}