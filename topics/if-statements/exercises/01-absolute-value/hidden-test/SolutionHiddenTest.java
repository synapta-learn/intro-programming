import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void one() {
        assertEquals(1, Solution.absoluteValue(1));
    }

    @Test
    void negativeOne() {
        assertEquals(1, Solution.absoluteValue(-1));
    }

    @Test
    void largePositive() {
        assertEquals(999999, Solution.absoluteValue(999999));
    }
}
