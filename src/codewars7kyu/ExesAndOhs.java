package codewars7kyu;

/**
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive.
 * The string can contain any char.
 * <p>
 * Examples input/output:
 * <p>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 * https://www.codewars.com/kata/55908aad6620c066bc00002a
 */
public class ExesAndOhs {
    public static boolean getXO(String str) {

        int countX = 0;
        int countO = 0;
        String tString = str.toLowerCase();
        String[] sAry = tString.split("");
        for (int i = 0; i < sAry.length; i++) {
            if (sAry[i].equals("x")) {
                countX++;
            }
            if (sAry[i].equals("o")) {
                countO++;
            }
        }
        if (countO != countX) {
            return false;
        }
        return true;

    }

    public static boolean getXO2(String str) {

        // Good Luck!!
        int difference = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') difference++;
            if (str.charAt(i) == 'o') difference--;
        }

        if (difference == 0)
            return true;
        return false;
    }

    public static boolean getXO3(String str) {
        String xValues = str.replaceAll("[^xX]", "");
        String oValues = str.replaceAll("[^oO]", "");

        return xValues.length() == oValues.length();
    }

    public static boolean getXO4(String str) {
        str = str.toLowerCase();
        return str.replace("o", "").length() == str.replace("x", "").length();
    }
}
