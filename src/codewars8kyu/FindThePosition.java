package codewars8kyu;

/**
 * When provided with a letter, return its position in the alphabet.
 * Input :: "a"
 * Ouput :: "Position of alphabet: 1"
 * https://www.codewars.com/kata/5808e2006b65bff35500008f
 */
public class FindThePosition {

    public static String position(char a) {
        int temp = (int) a;
        int position = temp-96;
        return "Position of alphabet: " + position;
    }

    public static String position2(char a){

        return "Position of alphabet: " + ((int)a-96);
    }
}
