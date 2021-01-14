package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseNiceIntFromCharProblemTest {

    @Test
    public void test1() {
        assertEquals(5, ParseNiceIntFromCharProblem.howOld("5 years old"));
        assertEquals(9, ParseNiceIntFromCharProblem.howOld("9 years old"));
        assertEquals(1, ParseNiceIntFromCharProblem.howOld("1 year old"));


    }
    @Test
    public void test2() {
        assertEquals(5, ParseNiceIntFromCharProblem.howOld2("5 years old"));
        assertEquals(9, ParseNiceIntFromCharProblem.howOld2("9 years old"));
        assertEquals(1, ParseNiceIntFromCharProblem.howOld2("1 year old"));
    }

}
