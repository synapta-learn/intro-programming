import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberGuessingHiddenTest {

    @Test
    void hundredTarget73() {
        assertEquals(6, NumberGuessing.guessCount(100, 73));
    }

    @Test
    void hundredTarget50() {
        // (1+100)/2 = 50, found immediately
        assertEquals(1, NumberGuessing.guessCount(100, 50));
    }

    @Test
    void twoElementsTargetOne() {
        // (1+2)/2 = 1, found
        assertEquals(1, NumberGuessing.guessCount(2, 1));
    }

    @Test
    void twoElementsTargetTwo() {
        // (1+2)/2 = 1, too low; (2+2)/2 = 2, found
        assertEquals(2, NumberGuessing.guessCount(2, 2));
    }
}
