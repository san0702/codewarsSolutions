package codewars6kyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Enough is enough!
 * <p>
 * Alice and Bob were on a holiday.
 * Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection.
 * However, Charlie doesn't like these sessions, since the motive usually repeats.
 * He isn't fond of seeing the Eiffel tower 40 times.
 * He tells them that he will only sit during the session if they show the same motive at most N times.
 * Luckily, Alice and Bob are able to encode the motive as a number.
 * Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
 * Task:
 * Given a list lst and a number N, create a new list that contains each number of
 * list at most N times without reordering.
 * For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
 * since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 * Example
 * <p>
 * EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
 * EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 * https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
 */
public class EnoughIsEnough {

    public static int[] deleteNth(int[] ints, int i) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        return IntStream.of(ints)
                .filter(x -> hashMap.merge(x, 1, Integer::sum) <= i)
                .toArray();

    }

    public static int[] deleteNth2(int[] ints, int delete) {
      ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            count = 0;
            for (int j = 0; j <= i; j++) {
                if(ints[j] == ints[i]){
                    count++;
                }
            }
            if(count <= delete){
                list.add(ints[i]);
            }
        }

        int[] erg = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            erg[i] = list.get(i);
        }

        return erg;
    }

}
