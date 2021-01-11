package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
        assertArrayEquals(new int[] {1,2,3,4,5}, ConvertNumberToReversedArrayOfDigits.digitize(54321));
        assertArrayEquals(new int[] {6,6,5,3,3}, ConvertNumberToReversedArrayOfDigits.digitize(33566));

    }

    @Test
    public void tests2() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize2(35231));
        assertArrayEquals(new int[] {1,2,3,4,5}, ConvertNumberToReversedArrayOfDigits.digitize2(54321));
        assertArrayEquals(new int[] {6,6,5,3,3}, ConvertNumberToReversedArrayOfDigits.digitize2(33566));
    }
}
