import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitCountHiddenTest {

    @Test
    void nine() {
        assertEquals(1, DigitCount.digitCount(9));
    }

    @Test
    void ten() {
        assertEquals(2, DigitCount.digitCount(10));
    }

    @Test
    void ninetyNine() {
        assertEquals(2, DigitCount.digitCount(99));
    }

    @Test
    void oneHundred() {
        assertEquals(3, DigitCount.digitCount(100));
    }

    @Test
    void largeNumber() {
        assertEquals(7, DigitCount.digitCount(1000000));
    }
}
