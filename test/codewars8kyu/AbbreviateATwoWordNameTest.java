package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviateATwoWordNameTest {
    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName("David Mendieta"));
    }

    @Test
    public void testFixed2() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName2("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName2("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName2("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName2("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName2("David Mendieta"));
    }

    @Test
    public void testFixed3() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName3("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName3("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName3("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName3("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName3("David Mendieta"));
    }

    @Test
    public void testFixed4() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName4("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName4("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName4("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName4("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName4("David Mendieta"));
    }

    @Test
    public void testFixed5() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName5("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName5("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName5("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName5("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName5("David Mendieta"));
    }

    @Test
    public void testFixed6() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName6("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName6("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName6("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName6("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName6("David Mendieta"));
    }
}
