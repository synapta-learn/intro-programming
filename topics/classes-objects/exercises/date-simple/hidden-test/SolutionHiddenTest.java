import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void nextDayEndOfYear() {
        Solution d = new Solution();
        d.year = 2024; d.month = 12; d.day = 31;
        d.nextDay();
        assertEquals("2025-01-01", d.toString());
    }

    @Test
    void invalidDay() {
        Solution d = new Solution();
        d.year = 2024; d.month = 2; d.day = 29;
        assertFalse(d.isValid());
    }

    @Test
    void invalidNegativeYear() {
        Solution d = new Solution();
        d.year = -1; d.month = 1; d.day = 1;
        assertFalse(d.isValid());
    }

    @Test
    void endOfFebNextDay() {
        Solution d = new Solution();
        d.year = 2024; d.month = 2; d.day = 28;
        d.nextDay();
        assertEquals("2024-03-01", d.toString());
    }
}
