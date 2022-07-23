package codewars8kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Your task is to sum the differences between consecutive pairs in the array in descending order.
 *
 * For example:
 * sumOfDifferences([2, 1, 10])
 * Returns 9
 * Descending order: [10, 2, 1]
 * Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
 * If the array is empty or the array has only one element the result should be 0
 * https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java
 */
public class SumOfDifferencesInArray {

    public static int sumOfDifferences2(int[] arr) {
        if(arr.length==0 || arr.length == 1){
            return 0;
        }

        int[] temp = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::new)
                .toArray();
        int ergebnis = 0;
        for (int i = 0; i < temp.length-1; i++) {
            ergebnis += temp[i] - temp[i+1];
        }

        return ergebnis;
    }

    public static int sumOfDifferences3(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }
    public static int sumOfDifferences(int[] arr) {
        int[] array = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return IntStream.range(0, array.length - 1)
                .map(i -> array[i] - array[i + 1])
                .sum();
    }
}
