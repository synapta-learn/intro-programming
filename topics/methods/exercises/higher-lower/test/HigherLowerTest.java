import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HigherLowerTest {

    @Test
    void guessIsLow() {
        assertEquals("higher", HigherLower.checkGuess(42, 30));
    }

    @Test
    void guessIsHigh() {
        assertEquals("lower", HigherLower.checkGuess(42, 50));
    }

    @Test
    void guessIsCorrect() {
        assertEquals("correct", HigherLower.checkGuess(42, 42));
    }

    @Test
    void countThreeGuesses() {
        assertEquals(3, HigherLower.countGuesses(42, new int[]{30, 50, 42}));
    }

    @Test
    void neverGuessed() {
        assertEquals(-1, HigherLower.countGuesses(42, new int[]{30, 50, 60}));
    }

    @Test
    void validGuess() {
        assertTrue(HigherLower.isValidGuess(5, 1, 10));
    }

    @Test
    void invalidGuess() {
        assertFalse(HigherLower.isValidGuess(0, 1, 10));
    }

    @Test
    void bestGuessMidpoint() {
        assertEquals(50, HigherLower.bestGuess(1, 100));
    }
}
