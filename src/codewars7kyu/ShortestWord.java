package codewars7kyu;

import java.util.stream.Stream;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
 */
public class ShortestWord {

    public static int findShort(String s) {
        String [] words = s.split(" ");
        int minword = Integer.MAX_VALUE;
        for (String word : words) {
            if(word.length() < minword ){
                minword = word.length();
            }
        }
        return minword;
    }

    public static int findShort2(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
