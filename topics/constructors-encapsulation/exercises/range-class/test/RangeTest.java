import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    void constructorSetsMinMax() {
        Range r = new Range(1, 10);
        assertEquals(1, r.getMin());
        assertEquals(10, r.getMax());
    }

    @Test
    void constructorSwapsIfNeeded() {
        Range r = new Range(10, 1);
        assertEquals(1, r.getMin());
        assertEquals(10, r.getMax());
    }

    @Test
    void containsValueInRange() {
        Range r = new Range(1, 10);
        assertTrue(r.contains(5));
        assertTrue(r.contains(1));
        assertTrue(r.contains(10));
    }

    @Test
    void doesNotContainOutsideRange() {
        Range r = new Range(1, 10);
        assertFalse(r.contains(0));
        assertFalse(r.contains(11));
    }

    @Test
    void overlapsDetected() {
        Range r1 = new Range(1, 10);
        Range r2 = new Range(5, 15);
        assertTrue(r1.overlaps(r2));
    }
}
