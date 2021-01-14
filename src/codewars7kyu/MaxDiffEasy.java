package codewars7kyu;

import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 *You must implement a function that return the difference between the
 * biggest and the smallest value in a list(lst) received as parameter.
 *
 * The list(lst) contains integers, that means it may contain some negative numbers.
 *
 * If the list is empty or contains a single element, return 0.
 *
 * The list(lst) is not sorted.
 *
 * maxDiff([1, 2, 3, 4]); // return 3, because 4 - 1 == 3
 * maxDiff([1, 2, 3, -4]); // return 7, because 3 - (-4) == 7:D
 * https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095
 */
public class MaxDiffEasy {

    public static int maxDiff(int[] lst) {
         int [] temp = stream(lst)
                .sorted()
                 .toArray();

        return temp.length > 1 ? temp[temp.length-1] - temp[0] : 0;
    }

    public static int maxDiff2(int[] lst) {
        return lst.length == 0 ? 0 :
                stream(lst).max().getAsInt() - stream(lst).min().getAsInt();
    }

    public static int maxDiff3(final int[] lst) {
        return stream(lst).max().orElse(0) - stream(lst).min().orElse(0);
    }
}
