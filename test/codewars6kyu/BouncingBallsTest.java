package codewars6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BouncingBallsTest {
    @Test
    public void test1() {
        assertEquals(3, BouncingBalls.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBalls.bouncingBall(30.0, 0.66, 1.5));
    }

    @Test
    public void  negativTest(){
        assertEquals(-1, BouncingBalls.bouncingBall(3.0, 1, 1.5) );
    }
}
