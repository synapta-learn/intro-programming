import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeBreakdownHiddenTest {

    @Test
    public void testMidnight() {
        assertEquals(0, TimeBreakdown.getHours(0));
        assertEquals(0, TimeBreakdown.getMinutes(0));
        assertTrue(TimeBreakdown.isAM(0), "Midnight (0:00) is AM");
    }

    @Test
    public void testNoon() {
        assertEquals(12, TimeBreakdown.getHours(720));
        assertEquals(0, TimeBreakdown.getMinutes(720));
        assertFalse(TimeBreakdown.isAM(720), "Noon (12:00) is PM");
    }

    @Test
    public void testOneMinuteBeforeNoon() {
        assertEquals(11, TimeBreakdown.getHours(719));
        assertEquals(59, TimeBreakdown.getMinutes(719));
        assertTrue(TimeBreakdown.isAM(719), "11:59 is AM");
    }

    @Test
    public void testOneMinuteAfterNoon() {
        assertEquals(12, TimeBreakdown.getHours(721));
        assertEquals(1, TimeBreakdown.getMinutes(721));
        assertFalse(TimeBreakdown.isAM(721), "12:01 is PM");
    }

    @Test
    public void testEndOfDay() {
        // 23:59 = 1439 minutes
        assertEquals(23, TimeBreakdown.getHours(1439));
        assertEquals(59, TimeBreakdown.getMinutes(1439));
        assertFalse(TimeBreakdown.isAM(1439), "23:59 is PM");
    }

    @Test
    public void testExactHour() {
        // 6:00 AM = 360 minutes
        assertEquals(6, TimeBreakdown.getHours(360));
        assertEquals(0, TimeBreakdown.getMinutes(360));
    }

    @Test
    public void testOneMinutePastMidnight() {
        assertEquals(0, TimeBreakdown.getHours(1));
        assertEquals(1, TimeBreakdown.getMinutes(1));
        assertTrue(TimeBreakdown.isAM(1));
    }

    @Test
    public void test6PM() {
        // 18:00 = 1080 minutes
        assertEquals(18, TimeBreakdown.getHours(1080));
        assertEquals(0, TimeBreakdown.getMinutes(1080));
        assertFalse(TimeBreakdown.isAM(1080));
    }

    @Test
    public void testMinutesAlwaysLessThan60() {
        for (int m = 0; m < 1440; m += 97) {
            int minutes = TimeBreakdown.getMinutes(m);
            assertTrue(minutes >= 0 && minutes < 60,
                "Minutes should be 0-59, got " + minutes + " for input " + m);
        }
    }

    @Test
    public void testHoursAlwaysLessThan24() {
        for (int m = 0; m < 1440; m += 97) {
            int hours = TimeBreakdown.getHours(m);
            assertTrue(hours >= 0 && hours < 24,
                "Hours should be 0-23, got " + hours + " for input " + m);
        }
    }
}
