import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayTypeHiddenTest {

    @Test
    void wednesday() {
        assertEquals("Weekday", DayType.dayType(3));
    }

    @Test
    void negativeDay() {
        assertEquals("Invalid", DayType.dayType(-1));
    }

    @Test
    void eightIsInvalid() {
        assertEquals("Invalid", DayType.dayType(8));
    }
}
