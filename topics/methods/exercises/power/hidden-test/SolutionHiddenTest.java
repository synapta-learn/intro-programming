import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void oneToAnyPower() {
        assertEquals(1, Solution.power(1, 100));
    }

    @Test
    void twoToTwenty() {
        assertEquals(1048576L, Solution.power(2, 20));
    }

    @Test
    void tenToThree() {
        assertEquals(1000, Solution.power(10, 3));
    }

    @Test
    void zeroToZero() {
        // By convention, 0^0 = 1
        assertEquals(1, Solution.power(0, 0));
    }

    @Test
    void negativeBase() {
        assertEquals(-8, Solution.power(-2, 3));
    }

    @Test
    void negativeBaseEvenExponent() {
        assertEquals(16, Solution.power(-2, 4));
    }

    @Test
    void largeResult() {
        assertEquals(10000000000L, Solution.power(10, 10));
    }
}
