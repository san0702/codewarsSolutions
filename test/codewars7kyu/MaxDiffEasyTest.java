package codewars7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDiffEasyTest {
    @Test
    public void BasicTests() {

        assertEquals("only positives", 4, MaxDiffEasy.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, MaxDiffEasy.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, MaxDiffEasy.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, MaxDiffEasy.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, MaxDiffEasy.maxDiff(new int[]{}));
    }

    @Test
    public void BasicTests2() {

        assertEquals("only positives", 4, MaxDiffEasy.maxDiff2(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, MaxDiffEasy.maxDiff2(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, MaxDiffEasy.maxDiff2(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, MaxDiffEasy.maxDiff2(new int[]{ 1000000 }));
        assertEquals("empty", 0, MaxDiffEasy.maxDiff2(new int[]{}));
    }

    @Test
    public void BasicTests3() {

        assertEquals("only positives", 4, MaxDiffEasy.maxDiff3(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, MaxDiffEasy.maxDiff3(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, MaxDiffEasy.maxDiff3(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, MaxDiffEasy.maxDiff3(new int[]{ 1000000 }));
        assertEquals("empty", 0, MaxDiffEasy.maxDiff3(new int[]{}));
    }
}
