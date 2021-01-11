package codewars8kyu;

/**
 * Complete the solution so that it reverses the string passed into it.
 * 'world'  =>  'dlrow'
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 */
public class ReversedStrings {

    public static String solution(String world) {
        return new StringBuilder(world).reverse().toString();
    }
}
