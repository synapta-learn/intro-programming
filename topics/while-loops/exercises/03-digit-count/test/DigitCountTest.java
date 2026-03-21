import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitCountTest {

    @Test
    void zero() {
        assertEquals(1, DigitCount.digitCount(0));
    }

    @Test
    void singleDigit() {
        assertEquals(1, DigitCount.digitCount(5));
    }

    @Test
    void twoDigits() {
        assertEquals(2, DigitCount.digitCount(42));
    }

    @Test
    void threeDigits() {
        assertEquals(3, DigitCount.digitCount(123));
    }

    @Test
    void fiveDigits() {
        assertEquals(5, DigitCount.digitCount(10000));
    }
}
