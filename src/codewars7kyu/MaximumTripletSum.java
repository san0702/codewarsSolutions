package codewars7kyu;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array/list [] of n integers ,
 * find maximum triplet sum in the array Without duplications.
 * maxTriSum ({3,2,6,8,2,3}) ==> return (17)
 * As the triplet that maximize the sum {6,8,3} in order, their sum is (17)
 * Note : duplications are not included when summing, (i.e) the numbers added only once.
 * https://www.codewars.com/kata/5aa1bcda373c2eb596000112
 */

public class MaximumTripletSum {

    public static int maxTriSum2(int[] numbers) {
        int[] iAry = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .toArray();

        int erg = 0;

        int count = 3;
        for (int i = iAry.length - 1; i >= count; i--) {
            if (count > 0) {
                erg += iAry[i];
                count--;
            }
        }
        return erg;
    }
    public static int maxTriSum(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .distinct()
                .limit(3)
                .mapToInt(i -> i)
                .sum();
    }
}
