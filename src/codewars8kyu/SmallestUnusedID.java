package codewars8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!
 * Therefore you need a method, which returns the smallest unused ID for your next new data item...
 * Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!
 * https://www.codewars.com/kata/55eea63119278d571d00006a/train/java
 */
public class SmallestUnusedID {

    public static void main(String[] args) {
        int [] temp = {1,3,5,2};
        System.out.println(nextId(temp));
    }
    public static int nextId(int[] ids) {
    int [] temp = Arrays.stream(ids)
            .sorted()
            .distinct()
            .toArray();
        int erg = 0;
        for (int i = 0; i < temp.length; i++) {
            if(i == temp[i]){
                continue;
            }else if (i != temp[i]){
                return i;
            }
        }
        if (erg == 0){
            return temp.length;
        }
        return erg;
    }

    public static int nextId2(int[] ids) {
        return IntStream.range(0, ids.length + 1).filter(id -> !IntStream.of(ids).anyMatch(x -> x == id)).findFirst().getAsInt();
    }
}
