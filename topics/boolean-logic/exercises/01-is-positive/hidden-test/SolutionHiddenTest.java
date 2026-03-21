import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void one() {
        assertTrue(Solution.isPositive(1));
    }

    @Test
    void negativeOne() {
        assertFalse(Solution.isPositive(-1));
    }

    @Test
    void largeNegative() {
        assertFalse(Solution.isPositive(-999999));
    }
}
