package codewars8kyu;

import java.util.Arrays;

/**
 * Your task is to make two functions that receive a list of integers as input,
 * and return the largest and lowest number in that list, respectively.
 * Input -> Output
 *  [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
 *  [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
 *  [42, 54, 65, 87, 0]             -> min = 0, max = 87
 *  [5]                             -> min = 5, max = 5
 *  https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
 */
public class FindMaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
