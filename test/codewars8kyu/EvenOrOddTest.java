package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(EvenOrOdd.even_or_odd(6), "Even");
        assertEquals(EvenOrOdd.even_or_odd(7), "Odd");
    }


}
