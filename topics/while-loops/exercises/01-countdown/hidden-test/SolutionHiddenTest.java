import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeInput() {
        assertEquals("", Solution.countdown(-5));
    }

    @Test
    void countdownFromTen() {
        assertEquals("10 9 8 7 6 5 4 3 2 1", Solution.countdown(10));
    }

    @Test
    void noTrailingSpace() {
        String result = Solution.countdown(3);
        assertFalse(result.endsWith(" "), "Result should not end with a space");
    }

    @Test
    void noLeadingSpace() {
        String result = Solution.countdown(3);
        assertFalse(result.startsWith(" "), "Result should not start with a space");
    }
}
