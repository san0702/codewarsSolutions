package codewars8kyu;

/**
 * Write a function to convert a name into initials.
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 * Sam Harris => S.H
 * Patrick Feeney => P.F
 * https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/solutions/java
 */
public class AbbreviateATwoWordName {

    public static String abbrevName(String name) {
        String[] strings = name.toUpperCase().split(" ");
        String temp = strings[0].substring(0, 1);
        String temp2 = strings[1].substring(0, 1);
        return temp + "." + temp2;
    }

    public static String abbrevName2(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    public static String abbrevName3(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }

    public static String abbrevName4(String name) {

        String[] init = name.split(" ");
        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
    }

    public static String abbrevName5(String name) {
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }
}
