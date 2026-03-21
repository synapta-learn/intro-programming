import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void validDate() {
        Solution d = new Solution();
        d.year = 2024; d.month = 3; d.day = 15;
        assertTrue(d.isValid());
    }

    @Test
    void invalidMonth() {
        Solution d = new Solution();
        d.year = 2024; d.month = 13; d.day = 1;
        assertFalse(d.isValid());
    }

    @Test
    void toStringFormat() {
        Solution d = new Solution();
        d.year = 2024; d.month = 3; d.day = 5;
        assertEquals("2024-03-05", d.toString());
    }

    @Test
    void nextDaySimple() {
        Solution d = new Solution();
        d.year = 2024; d.month = 3; d.day = 15;
        d.nextDay();
        assertEquals("2024-03-16", d.toString());
    }

    @Test
    void nextDayEndOfMonth() {
        Solution d = new Solution();
        d.year = 2024; d.month = 1; d.day = 31;
        d.nextDay();
        assertEquals("2024-02-01", d.toString());
    }
}
