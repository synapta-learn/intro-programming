import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberGuessingTest {

    @Test
    void targetIsMiddle() {
        // (1+10)/2 = 5, found immediately
        assertEquals(1, NumberGuessing.guessCount(10, 5));
    }

    @Test
    void targetIsOne() {
        // guesses: 5, 2, 1
        assertEquals(3, NumberGuessing.guessCount(10, 1));
    }

    @Test
    void singleElement() {
        assertEquals(1, NumberGuessing.guessCount(1, 1));
    }

    @Test
    void targetIsN() {
        // guesses: 5, 8, 9, 10
        assertEquals(4, NumberGuessing.guessCount(10, 10));
    }
}
