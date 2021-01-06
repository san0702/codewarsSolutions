package codewars7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareEveryDigitTest {
    @Test
    public void test() {
        assertEquals(811181, SquareEveryDigit.squareDigits(9119));
    }

    @Test
    public void test2() {
        assertEquals(811181, SquareEveryDigit.squareDigits2(9119));
    }

    @Test
    public void test3() {
        assertEquals(811181, SquareEveryDigit.squareDigits3(9119));
    }

    @Test
    public void test4() {
        assertEquals(811181, SquareEveryDigit.squareDigits4(9119));
    }
}
