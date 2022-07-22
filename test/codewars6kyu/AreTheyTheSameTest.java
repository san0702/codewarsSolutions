package codewars6kyu;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreTheyTheSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test2(){
        int[] a = new int[]{7,2,3,5};
        int[] b = new int[]{4,25,9,49};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test3(){
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test4(){
        int[] a = new int[]{7,2};
        int[] b = new int[]{49,55,4};
        assertEquals(false, AreTheyTheSame.comp(a, b));
    }
}
