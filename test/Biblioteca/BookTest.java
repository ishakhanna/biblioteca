package Biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 19/7/12
 * Time: 1:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {
    Book sampleBook = new Book("Test Driven Development","Kent Beck",101);
    @Test
    public void testSetBookCode() throws Exception {
        sampleBook.setBookCode(200);
        assertEquals(sampleBook.getBookCode(),200);

    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals(sampleBook.getTitle(),"Test Driven Development");
    }

    @Test
    public void testGetAuthor() throws Exception {
        assertEquals(sampleBook.getAuthor(),"Kent Beck");
    }

    @Test
    public void testGetBookCode() throws Exception {
        assertEquals(sampleBook.getBookCode(),101);
    }
}