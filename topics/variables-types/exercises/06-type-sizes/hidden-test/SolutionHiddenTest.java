import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testMinIntExactValue() {
        assertEquals(-2147483648, Solution.getMinInt(),
            "getMinInt() should return -2147483648");
    }

    @Test
    public void testMaxIntExactValue() {
        assertEquals(2147483647, Solution.getMaxInt(),
            "getMaxInt() should return 2147483647");
    }

    @Test
    public void testRangeIsPositive() {
        long range = Solution.getIntRange();
        assertTrue(range > 0, "Range should be a positive number");
    }

    @Test
    public void testRangeIsLargerThanMaxInt() {
        long range = Solution.getIntRange();
        assertTrue(range > Integer.MAX_VALUE,
            "The range of int is larger than Integer.MAX_VALUE — make sure you return a long");
    }

    @Test
    public void testRangeExactValue() {
        long expected = (long) Integer.MAX_VALUE - (long) Integer.MIN_VALUE + 1L;
        assertEquals(expected, Solution.getIntRange(),
            "Range should be MAX_VALUE - MIN_VALUE + 1 (calculated as long)");
    }

    @Test
    public void testMinIsNegative() {
        assertTrue(Solution.getMinInt() < 0,
            "Minimum int value should be negative");
    }

    @Test
    public void testMaxIsPositive() {
        assertTrue(Solution.getMaxInt() > 0,
            "Maximum int value should be positive");
    }
}
