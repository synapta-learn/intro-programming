import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void typicalLeapYear() {
        assertTrue(Solution.isLeapYear(2024));
    }

    @Test
    void notDivisibleByFour() {
        assertFalse(Solution.isLeapYear(2023));
    }

    @Test
    void divisibleBy100NotBy400() {
        assertFalse(Solution.isLeapYear(1900));
    }

    @Test
    void divisibleBy400() {
        assertTrue(Solution.isLeapYear(2000));
    }
}
