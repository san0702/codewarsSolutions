package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDifferencesInArrayTest {

    @Test
    public void basicTests() {
        assertEquals(9, SumOfDifferencesInArray.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesInArray.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesInArray.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{1}));
    }

    @Test
    public void basicTests2() {
        assertEquals(9, SumOfDifferencesInArray.sumOfDifferences2(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesInArray.sumOfDifferences2(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences2(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesInArray.sumOfDifferences2(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences2(new int[0]));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences2(new int[]{0}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences2(new int[]{-1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences2(new int[]{1}));
    }

    @Test
    public void basicTests3() {
        assertEquals(9, SumOfDifferencesInArray.sumOfDifferences3(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesInArray.sumOfDifferences3(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences3(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesInArray.sumOfDifferences3(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences3(new int[0]));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences3(new int[]{0}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences3(new int[]{-1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences3(new int[]{1}));
    }
}
