package codewars8kyu;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumMixedArrayTest {
    SumMixedArray mixedSum = new SumMixedArray();

    @Test
    public void test_1() {
        assertEquals(10, mixedSum.sum(Arrays.asList(5,"5")));
        assertEquals(22, mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
        assertEquals(42, mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(45, mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }

    @Test
    public void test_2() {
        assertEquals(10, mixedSum.sum2(Arrays.asList(5,"5")));
        assertEquals(22, mixedSum.sum2(Arrays.asList(9, 3, "7", "3")));
        assertEquals(42, mixedSum.sum2(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        assertEquals(41, mixedSum.sum2(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(45, mixedSum.sum2(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        assertEquals(41, mixedSum.sum2(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(61, mixedSum.sum2(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }


}
