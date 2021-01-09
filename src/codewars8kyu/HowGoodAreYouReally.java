package codewars8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There was a test in your class and you passed it. Congratulations!
 * But you're an ambitious person. You want to know if you're better than the average student in your class.
 * You receive an array with your peers' test scores. Now calculate the average and compare your score!
 * Return True if you're better, else False!
 * Note:
 * Your points are not included in the array of your class's points.
 * For calculating the average point you may add your point to the given array!
 * https://www.codewars.com/kata/5601409514fc93442500010b/train/java
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        List<Integer> list = new ArrayList<>();
        for (int classPoint : classPoints) {
            list.add(classPoint);
        }
        list.add(yourPoints);
        double d = list.stream()
                .mapToDouble(a-> a).average().getAsDouble();

       return yourPoints > d;
    }

    public static boolean betterThanAverage2(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
