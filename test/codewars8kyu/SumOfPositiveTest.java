package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfPositiveTest {

    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumOfPositive.sum(new int[]{-1,2,3,4,-5}));
    }

    @Test
    public void testSomething2() {
        assertEquals(15, SumOfPositive.sum2(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive.sum2(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive.sum2(new int[]{}));
        assertEquals(0, SumOfPositive.sum2(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumOfPositive.sum2(new int[]{-1,2,3,4,-5}));
    }
}
