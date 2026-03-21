import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest {

    @Test
    void threeDigits() {
        assertEquals(321, ReverseNumber.reverseNumber(123));
    }

    @Test
    void trailingZeros() {
        assertEquals(1, ReverseNumber.reverseNumber(1000));
    }

    @Test
    void twoDigits() {
        assertEquals(24, ReverseNumber.reverseNumber(42));
    }

    @Test
    void singleDigit() {
        assertEquals(7, ReverseNumber.reverseNumber(7));
    }

    @Test
    void fiveDigits() {
        assertEquals(54321, ReverseNumber.reverseNumber(12345));
    }
}
