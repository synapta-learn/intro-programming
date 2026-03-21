import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void year1600() {
        assertTrue(Solution.isLeapYear(1600));
    }

    @Test
    void year1800() {
        assertFalse(Solution.isLeapYear(1800));
    }

    @Test
    void year4() {
        assertTrue(Solution.isLeapYear(4));
    }

    @Test
    void year100() {
        assertFalse(Solution.isLeapYear(100));
    }

    @Test
    void year400() {
        assertTrue(Solution.isLeapYear(400));
    }
}
