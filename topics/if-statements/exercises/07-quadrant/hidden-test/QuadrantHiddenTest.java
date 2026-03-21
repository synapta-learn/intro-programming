import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadrantHiddenTest {

    @Test
    void negativeXAxis() {
        assertEquals("Axis", Quadrant.quadrant(-3, 0));
    }

    @Test
    void positiveYAxis() {
        assertEquals("Axis", Quadrant.quadrant(0, 7));
    }

    @Test
    void largeQ1() {
        assertEquals("Q1", Quadrant.quadrant(100, 200));
    }

    @Test
    void largeQ3() {
        assertEquals("Q3", Quadrant.quadrant(-50, -50));
    }
}
