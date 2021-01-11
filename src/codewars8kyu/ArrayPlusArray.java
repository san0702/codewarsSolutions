package codewars8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;

/**
 * I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
 * <p>
 * P.S. Each array includes only integer numbers. Output is a number too.
 * https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
 */
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int erg1 = stream(arr1)
                .sum();
        int erg2 = stream(arr2)
                .sum();
        return erg1 + erg2;
    }

    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static int arrayPlusArray3(int[] arr1, int[] arr2) {
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
    }

    public static int arrayPlusArray4(int[] arr1, int[] arr2) {

        return concat(stream(arr1), stream(arr2)).sum();
    }
}
