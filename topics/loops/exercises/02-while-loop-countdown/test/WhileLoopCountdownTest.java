import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhileLoopCountdownTest {

    @Test
    void countdownFromFive() {
        assertEquals("5 4 3 2 1", WhileLoopCountdown.countdown(5));
    }

    @Test
    void countdownFromOne() {
        assertEquals("1", WhileLoopCountdown.countdown(1));
    }

    @Test
    void countdownFromZero() {
        assertEquals("", WhileLoopCountdown.countdown(0));
    }

    @Test
    void countdownFromThree() {
        assertEquals("3 2 1", WhileLoopCountdown.countdown(3));
    }
}
