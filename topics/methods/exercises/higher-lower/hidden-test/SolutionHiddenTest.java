import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void checkGuessExact() {
        assertEquals("correct", Solution.checkGuess(1, 1));
    }

    @Test
    void checkGuessHigherByOne() {
        assertEquals("higher", Solution.checkGuess(10, 9));
    }

    @Test
    void checkGuessLowerByOne() {
        assertEquals("lower", Solution.checkGuess(10, 11));
    }

    @Test
    void countGuessesFirstTry() {
        assertEquals(1, Solution.countGuesses(7, new int[]{7}));
    }

    @Test
    void countGuessesEmptyArray() {
        assertEquals(-1, Solution.countGuesses(5, new int[]{}));
    }

    @Test
    void countGuessesSecondTry() {
        assertEquals(2, Solution.countGuesses(5, new int[]{3, 5, 7}));
    }

    @Test
    void validGuessAtMin() {
        assertTrue(Solution.isValidGuess(1, 1, 10));
    }

    @Test
    void validGuessAtMax() {
        assertTrue(Solution.isValidGuess(10, 1, 10));
    }

    @Test
    void invalidGuessAboveMax() {
        assertFalse(Solution.isValidGuess(11, 1, 10));
    }

    @Test
    void bestGuessSmallRange() {
        assertEquals(5, Solution.bestGuess(1, 10));
    }

    @Test
    void bestGuessSameMinMax() {
        assertEquals(5, Solution.bestGuess(5, 5));
    }

    @Test
    void bestGuessEvenRange() {
        assertEquals(3, Solution.bestGuess(1, 5));
    }

    @Test
    void countGuessesWithDuplicateGuesses() {
        // Secret is 5, guesses are 3, 3, 3, 5
        assertEquals(4, Solution.countGuesses(5, new int[]{3, 3, 3, 5}));
    }

    @Test
    void checkGuessNegativeNumbers() {
        assertEquals("higher", Solution.checkGuess(-1, -5));
        assertEquals("lower", Solution.checkGuess(-5, -1));
        assertEquals("correct", Solution.checkGuess(-3, -3));
    }
}
