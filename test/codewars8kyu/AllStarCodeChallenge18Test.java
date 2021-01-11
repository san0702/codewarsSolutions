package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllStarCodeChallenge18Test {
    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallenge18.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount("",'z'));
    }

    @Test
    public void testSomething2() {
        assertEquals(1, AllStarCodeChallenge18.strCount2("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount2("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount2("",'z'));
    }

    @Test
    public void testSomething3() {
        assertEquals(1, AllStarCodeChallenge18.strCount3("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount3("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount3("",'z'));
    }

}
