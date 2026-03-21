import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void guessIsLow() {
        assertEquals("higher", Solution.checkGuess(42, 30));
    }

    @Test
    void guessIsHigh() {
        assertEquals("lower", Solution.checkGuess(42, 50));
    }

    @Test
    void guessIsCorrect() {
        assertEquals("correct", Solution.checkGuess(42, 42));
    }

    @Test
    void countThreeGuesses() {
        assertEquals(3, Solution.countGuesses(42, new int[]{30, 50, 42}));
    }

    @Test
    void neverGuessed() {
        assertEquals(-1, Solution.countGuesses(42, new int[]{30, 50, 60}));
    }

    @Test
    void validGuess() {
        assertTrue(Solution.isValidGuess(5, 1, 10));
    }

    @Test
    void invalidGuess() {
        assertFalse(Solution.isValidGuess(0, 1, 10));
    }

    @Test
    void bestGuessMidpoint() {
        assertEquals(50, Solution.bestGuess(1, 100));
    }
}
