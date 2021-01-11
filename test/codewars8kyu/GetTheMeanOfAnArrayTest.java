package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetTheMeanOfAnArrayTest {
    @Test
    public void simpleTest() {
        assertEquals(2,GetTheMeanOfAnArray.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,GetTheMeanOfAnArray.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,GetTheMeanOfAnArray.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    @Test
    public void simpleTest2() {
        assertEquals(2,GetTheMeanOfAnArray.getAverage2(new int[] {2,2,2,2}));
        assertEquals(3,GetTheMeanOfAnArray.getAverage2(new int[] {1,2,3,4,5}));
        assertEquals(1,GetTheMeanOfAnArray.getAverage2(new int[] {1,1,1,1,1,1,1,2}));
    }

    @Test
    public void simpleTest3() {
        assertEquals(2,GetTheMeanOfAnArray.getAverage3(new int[] {2,2,2,2}));
        assertEquals(3,GetTheMeanOfAnArray.getAverage3(new int[] {1,2,3,4,5}));
        assertEquals(1,GetTheMeanOfAnArray.getAverage3(new int[] {1,1,1,1,1,1,1,2}));
    }
}
