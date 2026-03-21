import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaHiddenTest {

    @Test
    public void testRadiusTwo() {
        double expected = Math.PI * 2.0 * 2.0;
        assertEquals(expected, CircleArea.circleArea(2.0), 0.0001);
    }

    @Test
    public void testRadiusTen() {
        double expected = Math.PI * 10.0 * 10.0;
        assertEquals(expected, CircleArea.circleArea(10.0), 0.0001);
    }

    @Test
    public void testRadiusHalf() {
        double expected = Math.PI * 0.5 * 0.5;
        assertEquals(expected, CircleArea.circleArea(0.5), 0.0001);
    }

    @Test
    public void testSmallRadius() {
        double expected = Math.PI * 0.01 * 0.01;
        assertEquals(expected, CircleArea.circleArea(0.01), 0.000001);
    }

    @Test
    public void testLargeRadius() {
        double expected = Math.PI * 100.0 * 100.0;
        assertEquals(expected, CircleArea.circleArea(100.0), 0.01);
    }

    @Test
    public void testUsesMathPI() {
        // If they used 3.14 instead of Math.PI, the result will be off
        double result = CircleArea.circleArea(10.0);
        double withMathPI = Math.PI * 100.0;
        double withApprox = 3.14 * 100.0;
        assertTrue(Math.abs(result - withMathPI) < 0.001,
            "Use Math.PI for accuracy, not an approximation like 3.14");
    }

    @Test
    public void testResultIsPositive() {
        double result = CircleArea.circleArea(3.0);
        assertTrue(result > 0, "Area should be positive for a non-zero radius");
    }
}
