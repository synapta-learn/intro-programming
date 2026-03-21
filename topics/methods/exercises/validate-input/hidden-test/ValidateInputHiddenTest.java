import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateInputHiddenTest {

    @Test
    void positiveOne() {
        assertTrue(ValidateInput.isPositive(1));
    }

    @Test
    void negativeLarge() {
        assertFalse(ValidateInput.isPositive(-100));
    }

    @Test
    void atMinBoundary() {
        assertTrue(ValidateInput.isInRange(1, 1, 10));
    }

    @Test
    void atMaxBoundary() {
        assertTrue(ValidateInput.isInRange(10, 1, 10));
    }

    @Test
    void negativeRange() {
        assertTrue(ValidateInput.isInRange(-5, -10, 0));
    }

    @Test
    void sameMinMax() {
        assertTrue(ValidateInput.isInRange(5, 5, 5));
        assertFalse(ValidateInput.isInRange(4, 5, 5));
    }

    @Test
    void singleCharString() {
        assertTrue(ValidateInput.isNonEmpty("x"));
    }

    @Test
    void stringWithSpaces() {
        assertTrue(ValidateInput.isNonEmpty("  "));
    }

    @Test
    void largePositive() {
        assertTrue(ValidateInput.isPositive(Integer.MAX_VALUE));
    }

    @Test
    void justBelowRange() {
        assertFalse(ValidateInput.isInRange(0, 1, 100));
    }

    @Test
    void justAboveRange() {
        assertFalse(ValidateInput.isInRange(101, 1, 100));
    }
}
