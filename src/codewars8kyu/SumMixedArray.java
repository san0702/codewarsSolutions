package codewars8kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 *
 * Return your answer as a number.
 * https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java
 */
public class SumMixedArray {

    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
    public int sum2(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed)
        {
            if (element instanceof Integer)
            {
                sum += (Integer) element;
            }
            else if (element instanceof String){
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }
}
