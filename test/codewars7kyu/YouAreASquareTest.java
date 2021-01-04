package codewars7kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YouAreASquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YouAreASquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   YouAreASquare.isSquare(0));
        assertEquals("3 isn't a square number", false,  YouAreASquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   YouAreASquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   YouAreASquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  YouAreASquare.isSquare(26));
        assertEquals("148110865 isn't a square number",false,  YouAreASquare.isSquare(148110865));
    }

    @Test
    public void shouldWorkForSomeExamples2() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YouAreASquare.isSquare2(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   YouAreASquare.isSquare2(0));
        assertEquals("3 isn't a square number", false,  YouAreASquare.isSquare2(3));
        assertEquals("4 is a square number (2 * 2)",    true,   YouAreASquare.isSquare2(4));
        assertEquals("25 is a square number (5 * 5)",   true,   YouAreASquare.isSquare2(25));
        assertEquals("26 isn't a square number",false,  YouAreASquare.isSquare2(26));
        assertEquals("148110865 isn't a square number",false,  YouAreASquare.isSquare2(148110865));
    }

    @Test
    public void shouldWorkForSomeExamples3() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YouAreASquare.isSquare3(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   YouAreASquare.isSquare3(0));
        assertEquals("3 isn't a square number", false,  YouAreASquare.isSquare3(3));
        assertEquals("4 is a square number (2 * 2)",    true,   YouAreASquare.isSquare3(4));
        assertEquals("25 is a square number (5 * 5)",   true,   YouAreASquare.isSquare3(25));
        assertEquals("26 isn't a square number",false,  YouAreASquare.isSquare3(26));
        assertEquals("148110865 isn't a square number",false,  YouAreASquare.isSquare3(148110865));
    }
}
