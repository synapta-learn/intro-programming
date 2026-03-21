import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void withTextBetween() {
        assertTrue(Solution.isValid("(hello (world))"));
    }

    @Test
    void extraClosing() {
        assertFalse(Solution.isValid("(()))"));
    }

    @Test
    void noParentheses() {
        assertTrue(Solution.isValid("hello"));
    }

    @Test
    void consecutivePairs() {
        assertTrue(Solution.isValid("()()()"));
    }
}
