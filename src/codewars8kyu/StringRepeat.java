package codewars8kyu;

/**
 * Write a function called repeat_str which repeats the given string src exactly count times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return new StringBuilder(string.repeat(repeat)).toString();
    }
    public static String repeatStr2(final int repeat, final String string) {
        return string.repeat(repeat);
    }


}
