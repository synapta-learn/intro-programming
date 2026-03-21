import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void wednesday() {
        assertEquals("Weekday", Solution.dayType(3));
    }

    @Test
    void negativeDay() {
        assertEquals("Invalid", Solution.dayType(-1));
    }

    @Test
    void eightIsInvalid() {
        assertEquals("Invalid", Solution.dayType(8));
    }
}
