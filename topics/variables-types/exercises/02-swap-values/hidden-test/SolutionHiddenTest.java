import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testSwapPositiveNumbers() {
        int[] result = Solution.swap(10, 20);
        assertEquals(20, result[0], "First element should be the original second argument");
        assertEquals(10, result[1], "Second element should be the original first argument");
    }

    @Test
    public void testSwapNegativeNumbers() {
        int[] result = Solution.swap(-5, -10);
        assertEquals(-10, result[0]);
        assertEquals(-5, result[1]);
    }

    @Test
    public void testSwapMixedSigns() {
        int[] result = Solution.swap(-3, 8);
        assertEquals(8, result[0]);
        assertEquals(-3, result[1]);
    }

    @Test
    public void testSwapZero() {
        int[] result = Solution.swap(0, 42);
        assertEquals(42, result[0]);
        assertEquals(0, result[1]);
    }

    @Test
    public void testSwapSameValues() {
        int[] result = Solution.swap(5, 5);
        assertEquals(5, result[0], "Swapping identical values should still work");
        assertEquals(5, result[1]);
    }

    @Test
    public void testSwapLargeNumbers() {
        int[] result = Solution.swap(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, result[0]);
        assertEquals(Integer.MAX_VALUE, result[1]);
    }

    @Test
    public void testSwapBothZero() {
        int[] result = Solution.swap(0, 0);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }
}
