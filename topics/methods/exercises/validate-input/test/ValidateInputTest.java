import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateInputTest {

    @Test
    void positiveNumber() {
        assertTrue(ValidateInput.isPositive(5));
    }

    @Test
    void zeroIsNotPositive() {
        assertFalse(ValidateInput.isPositive(0));
    }

    @Test
    void negativeIsNotPositive() {
        assertFalse(ValidateInput.isPositive(-3));
    }

    @Test
    void inRange() {
        assertTrue(ValidateInput.isInRange(5, 1, 10));
    }

    @Test
    void belowRange() {
        assertFalse(ValidateInput.isInRange(0, 1, 10));
    }

    @Test
    void aboveRange() {
        assertFalse(ValidateInput.isInRange(11, 1, 10));
    }

    @Test
    void nonEmptyString() {
        assertTrue(ValidateInput.isNonEmpty("hello"));
    }

    @Test
    void emptyStringIsEmpty() {
        assertFalse(ValidateInput.isNonEmpty(""));
    }

    @Test
    void nullIsEmpty() {
        assertFalse(ValidateInput.isNonEmpty(null));
    }
}
