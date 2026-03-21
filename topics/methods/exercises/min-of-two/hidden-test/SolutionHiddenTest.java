import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void minIntNegatives() {
        assertEquals(-10, Solution.min(-3, -10));
    }

    @Test
    void minIntZeroAndPositive() {
        assertEquals(0, Solution.min(0, 5));
    }

    @Test
    void minIntZeroAndNegative() {
        assertEquals(-1, Solution.min(0, -1));
    }

    @Test
    void minDoubleFirstSmaller() {
        assertEquals(0.5, Solution.min(0.5, 1.5), 0.001);
    }

    @Test
    void minDoubleEqual() {
        assertEquals(3.0, Solution.min(3.0, 3.0), 0.001);
    }

    @Test
    void minDoubleNegative() {
        assertEquals(-5.5, Solution.min(-5.5, -2.2), 0.001);
    }

    @Test
    void minStringFirstLonger() {
        assertEquals("a", Solution.min("abc", "a"));
    }

    @Test
    void minStringEmpty() {
        assertEquals("", Solution.min("", "hello"));
    }

    @Test
    void minStringBothEmpty() {
        assertEquals("", Solution.min("", ""));
    }

    @Test
    void minStringSameLengthReturnFirst() {
        String result = Solution.min("abc", "xyz");
        assertEquals("abc", result);
    }
}
