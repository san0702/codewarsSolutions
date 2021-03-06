package codewars7kyu;

import java.text.DecimalFormat;

/**
 * A square of squares
 *
 * You like building blocks. You especially like building blocks that are squares.
 * And what you even like more, is to arrange them into a square of square building blocks!
 *
 * However, sometimes, you can't arrange them into a square.
 * Instead, you end up with an ordinary rectangle! Those blasted things!
 * If you just had a way to know, whether you're currently working in vain… Wait! T
 * hat's it! You just have to check if your number of building blocks is a perfect square.
 * Task
 *
 * Given an integral number, determine if it's a square number:
 *
 *     In mathematics, a square number or perfect square is an integer that is the square of an integer;
 *     in other words, it is the product of some integer with itself.
 *
 * The tests will always use some integral number, so don't worry about that in dynamic typed languages.
 * Examples
 *
 * -1  =>  false
 *  0  =>  true
 *  3  =>  false
 *  4  =>  true
 * 25  =>  true
 * 26  =>  false
 * https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
 */
public class YouAreASquare {

    public static boolean isSquare(int n) {
        int m = (int) Math.sqrt(n);
        return m * m == n;
    }

    public static boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static boolean isSquare3(int n) {
        long s = Math.round(Math.sqrt(n));
        return s * s == n;
    }
}
