package codewars8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfYouCantSleepJustCountSheepTest {
    @Test
    public void testSomething() {
        assertEquals("", IfYouCantSleepJustCountSheep.countingSheep(0));
        assertEquals("1 sheep...", IfYouCantSleepJustCountSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", IfYouCantSleepJustCountSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", IfYouCantSleepJustCountSheep.countingSheep(3));
    }

    @Test
    public void testSomething2() {
        assertEquals("", IfYouCantSleepJustCountSheep.countingSheep2(0));
        assertEquals("1 sheep...", IfYouCantSleepJustCountSheep.countingSheep2(1));
        assertEquals("1 sheep...2 sheep...", IfYouCantSleepJustCountSheep.countingSheep2(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", IfYouCantSleepJustCountSheep.countingSheep2(3));
    }

    @Test
    public void testSomething3() {
        assertEquals("", IfYouCantSleepJustCountSheep.countingSheep3(0));
        assertEquals("1 sheep...", IfYouCantSleepJustCountSheep.countingSheep3(1));
        assertEquals("1 sheep...2 sheep...", IfYouCantSleepJustCountSheep.countingSheep3(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", IfYouCantSleepJustCountSheep.countingSheep3(3));
    }
}
