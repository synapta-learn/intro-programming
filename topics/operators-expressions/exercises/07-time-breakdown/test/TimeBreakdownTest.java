import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeBreakdownTest {

    @Test
    public void testHoursMorning() {
        assertEquals(2, TimeBreakdown.getHours(135));
    }

    @Test
    public void testMinutesMorning() {
        assertEquals(15, TimeBreakdown.getMinutes(135));
    }

    @Test
    public void testIsAMMorning() {
        assertTrue(TimeBreakdown.isAM(135));
    }

    @Test
    public void testHoursAfternoon() {
        assertEquals(13, TimeBreakdown.getHours(810));
    }

    @Test
    public void testMinutesAfternoon() {
        assertEquals(30, TimeBreakdown.getMinutes(810));
    }

    @Test
    public void testIsAMAfternoon() {
        assertFalse(TimeBreakdown.isAM(810));
    }
}
