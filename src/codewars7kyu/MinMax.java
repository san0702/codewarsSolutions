package codewars7kyu;

import java.util.Arrays;

/**
 *Ben has a very simple idea to make some profit: he buys something and sells it again.
 * Of course, this wouldn't give him any profit at all if he was simply to buy and sell
 * it at the same price. Instead, he's going to buy it for the lowest possible price
 * and sell it at the highest.
 * Task:
 * Write a function that returns both the minimum and maximum number of the given list/array.
 * Examples (Input --> Output)
 *
 * [1,2,3,4,5] --> [1,5]
 * [2334454,5] --> [5,2334454]
 * [1]         --> [1,1]
 *
 * Remarks
 *
 * All arrays or lists will always have at least one element, so you don't need to
 * check the length. Also, your function will always get an array or a list,
 * you don't have to check for null, undefined or similar.
 * https://www.codewars.com/kata/559590633066759614000063/train/java
 */
public class MinMax {

    public static int[] minMax(int[] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min,max};
    }

    public static int[] minmax2(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }

    public static int[] minMax3(int[] arr) {
        return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
}
