import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountdownHiddenTest {

    @Test
    void negativeInput() {
        assertEquals("", Countdown.countdown(-5));
    }

    @Test
    void countdownFromTen() {
        assertEquals("10 9 8 7 6 5 4 3 2 1", Countdown.countdown(10));
    }

    @Test
    void noTrailingSpace() {
        String result = Countdown.countdown(3);
        assertFalse(result.endsWith(" "), "Result should not end with a space");
    }

    @Test
    void noLeadingSpace() {
        String result = Countdown.countdown(3);
        assertFalse(result.startsWith(" "), "Result should not start with a space");
    }
}
