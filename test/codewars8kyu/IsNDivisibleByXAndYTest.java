package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsNDivisibleByXAndYTest {
    @Test
    public void test1() {
        assertTrue(IsNDivisibleByXAndY.isDivisible(12, 4, 3));
        assertFalse(IsNDivisibleByXAndY.isDivisible(3, 3, 4));
        assertTrue(IsNDivisibleByXAndY.isDivisible(3, 1, 3));
        assertTrue(IsNDivisibleByXAndY.isDivisible(12, 2, 6));
        assertFalse(IsNDivisibleByXAndY.isDivisible(100,5,3));
        assertFalse(IsNDivisibleByXAndY.isDivisible(12,7,5));
    }

}
