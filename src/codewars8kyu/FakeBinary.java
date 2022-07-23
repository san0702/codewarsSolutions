package codewars8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.joining;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 *
 * Note: input will never be an empty string
 * https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
 */
public class FakeBinary {
    public static void main(String[] args) {
        String s = "24";
        System.out.println(fakeBin(s));
    }
    public static String fakeBin(String numberString) {
        String [] chars = numberString.split("");
        int zahl = 0;
        String output = "";
        for (String s: chars) {
            zahl = Integer.parseInt(s);
            if(zahl < 5){
                String low = "0";
                output = output.concat(low);
            }else{
                String high = "1";
                output = output.concat(high);
            }
        }
        return output;
    }

    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static String fakeBin3(String numberString) {
        final char c[] = numberString.toCharArray();
        for (int i = 0; i < c.length; i++)
            c[i] = c[i] < '5' ? '0' : '1';
        return new String(c);
    }

    public static String fakeBin4(String str) {
        return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
