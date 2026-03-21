import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void degenerateTriangle() {
        // 1 + 2 = 3, not strictly greater
        assertFalse(Solution.isValidTriangle(1, 2, 3));
    }

    @Test
    void allZeros() {
        assertFalse(Solution.isValidTriangle(0, 0, 0));
    }

    @Test
    void largeValidTriangle() {
        assertTrue(Solution.isValidTriangle(100, 100, 100));
    }

    @Test
    void invalidThirdSideTooLong() {
        assertFalse(Solution.isValidTriangle(2, 3, 10));
    }
}
