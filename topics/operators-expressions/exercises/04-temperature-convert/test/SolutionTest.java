import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testFreezingPoint() {
        assertEquals(0.0, Solution.fahrenheitToCelsius(32.0), 0.01);
    }

    @Test
    public void testBoilingPoint() {
        assertEquals(100.0, Solution.fahrenheitToCelsius(212.0), 0.01);
    }

    @Test
    public void testBodyTemperature() {
        assertEquals(37.0, Solution.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitFreezing() {
        assertEquals(32.0, Solution.celsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitBoiling() {
        assertEquals(212.0, Solution.celsiusToFahrenheit(100.0), 0.01);
    }
}
