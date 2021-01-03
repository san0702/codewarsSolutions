package codewars7kyu;

/**
 *In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Example:
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 *
 * Notes:
 *     All numbers are valid Int32, no need to validate them.
 *     There will always be at least one number in the input string.
 *     Output string must be two numbers separated by a single space, and highest number is first.
 *
 */
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        // Code here or
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        String[] sAry = numbers.split(" ");
        for (int i = 0; i < sAry.length; i++) {
            if (Integer.parseInt(sAry[i]) > high) {
                high = Integer.parseInt(sAry[i]);
            }
            if (Integer.parseInt(sAry[i]) < low) {
                low = Integer.parseInt(sAry[i]);
            }
        }
        return Integer.toString(high).concat(" " + Integer.toString(low));
    }
}
