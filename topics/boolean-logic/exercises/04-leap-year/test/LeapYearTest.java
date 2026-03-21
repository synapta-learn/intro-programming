import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    void typicalLeapYear() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    void notDivisibleByFour() {
        assertFalse(LeapYear.isLeapYear(2023));
    }

    @Test
    void divisibleBy100NotBy400() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    void divisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
