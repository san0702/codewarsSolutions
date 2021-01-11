package codewars8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
 *
 * Return the average of the given array rounded down to its nearest integer.
 *
 * The array will never be empty.
 * https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java
 */
public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
      return (int) Arrays.stream(marks)
           .average()
              .orElse(0.0);

    }

    public static int getAverage2(int[] marks){
        return (IntStream.of(marks).sum())/marks.length;
    }

    public static int getAverage3(int[] marks) {
        return (int) IntStream.of(marks).average().getAsDouble();
    }
}
