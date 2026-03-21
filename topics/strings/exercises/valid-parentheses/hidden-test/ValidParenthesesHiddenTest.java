import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesHiddenTest {

    @Test
    void withTextBetween() {
        assertTrue(ValidParentheses.isValid("(hello (world))"));
    }

    @Test
    void extraClosing() {
        assertFalse(ValidParentheses.isValid("(()))"));
    }

    @Test
    void noParentheses() {
        assertTrue(ValidParentheses.isValid("hello"));
    }

    @Test
    void consecutivePairs() {
        assertTrue(ValidParentheses.isValid("()()()"));
    }
}
