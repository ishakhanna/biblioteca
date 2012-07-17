import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
* Created with IntelliJ IDEA.
* User: isha
* Date: 17/7/12
* Time: 12:17 PM
* To change this template use File | Settings | File Templates.
*/
public class Assignment_1_copyTest {
    @Test
    public void testStart() throws Exception {
        Assignment_1_copy o1 = new Assignment_1_copy();
        //assertEquals(o1.Start(6),"Select a valid option!!!");
        //assertEquals(o1.Start(1),"List of Books");
        assertEquals(o1.Start(2),"Enter the Book Code");
        //assertEquals(o1.Start(3),"Exit");
    }
    @Test
    public void testDisplay() throws Exception{
        Assignment_1_copy o1 = new Assignment_1_copy();
        assertEquals(o1.Display(1),"Enter the Book Code");
        assertEquals(o1.Display(2),"Exit");
    }
    @Test
    public void testissueBook() throws Exception{
        Assignment_1_copy o1 = new Assignment_1_copy();
        assertEquals(o1.issueBook(1),"Thank You!! Enjoy the Book.");
        assertEquals(o1.issueBook(12),"Sorry we don't have that book yet.");
    }
}
