package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }

    @Test
    public void testSomething2() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin2("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin2("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin2("366058562030849490134388085"));
    }

    @Test
    public void testSomething3() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin3("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin3("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin3("366058562030849490134388085"));
    }

    @Test
    public void testSomething4() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin4("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin4("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin4("366058562030849490134388085"));
    }
}
