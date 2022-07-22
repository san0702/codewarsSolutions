package codewars6kyu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
 */
public class HighestScoringWord {
    public static void main(String[] args) {
        String s = "aa cd xx";

        System.out.println(high(s));
    }
    public static String high(String s) {

        String [] words = s.split(" ");
        int highscore = 0;
        String highestWord  = "";
        int lowestByte = 96;
        for (String word: words) {
            int wordresult = 0;
            byte[] bytes = word.getBytes();
            for (byte b :bytes) {
                 wordresult += b-lowestByte;

            }
            if(wordresult > highscore){
                highscore = wordresult;
                highestWord = word;
            }
        }

        return highestWord;
    }

    public static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }
}
