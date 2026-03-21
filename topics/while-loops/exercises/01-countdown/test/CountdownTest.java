import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountdownTest {

    @Test
    void countdownFromFive() {
        assertEquals("5 4 3 2 1", Countdown.countdown(5));
    }

    @Test
    void countdownFromThree() {
        assertEquals("3 2 1", Countdown.countdown(3));
    }

    @Test
    void countdownFromOne() {
        assertEquals("1", Countdown.countdown(1));
    }

    @Test
    void countdownFromZero() {
        assertEquals("", Countdown.countdown(0));
    }
}
