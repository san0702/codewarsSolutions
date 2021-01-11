package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuarterOfTheYearTest {
    @Test
    public void exampleTests() {
        assertEquals(1, QuarterOfTheYear.quarterOf(3));
        assertEquals(3, QuarterOfTheYear.quarterOf(8));
        assertEquals(4, QuarterOfTheYear.quarterOf(11));

    }

    @Test
    public void exampleTests2() {
        assertEquals(1, QuarterOfTheYear.quarterOf2(3));
        assertEquals(3, QuarterOfTheYear.quarterOf2(8));
        assertEquals(4, QuarterOfTheYear.quarterOf2(11));

    }
}
