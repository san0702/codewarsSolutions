package codewars8kyu;

/**
 * Ask a small girl - "How old are you?". She always says strange things... Lets help her!
 * <p>
 * For correct answer program should return int from 0 to 9.
 * <p>
 * Assume test input string always valid and may look like "1 year old" or
 * "5 years old", etc.. The first char is number only.
 * https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java
 */
public class ParseNiceIntFromCharProblem {

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }

    public static int howOld2(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}
