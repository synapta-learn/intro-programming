import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void middleValue() {
        assertTrue(Solution.inRange(50));
    }

    @Test
    void lowerBoundary() {
        assertTrue(Solution.inRange(1));
    }

    @Test
    void upperBoundary() {
        assertTrue(Solution.inRange(100));
    }

    @Test
    void belowRange() {
        assertFalse(Solution.inRange(0));
    }

    @Test
    void aboveRange() {
        assertFalse(Solution.inRange(101));
    }
}
