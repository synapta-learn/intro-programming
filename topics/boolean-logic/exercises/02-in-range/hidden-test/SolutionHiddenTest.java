import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeNumber() {
        assertFalse(Solution.inRange(-10));
    }

    @Test
    void largePositive() {
        assertFalse(Solution.inRange(500));
    }

    @Test
    void justInsideLower() {
        assertTrue(Solution.inRange(2));
    }

    @Test
    void justInsideUpper() {
        assertTrue(Solution.inRange(99));
    }
}
