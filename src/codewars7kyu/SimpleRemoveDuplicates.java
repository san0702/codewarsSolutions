package codewars7kyu;

import java.util.HashSet;
import java.util.Iterator;

/**
 * // Remove the 3's at indices 0 and 3
 * // followed by removing a 4 at index 1
 * solve([3, 4, 4, 3, 6, 3]); // => [4, 6, 3]
 */

public class SimpleRemoveDuplicates {

    public static int[] solve(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        final int len = arr.length;

        for (int i = 0; i < len; i++) {
            set.add(arr[i]);
        }

        int[] whitelist = new int[set.size()];
        int i = 0;
        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
            whitelist[i++] = it.next();
        }
        return whitelist;
    }

}
