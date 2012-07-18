/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 18/7/12
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;
import java.lang.*;
import static org.mockito.Mockito.*;
public class BibliotecaTest {

    @Test
    public void TestStart() throws Exception{
    Output mockOutput = mock(Output.class);
    new Biblioteca(mockOutput);
    verify(mockOutput).print("Welcome to the Bangalore Public Library System");
    verify(mockOutput).print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
    }
}
