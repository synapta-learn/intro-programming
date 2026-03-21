import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeXAxis() {
        assertEquals("Axis", Solution.quadrant(-3, 0));
    }

    @Test
    void positiveYAxis() {
        assertEquals("Axis", Solution.quadrant(0, 7));
    }

    @Test
    void largeQ1() {
        assertEquals("Q1", Solution.quadrant(100, 200));
    }

    @Test
    void largeQ3() {
        assertEquals("Q3", Solution.quadrant(-50, -50));
    }
}
