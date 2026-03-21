import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayTypeTest {

    @Test
    void monday() {
        assertEquals("Weekday", DayType.dayType(1));
    }

    @Test
    void friday() {
        assertEquals("Weekday", DayType.dayType(5));
    }

    @Test
    void saturday() {
        assertEquals("Weekend", DayType.dayType(6));
    }

    @Test
    void sunday() {
        assertEquals("Weekend", DayType.dayType(7));
    }

    @Test
    void invalidDay() {
        assertEquals("Invalid", DayType.dayType(0));
    }
}
