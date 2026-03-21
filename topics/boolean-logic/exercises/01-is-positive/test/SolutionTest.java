import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void positiveNumber() {
        assertTrue(Solution.isPositive(5));
    }

    @Test
    void negativeNumber() {
        assertFalse(Solution.isPositive(-3));
    }

    @Test
    void zero() {
        assertFalse(Solution.isPositive(0));
    }

    @Test
    void largePositive() {
        assertTrue(Solution.isPositive(1000000));
    }
}
