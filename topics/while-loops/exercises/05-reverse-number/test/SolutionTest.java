import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void threeDigits() {
        assertEquals(321, Solution.reverseNumber(123));
    }

    @Test
    void trailingZeros() {
        assertEquals(1, Solution.reverseNumber(1000));
    }

    @Test
    void twoDigits() {
        assertEquals(24, Solution.reverseNumber(42));
    }

    @Test
    void singleDigit() {
        assertEquals(7, Solution.reverseNumber(7));
    }

    @Test
    void fiveDigits() {
        assertEquals(54321, Solution.reverseNumber(12345));
    }
}
