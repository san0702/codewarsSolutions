package codewars6kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
 * that checks whether the two arrays have the "same" elements,
 * with the same multiplicities (the multiplicity of a member is the number of times it appears).
 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 * comp(a, b) returns true because in b 121 is the square of 11,
 * 14641 is the square of 121, 20736 the square of 144,
 * 361 the square of 19, 25921 the square of 161, and so on.
 * It gets obvious if we write b's elements in terms of squares:
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 * https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
 */

public class AreTheyTheSame {

    public static boolean comp(int[] a, int[] b) {
        if(a.length != b.length){
            return false;
        }
        if(a.length == 0 && b.length == 0){
            return true;
        }
        int counter = 0;
        int size = a.length;
        for (int i = 0; i <a.length ; i++) {
            double temp = a[i]*a[i];
            for (int j = 0; j < b.length; j++) {
                if(temp==b[j]){
                    counter++;
                    break;
                }
            }
        }
        if (counter == size) {
            return true;
        }
        return false;
    }

    public static boolean comp2(final int[] a, final int[] b) {
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }


    public static boolean comp3(int[] a, int[] b) {
        if ((a == null) || (b == null)){
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));

    }

    public static boolean comp4(int[] a, int[] b) {
        return a == null || b == null ? false :
                Arrays.equals(IntStream.of(a).map(n -> n*n).sorted().toArray(), IntStream.of(b).sorted().toArray());
    }
}
