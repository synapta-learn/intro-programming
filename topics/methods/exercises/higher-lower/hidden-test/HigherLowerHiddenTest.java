import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HigherLowerHiddenTest {

    @Test
    void checkGuessExact() {
        assertEquals("correct", HigherLower.checkGuess(1, 1));
    }

    @Test
    void checkGuessHigherByOne() {
        assertEquals("higher", HigherLower.checkGuess(10, 9));
    }

    @Test
    void checkGuessLowerByOne() {
        assertEquals("lower", HigherLower.checkGuess(10, 11));
    }

    @Test
    void countGuessesFirstTry() {
        assertEquals(1, HigherLower.countGuesses(7, new int[]{7}));
    }

    @Test
    void countGuessesEmptyArray() {
        assertEquals(-1, HigherLower.countGuesses(5, new int[]{}));
    }

    @Test
    void countGuessesSecondTry() {
        assertEquals(2, HigherLower.countGuesses(5, new int[]{3, 5, 7}));
    }

    @Test
    void validGuessAtMin() {
        assertTrue(HigherLower.isValidGuess(1, 1, 10));
    }

    @Test
    void validGuessAtMax() {
        assertTrue(HigherLower.isValidGuess(10, 1, 10));
    }

    @Test
    void invalidGuessAboveMax() {
        assertFalse(HigherLower.isValidGuess(11, 1, 10));
    }

    @Test
    void bestGuessSmallRange() {
        assertEquals(5, HigherLower.bestGuess(1, 10));
    }

    @Test
    void bestGuessSameMinMax() {
        assertEquals(5, HigherLower.bestGuess(5, 5));
    }

    @Test
    void bestGuessEvenRange() {
        assertEquals(3, HigherLower.bestGuess(1, 5));
    }

    @Test
    void countGuessesWithDuplicateGuesses() {
        // Secret is 5, guesses are 3, 3, 3, 5
        assertEquals(4, HigherLower.countGuesses(5, new int[]{3, 3, 3, 5}));
    }

    @Test
    void checkGuessNegativeNumbers() {
        assertEquals("higher", HigherLower.checkGuess(-1, -5));
        assertEquals("lower", HigherLower.checkGuess(-5, -1));
        assertEquals("correct", HigherLower.checkGuess(-3, -3));
    }
}
