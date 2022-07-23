package codewars8kyu;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IfYouCantSleepJustCountSheep {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(countingSheep(a));
    }
    public static String countingSheep(int num) {
        String sentence = "";
        for (int i = 1; i <= num ; i++) {
            sentence =  sentence.concat(Integer.toString(i) + " sheep...");
        }
        return sentence;
    }

    public static String countingSheep2(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }

    public static String countingSheep3(int num) {
        String s = "";
        for(int i = 1; i <= num; i++){
            s += s.format("%s sheep...", i);
        }
        return s;
    }
}
