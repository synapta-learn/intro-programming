import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testMidnight() {
        assertEquals(0, Solution.getHours(0));
        assertEquals(0, Solution.getMinutes(0));
        assertTrue(Solution.isAM(0), "Midnight (0:00) is AM");
    }

    @Test
    public void testNoon() {
        assertEquals(12, Solution.getHours(720));
        assertEquals(0, Solution.getMinutes(720));
        assertFalse(Solution.isAM(720), "Noon (12:00) is PM");
    }

    @Test
    public void testOneMinuteBeforeNoon() {
        assertEquals(11, Solution.getHours(719));
        assertEquals(59, Solution.getMinutes(719));
        assertTrue(Solution.isAM(719), "11:59 is AM");
    }

    @Test
    public void testOneMinuteAfterNoon() {
        assertEquals(12, Solution.getHours(721));
        assertEquals(1, Solution.getMinutes(721));
        assertFalse(Solution.isAM(721), "12:01 is PM");
    }

    @Test
    public void testEndOfDay() {
        // 23:59 = 1439 minutes
        assertEquals(23, Solution.getHours(1439));
        assertEquals(59, Solution.getMinutes(1439));
        assertFalse(Solution.isAM(1439), "23:59 is PM");
    }

    @Test
    public void testExactHour() {
        // 6:00 AM = 360 minutes
        assertEquals(6, Solution.getHours(360));
        assertEquals(0, Solution.getMinutes(360));
    }

    @Test
    public void testOneMinutePastMidnight() {
        assertEquals(0, Solution.getHours(1));
        assertEquals(1, Solution.getMinutes(1));
        assertTrue(Solution.isAM(1));
    }

    @Test
    public void test6PM() {
        // 18:00 = 1080 minutes
        assertEquals(18, Solution.getHours(1080));
        assertEquals(0, Solution.getMinutes(1080));
        assertFalse(Solution.isAM(1080));
    }

    @Test
    public void testMinutesAlwaysLessThan60() {
        for (int m = 0; m < 1440; m += 97) {
            int minutes = Solution.getMinutes(m);
            assertTrue(minutes >= 0 && minutes < 60,
                "Minutes should be 0-59, got " + minutes + " for input " + m);
        }
    }

    @Test
    public void testHoursAlwaysLessThan24() {
        for (int m = 0; m < 1440; m += 97) {
            int hours = Solution.getHours(m);
            assertTrue(hours >= 0 && hours < 24,
                "Hours should be 0-23, got " + hours + " for input " + m);
        }
    }
}
