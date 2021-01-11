package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPlusArrayTest {
    @Test
    public void sampleTests() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    public void sampleTests2() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray2(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray2(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray2(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray2(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    public void sampleTests3() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray3(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray3(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray3(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray3(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    public void sampleTests4() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray4(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray4(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray4(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray4(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}
