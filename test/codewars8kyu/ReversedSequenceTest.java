package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReversedSequenceTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse(5));
        assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, ReversedSequence.reverse(10));
        assertArrayEquals(new int[]{3,2,1}, ReversedSequence.reverse(3));
    }

    @Test
    public void simpleTest2() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse2(5));
        assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, ReversedSequence.reverse2(10));
        assertArrayEquals(new int[]{3,2,1}, ReversedSequence.reverse2(3));
    }

    @Test
    public void simpleTest3() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse3(5));
        assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, ReversedSequence.reverse3(10));
        assertArrayEquals(new int[]{3,2,1}, ReversedSequence.reverse3(3));
    }

    @Test
    public void simpleTest4() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse4(5));
        assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, ReversedSequence.reverse4(10));
        assertArrayEquals(new int[]{3,2,1}, ReversedSequence.reverse4(3));
    }
}
