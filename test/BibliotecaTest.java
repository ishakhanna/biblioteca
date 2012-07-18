/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
public class BibliotecaTest {
   @Test
    public void Testprint() throws Exception{
    Output mockOutput = mock(Output.class);
    new Biblioteca(mockOutput,new Input());
    verify(mockOutput).print("Welcome to the Bangalore Public Library System");
    verify(mockOutput).print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
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
}
