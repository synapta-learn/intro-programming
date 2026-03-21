import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    void simplePair() {
        assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    void nestedPairs() {
        assertTrue(ValidParentheses.isValid("(())"));
    }

    @Test
    void unmatchedOpen() {
        assertFalse(ValidParentheses.isValid("("));
    }

    @Test
    void unmatchedClose() {
        assertFalse(ValidParentheses.isValid(")"));
    }

    @Test
    void emptyString() {
        assertTrue(ValidParentheses.isValid(""));
    }
}
