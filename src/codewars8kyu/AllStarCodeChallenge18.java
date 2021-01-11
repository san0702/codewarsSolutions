package codewars8kyu;

/**
 * All Star Code Challenge #18
 * <p>
 * Create a function that accepts 2 string arguments and returns an integer of
 * the count of occurrences the 2nd argument is found in the first one.
 * <p>
 * If no occurrences can be found, a count of 0 should be returned.
 * <p>
 * strCount("Hello", 'o') // => 1
 * strCount("Hello", 'l') // => 2
 * strCount("", 'z')      // => 0
 * <p>
 * Notes:
 * <p>
 * The first argument can be an empty string
 * The second string argument will always be of length 1
 * https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
 */
public class AllStarCodeChallenge18 {

    public static int strCount(String str, char letter) {
        String [] strings = str.split("");
        int count = 0;
        for (String string : strings) {
            if (string.equals(Character.toString(letter))) {
                count++;
            }
        }
        return count;
    }

    public static int strCount2(String str, char letter) {
        return (int)str.chars().filter(x -> x == letter).count();
    }

    public static int strCount3(String str, char letter) {
        int counter = 0;
        for(char character : str.toCharArray()) {
            if(letter == character) {
                counter++;
            }
        }
        return counter;
    }
}
