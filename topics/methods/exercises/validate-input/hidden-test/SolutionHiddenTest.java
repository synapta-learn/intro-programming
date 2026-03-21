import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void positiveOne() {
        assertTrue(Solution.isPositive(1));
    }

    @Test
    void negativeLarge() {
        assertFalse(Solution.isPositive(-100));
    }

    @Test
    void atMinBoundary() {
        assertTrue(Solution.isInRange(1, 1, 10));
    }

    @Test
    void atMaxBoundary() {
        assertTrue(Solution.isInRange(10, 1, 10));
    }

    @Test
    void negativeRange() {
        assertTrue(Solution.isInRange(-5, -10, 0));
    }

    @Test
    void sameMinMax() {
        assertTrue(Solution.isInRange(5, 5, 5));
        assertFalse(Solution.isInRange(4, 5, 5));
    }

    @Test
    void singleCharString() {
        assertTrue(Solution.isNonEmpty("x"));
    }

    @Test
    void stringWithSpaces() {
        assertTrue(Solution.isNonEmpty("  "));
    }

    @Test
    void largePositive() {
        assertTrue(Solution.isPositive(Integer.MAX_VALUE));
    }

    @Test
    void justBelowRange() {
        assertFalse(Solution.isInRange(0, 1, 100));
    }

    @Test
    void justAboveRange() {
        assertFalse(Solution.isInRange(101, 1, 100));
    }
}
