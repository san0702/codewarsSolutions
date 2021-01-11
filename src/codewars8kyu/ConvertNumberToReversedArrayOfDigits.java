package codewars8kyu;

import java.util.Arrays;

/**
 *Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * Example:
 * 348597 => [7,9,5,8,4,3]
 * https://www.codewars.com/kata/5583090cbe83f4fd8c000051/solutions/java
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String s = Long.toString(n);
        s = new StringBuilder(s).reverse().toString();
        return Arrays.stream(s.split("")).mapToInt(x-> Integer.parseInt(x)).toArray();
    }

    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
