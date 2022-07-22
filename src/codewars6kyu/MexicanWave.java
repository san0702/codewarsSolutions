package codewars6kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
 * You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
 * wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 * https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
 */
public class MexicanWave {
    public static void main(String[] args) {
        String s = "two words";
        System.out.println(Arrays.toString(wave(s)));
    }

    public static String[] wave(String str) {
        String t = str.replace(" ", "");

        String[] lookup = str.toUpperCase(Locale.ROOT).split("");
        if(str.isEmpty()){
            return new String[0];
        }


        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String[] toReplace = str.split("");
            String sample = str.substring(i, i+1);
            if (sample.isBlank()) {
                continue;
            }

            toReplace[i] = lookup[i];
            result.add(String.join("", toReplace));
        }
        return result.toArray(new String[0]);
    }

}
