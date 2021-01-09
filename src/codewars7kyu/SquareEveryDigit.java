package codewars7kyu;

import java.util.stream.Collectors;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 9**2 is 81 and 1**2 is 1.
 * <p>
 * Note: The function accepts an integer and returns an integer
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 */
public class SquareEveryDigit {

    public static int squareDigits(int n) {
        String s = String.valueOf(n);
        String[] sAry = s.split("(?<=.)");
        int erg = 0;
        String st = "";
        for (String s1 : sAry) {
            Integer temp = Integer.parseInt(s1);
            erg = temp * temp;
            st = st.concat(String.valueOf(erg));
        }
        erg = Integer.parseInt(st);
        return erg;
    }

    public static int squareDigits2(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public static int squareDigits3(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }

    public static int squareDigits4(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        for (char c: num.toCharArray()) {
            int curr = c - '0';
            curr *= curr;
            sb.append(curr);
        }
        return Integer.valueOf(sb.toString());
    }

}
