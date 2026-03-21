import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearHiddenTest {

    @Test
    void year1600() {
        assertTrue(LeapYear.isLeapYear(1600));
    }

    @Test
    void year1800() {
        assertFalse(LeapYear.isLeapYear(1800));
    }

    @Test
    void year4() {
        assertTrue(LeapYear.isLeapYear(4));
    }

    @Test
    void year100() {
        assertFalse(LeapYear.isLeapYear(100));
    }

    @Test
    void year400() {
        assertTrue(LeapYear.isLeapYear(400));
    }
}
