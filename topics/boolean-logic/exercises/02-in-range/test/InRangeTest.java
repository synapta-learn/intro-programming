import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InRangeTest {

    @Test
    void middleValue() {
        assertTrue(InRange.inRange(50));
    }

    @Test
    void lowerBoundary() {
        assertTrue(InRange.inRange(1));
    }

    @Test
    void upperBoundary() {
        assertTrue(InRange.inRange(100));
    }

    @Test
    void belowRange() {
        assertFalse(InRange.inRange(0));
    }

    @Test
    void aboveRange() {
        assertFalse(InRange.inRange(101));
    }
}
