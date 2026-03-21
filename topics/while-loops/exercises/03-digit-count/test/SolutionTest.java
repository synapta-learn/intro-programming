import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void zero() {
        assertEquals(1, Solution.digitCount(0));
    }

    @Test
    void singleDigit() {
        assertEquals(1, Solution.digitCount(5));
    }

    @Test
    void twoDigits() {
        assertEquals(2, Solution.digitCount(42));
    }

    @Test
    void threeDigits() {
        assertEquals(3, Solution.digitCount(123));
    }

    @Test
    void fiveDigits() {
        assertEquals(5, Solution.digitCount(10000));
    }
}
