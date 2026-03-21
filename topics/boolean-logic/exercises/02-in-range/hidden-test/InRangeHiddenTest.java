import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InRangeHiddenTest {

    @Test
    void negativeNumber() {
        assertFalse(InRange.inRange(-10));
    }

    @Test
    void largePositive() {
        assertFalse(InRange.inRange(500));
    }

    @Test
    void justInsideLower() {
        assertTrue(InRange.inRange(2));
    }

    @Test
    void justInsideUpper() {
        assertTrue(InRange.inRange(99));
    }
}
