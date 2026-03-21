import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void countdownFromFive() {
        assertEquals("5 4 3 2 1", Solution.countdown(5));
    }

    @Test
    void countdownFromThree() {
        assertEquals("3 2 1", Solution.countdown(3));
    }

    @Test
    void countdownFromOne() {
        assertEquals("1", Solution.countdown(1));
    }

    @Test
    void countdownFromZero() {
        assertEquals("", Solution.countdown(0));
    }
}
