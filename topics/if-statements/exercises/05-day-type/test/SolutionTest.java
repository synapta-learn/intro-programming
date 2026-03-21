import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void monday() {
        assertEquals("Weekday", Solution.dayType(1));
    }

    @Test
    void friday() {
        assertEquals("Weekday", Solution.dayType(5));
    }

    @Test
    void saturday() {
        assertEquals("Weekend", Solution.dayType(6));
    }

    @Test
    void sunday() {
        assertEquals("Weekend", Solution.dayType(7));
    }

    @Test
    void invalidDay() {
        assertEquals("Invalid", Solution.dayType(0));
    }
}
