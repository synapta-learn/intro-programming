import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void constructorSetsMinMax() {
        Solution r = new Solution(1, 10);
        assertEquals(1, r.getMin());
        assertEquals(10, r.getMax());
    }

    @Test
    void constructorSwapsIfNeeded() {
        Solution r = new Solution(10, 1);
        assertEquals(1, r.getMin());
        assertEquals(10, r.getMax());
    }

    @Test
    void containsValueInRange() {
        Solution r = new Solution(1, 10);
        assertTrue(r.contains(5));
        assertTrue(r.contains(1));
        assertTrue(r.contains(10));
    }

    @Test
    void doesNotContainOutsideRange() {
        Solution r = new Solution(1, 10);
        assertFalse(r.contains(0));
        assertFalse(r.contains(11));
    }

    @Test
    void overlapsDetected() {
        Solution r1 = new Solution(1, 10);
        Solution r2 = new Solution(5, 15);
        assertTrue(r1.overlaps(r2));
    }
}
