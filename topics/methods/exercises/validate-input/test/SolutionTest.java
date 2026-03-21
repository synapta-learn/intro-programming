import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void positiveNumber() {
        assertTrue(Solution.isPositive(5));
    }

    @Test
    void zeroIsNotPositive() {
        assertFalse(Solution.isPositive(0));
    }

    @Test
    void negativeIsNotPositive() {
        assertFalse(Solution.isPositive(-3));
    }

    @Test
    void inRange() {
        assertTrue(Solution.isInRange(5, 1, 10));
    }

    @Test
    void belowRange() {
        assertFalse(Solution.isInRange(0, 1, 10));
    }

    @Test
    void aboveRange() {
        assertFalse(Solution.isInRange(11, 1, 10));
    }

    @Test
    void nonEmptyString() {
        assertTrue(Solution.isNonEmpty("hello"));
    }

    @Test
    void emptyStringIsEmpty() {
        assertFalse(Solution.isNonEmpty(""));
    }

    @Test
    void nullIsEmpty() {
        assertFalse(Solution.isNonEmpty(null));
    }
}
