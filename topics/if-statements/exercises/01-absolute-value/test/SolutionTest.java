import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void positiveNumber() {
        assertEquals(5, Solution.absoluteValue(5));
    }

    @Test
    void negativeNumber() {
        assertEquals(5, Solution.absoluteValue(-5));
    }

    @Test
    void zero() {
        assertEquals(0, Solution.absoluteValue(0));
    }

    @Test
    void largeNegative() {
        assertEquals(42, Solution.absoluteValue(-42));
    }
}
