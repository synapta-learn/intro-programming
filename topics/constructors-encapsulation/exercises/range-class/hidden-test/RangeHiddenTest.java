import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeHiddenTest {

    @Test
    void noOverlap() {
        Range r1 = new Range(1, 5);
        Range r2 = new Range(6, 10);
        assertFalse(r1.overlaps(r2));
    }

    @Test
    void touchingRangesOverlap() {
        Range r1 = new Range(1, 5);
        Range r2 = new Range(5, 10);
        assertTrue(r1.overlaps(r2));
    }

    @Test
    void singleValueRange() {
        Range r = new Range(5, 5);
        assertEquals(1, r.getSize());
        assertTrue(r.contains(5));
        assertFalse(r.contains(4));
    }

    @Test
    void sizeCalculation() {
        Range r = new Range(3, 7);
        assertEquals(5, r.getSize());
    }
}
