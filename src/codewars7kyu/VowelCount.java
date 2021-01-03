package codewars7kyu;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
public class VowelCount {

    public static int getCount(String str) {

        int vowelsCount = 0;
        String s = str.toLowerCase();
        String[] sAry = s.split("");

        // your code here
        for (int i = 0; i < sAry.length; i++) {
            if (sAry[i].contains("a") || sAry[i].contains("e") || sAry[i].contains("i") || sAry[i].contains("o") || sAry[i].contains("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCount3(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}
