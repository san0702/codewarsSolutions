package codewars8kyu;

/**
 * Create a function (or write a script in Shell) that takes an integer as an argument and returns
 * "Even" for even numbers or "Odd" for odd numbers.
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 */
public class EvenOrOdd {

    public static String even_or_odd(int number) {

        return number % 2 == 0 ? "Even" : "Odd";
    }
}
