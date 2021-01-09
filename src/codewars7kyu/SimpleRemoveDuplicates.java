package codewars7kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * // Remove the 3's at indices 0 and 3
 * // followed by removing a 4 at index 1
 * solve([3, 4, 4, 3, 6, 3]); // => [4, 6, 3]
 * https://www.codewars.com/kata/5ba38ba180824a86850000f7/train/java/5fe335259fd214002100bf13
 */

public class SimpleRemoveDuplicates {

    public static int[] solve2(int[] arr) {
        var list = new java.util.ArrayList<Integer>();
        for (int a : arr) {
            list.removeIf(elem -> elem == a);
            list.add(a);
        }
        return list.stream().mapToInt(elem -> elem).toArray();
    }

    public static int[] solve3(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .mapToInt(e -> e.getKey())
                .toArray();

    }

    public static int[] solve(int[] arr) {
        int[] erg;

        helperlein(arr);
        erg = Arrays.stream(arr).distinct().toArray();

        helperlein(erg);
        return erg;
    }



    /**
     * reverses an array
     * @param arr
     */
    public static void helperlein(int[] arr) {

        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

}
