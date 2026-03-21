import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterHiddenTest {

    @Test
    public void testZeroSeconds() {
        assertEquals(0, TimeConverter.toHours(0));
        assertEquals(0, TimeConverter.toMinutes(0));
        assertEquals(0, TimeConverter.toSeconds(0));
    }

    @Test
    public void testExactlyOneHour() {
        assertEquals(1, TimeConverter.toHours(3600));
        assertEquals(0, TimeConverter.toMinutes(3600));
        assertEquals(0, TimeConverter.toSeconds(3600));
    }

    @Test
    public void testExactlyOneMinute() {
        assertEquals(0, TimeConverter.toHours(60));
        assertEquals(1, TimeConverter.toMinutes(60));
        assertEquals(0, TimeConverter.toSeconds(60));
    }

    @Test
    public void testLessThanOneMinute() {
        assertEquals(0, TimeConverter.toHours(45));
        assertEquals(0, TimeConverter.toMinutes(45));
        assertEquals(45, TimeConverter.toSeconds(45));
    }

    @Test
    public void test59Minutes59Seconds() {
        int total = 59 * 60 + 59; // 3599
        assertEquals(0, TimeConverter.toHours(total));
        assertEquals(59, TimeConverter.toMinutes(total));
        assertEquals(59, TimeConverter.toSeconds(total));
    }

    @Test
    public void testLargeValue() {
        // 10 hours, 30 minutes, 15 seconds = 37815 seconds
        int total = 10 * 3600 + 30 * 60 + 15;
        assertEquals(10, TimeConverter.toHours(total));
        assertEquals(30, TimeConverter.toMinutes(total));
        assertEquals(15, TimeConverter.toSeconds(total));
    }

    @Test
    public void testMinutesDoNotIncludeHours() {
        // 2 hours exactly = 7200 seconds
        // minutes should be 0, not 120
        assertEquals(0, TimeConverter.toMinutes(7200),
            "toMinutes should return only the remaining minutes, not total minutes");
    }

    @Test
    public void testSecondsDoNotIncludeMinutes() {
        // 5 minutes exactly = 300 seconds
        // seconds should be 0, not 300
        assertEquals(0, TimeConverter.toSeconds(300),
            "toSeconds should return only the remaining seconds, not total seconds");
    }

    @Test
    public void testOneSecond() {
        assertEquals(0, TimeConverter.toHours(1));
        assertEquals(0, TimeConverter.toMinutes(1));
        assertEquals(1, TimeConverter.toSeconds(1));
    }
}
