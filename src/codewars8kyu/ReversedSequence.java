package codewars8kyu;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Build a function that returns an array of integers from n to 1 where n>0.
 * <p>
 * Example : n=5 >> [5,4,3,2,1]
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
 */
public class ReversedSequence {

    public static int[] reverse(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i >0; i--) {
            list.add(i);
        }
        int[] iAry = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iAry[i] = list.get(i);
        }
        return iAry;
    }

    public static int[] reverse2(int n){

        int[] res = new int[n];
        for (int i=0; i<n; i++)
            res[i]=n-i;
        return res;
    }

    public static int[] reverse3(int n){

        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }

    public static int[] reverse4(int n){
        return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    }

}
