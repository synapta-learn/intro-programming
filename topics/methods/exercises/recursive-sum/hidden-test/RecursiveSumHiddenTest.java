import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveSumHiddenTest {

    @Test
    void twoDigitNumber() {
        assertEquals(10, RecursiveSum.digitSum(55));
    }

    @Test
    void largerNumber() {
        assertEquals(15, RecursiveSum.digitSum(12345));
    }

    @Test
    void allZeros() {
        assertEquals(1, RecursiveSum.digitSum(100));
    }

    @Test
    void digitSumOfOne() {
        assertEquals(1, RecursiveSum.digitSum(1));
    }

    @Test
    void fourDigits() {
        assertEquals(10, RecursiveSum.digitSum(1234));
    }

    @Test
    void repeatingDigits() {
        assertEquals(25, RecursiveSum.digitSum(55555));
    }

    @Test
    void largeNumber() {
        assertEquals(45, RecursiveSum.digitSum(123456789));
    }
}
