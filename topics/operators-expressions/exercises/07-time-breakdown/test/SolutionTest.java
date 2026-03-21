import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testHoursMorning() {
        assertEquals(2, Solution.getHours(135));
    }

    @Test
    public void testMinutesMorning() {
        assertEquals(15, Solution.getMinutes(135));
    }

    @Test
    public void testIsAMMorning() {
        assertTrue(Solution.isAM(135));
    }

    @Test
    public void testHoursAfternoon() {
        assertEquals(13, Solution.getHours(810));
    }

    @Test
    public void testMinutesAfternoon() {
        assertEquals(30, Solution.getMinutes(810));
    }

    @Test
    public void testIsAMAfternoon() {
        assertFalse(Solution.isAM(810));
    }
}
