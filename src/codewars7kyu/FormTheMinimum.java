package codewars7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given a list of digits, return the smallest number that could be
 * formed from these digits, using the digits only once (ignore duplicates).
 * <p>
 * minValue ({1, 3, 1})  ==> return (13)
 * (13) is the minimum number could be formed from {1, 3, 1} , Without duplications
 */
public class FormTheMinimum {
    public static int minValue(int[] values) {

        int[] temp = Arrays.stream(Arrays.stream(values)
                .distinct()
                .sorted()
                .toArray())
                .toArray();

        String t = "";
        for (int i = 0; i < temp.length; i++) {

            if (t.isEmpty()) {
                t = Integer.toString(temp[i]);
            } else {
                t = t.concat(Integer.toString(temp[i]));
            }

        }

        return Integer.parseInt(t);
    }

    public static int minValue2(int[] values) {
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
    }
}
