import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void noOverlap() {
        Solution r1 = new Solution(1, 5);
        Solution r2 = new Solution(6, 10);
        assertFalse(r1.overlaps(r2));
    }

    @Test
    void touchingRangesOverlap() {
        Solution r1 = new Solution(1, 5);
        Solution r2 = new Solution(5, 10);
        assertTrue(r1.overlaps(r2));
    }

    @Test
    void singleValueRange() {
        Solution r = new Solution(5, 5);
        assertEquals(1, r.getSize());
        assertTrue(r.contains(5));
        assertFalse(r.contains(4));
    }

    @Test
    void sizeCalculation() {
        Solution r = new Solution(3, 7);
        assertEquals(5, r.getSize());
    }
}
