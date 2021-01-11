package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindThePositionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
        assertEquals("Position of alphabet: 26", FindThePosition.position('z'));
        assertEquals("Position of alphabet: 5", FindThePosition.position('e'));
    }

    @Test
    public void basicTests2() {
        assertEquals("Position of alphabet: 1", FindThePosition.position2('a'));
        assertEquals("Position of alphabet: 26", FindThePosition.position2('z'));
        assertEquals("Position of alphabet: 5", FindThePosition.position2('e'));
    }
}
