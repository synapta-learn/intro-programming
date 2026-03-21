import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void simplePair() {
        assertTrue(Solution.isValid("()"));
    }

    @Test
    void nestedPairs() {
        assertTrue(Solution.isValid("(())"));
    }

    @Test
    void unmatchedOpen() {
        assertFalse(Solution.isValid("("));
    }

    @Test
    void unmatchedClose() {
        assertFalse(Solution.isValid(")"));
    }

    @Test
    void emptyString() {
        assertTrue(Solution.isValid(""));
    }
}
