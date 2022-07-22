package codewars6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));

    }

    @Test
    public void sampleTests2() {
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
    }

    @Test
    public void sampleTests3() {
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", HighestScoringWord.high("aa b"));

    }

    @Test
    public void edgeCaseTests2() {
        assertEquals("b", HighestScoringWord.high("b aa"));

    }

    @Test
    public void edgeCaseTests3() {
        assertEquals("bb", HighestScoringWord.high("bb d"));

    }

    @Test
    public void edgeCaseTests4() {
        assertEquals("d", HighestScoringWord.high("d bb"));
    }

    @Test
    public void edgeCaseTests5() {
        assertEquals("aaa", HighestScoringWord.high("aaa b"));
    }
}
