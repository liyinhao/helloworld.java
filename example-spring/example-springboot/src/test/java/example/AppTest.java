package example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Application.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test(){
        Object o = new Object();
        System.out.println(String.valueOf(o));
    }
}
