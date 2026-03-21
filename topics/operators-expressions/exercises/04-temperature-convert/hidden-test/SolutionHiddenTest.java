import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testNegativeFahrenheit() {
        // -40 is the same in both scales
        assertEquals(-40.0, Solution.fahrenheitToCelsius(-40.0), 0.01,
            "-40 F should equal -40 C");
    }

    @Test
    public void testNegativeCelsius() {
        assertEquals(-40.0, Solution.celsiusToFahrenheit(-40.0), 0.01,
            "-40 C should equal -40 F");
    }

    @Test
    public void testRoundTrip() {
        double original = 72.0;
        double celsius = Solution.fahrenheitToCelsius(original);
        double backToF = Solution.celsiusToFahrenheit(celsius);
        assertEquals(original, backToF, 0.01,
            "Converting F→C→F should return the original value");
    }

    @Test
    public void testRoundTripFromCelsius() {
        double original = 25.0;
        double fahrenheit = Solution.celsiusToFahrenheit(original);
        double backToC = Solution.fahrenheitToCelsius(fahrenheit);
        assertEquals(original, backToC, 0.01,
            "Converting C→F→C should return the original value");
    }

    @Test
    public void testRoomTemperature() {
        // 72 F ≈ 22.22 C
        double result = Solution.fahrenheitToCelsius(72.0);
        assertEquals(22.22, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitBody() {
        assertEquals(98.6, Solution.celsiusToFahrenheit(37.0), 0.01);
    }

    @Test
    public void testZeroFahrenheit() {
        // 0 F ≈ -17.78 C
        double result = Solution.fahrenheitToCelsius(0.0);
        assertEquals(-17.78, result, 0.01);
    }

    @Test
    public void testNotUsingIntegerDivision() {
        // If they use 5/9 (integer division = 0), result will be 0.0 for all inputs
        double result = Solution.fahrenheitToCelsius(100.0);
        assertTrue(Math.abs(result) > 0.01,
            "Result should not be 0 — are you using 5.0/9.0 (not 5/9)?");
    }

    @Test
    public void testLargeTemperature() {
        // 1000 F = 537.78 C
        double result = Solution.fahrenheitToCelsius(1000.0);
        assertEquals(537.78, result, 0.01);
    }
}
