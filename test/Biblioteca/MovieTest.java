package Biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 20/7/12
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    Movie sampleMovie = new Movie("Shanghai","Dibakar Banerjee","7.1");
    @Test
    public void testGetTitle() throws Exception {
        assertEquals(sampleMovie.getTitle(),"Shanghai");
    }

    @Test
    public void testGetDirector() throws Exception {
        assertEquals(sampleMovie.getDirector(),"Dibakar Banerjee");
    }

    @Test
    public void testGetRating() throws Exception {
        assertEquals(sampleMovie.getRating(),"7.1");
    }
}
