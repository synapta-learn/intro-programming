import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testBoilingPoint() {
        String result = Solution.formatTemperature(100.0);
        assertEquals("The temperature is 100.0 degrees Celsius.", result);
    }

    @Test
    public void testAbsoluteZero() {
        String result = Solution.formatTemperature(-273.15);
        assertEquals("The temperature is -273.15 degrees Celsius.", result);
    }

    @Test
    public void testSmallDecimal() {
        String result = Solution.formatTemperature(0.1);
        assertEquals("The temperature is 0.1 degrees Celsius.", result);
    }

    @Test
    public void testStartsCorrectly() {
        String result = Solution.formatTemperature(20.0);
        assertTrue(result.startsWith("The temperature is"),
            "Message should start with 'The temperature is'");
    }

    @Test
    public void testEndsWithPeriod() {
        String result = Solution.formatTemperature(20.0);
        assertTrue(result.endsWith("."),
            "Message should end with a period");
    }

    @Test
    public void testContainsDegreesCelsius() {
        String result = Solution.formatTemperature(20.0);
        assertTrue(result.contains("degrees Celsius"),
            "Message should contain 'degrees Celsius'");
    }

    @Test
    public void testNotNull() {
        String result = Solution.formatTemperature(20.0);
        assertNotNull(result, "Method should not return null");
    }
}
