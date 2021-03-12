import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AppTest {
    Main m = new Main();
    private static final double DELTA = 1e-15;
    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of an integer for True Positive", 4, m.squareroot(16),DELTA);
        assertEquals("Square Root of an integer for True Positive", 4.0, m.squareroot(16.0),DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of an integer for False Positive", 6, m.squareroot(16), DELTA);
        assertNotEquals("Square Root of an integer for False Positive", 4.2, m.squareroot(16.0), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of an integer for True Positive", 120, m.factorial(5), DELTA);
        assertEquals("Factorial of a double for True Positive", 24.0, m.factorial(4.0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of an integer for False Positive", 126, m.factorial(5), DELTA);
        assertNotEquals("SFactorial of an double for False Positive", 9.0, m.factorial(4.0), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Logarithm of an integer for True Positive", 0, m.log(1), DELTA);
        assertEquals("Logarithm of a double for True Positive", 0.0, m.log(1.0), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Logarithm of an integer for False Positive", 3, m.log(1), DELTA);
        assertNotEquals("Logarithm of an integer for False Positive", 2.1, m.log(1.0), DELTA);
    }

    @Test
    public void powTruePositive(){
        assertEquals("Power function on two integer numbers for True Positive", 2, m.power(2, 1), DELTA);
        assertEquals("Power function on two double numbers for True Positive",16.0, m.power(2.0, 4.0), DELTA);

    }

    @Test
    public void powFalsePositive(){
        assertNotEquals("Power function on two integer numbers for False Positive", 1, m.power(2, 1), DELTA);
        assertNotEquals("Power function on two double numbers for False Positive", 0, m.power(0, 0), DELTA);

    }
}
