import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void shortPassword() {
        assertFalse(Solution.isLongEnough("abc"));
    }

    @Test
    void exactlyEightChars() {
        assertTrue(Solution.isLongEnough("abcdefgh"));
    }

    @Test
    void noDigit() {
        assertFalse(Solution.hasDigit("hello"));
    }

    @Test
    void withDigit() {
        assertTrue(Solution.hasDigit("hello1"));
    }

    @Test
    void noUppercase() {
        assertFalse(Solution.hasUppercase("hello"));
    }

    @Test
    void withUppercase() {
        assertTrue(Solution.hasUppercase("Hello"));
    }

    @Test
    void strongPassword() {
        assertTrue(Solution.isStrong("Secret99"));
    }

    @Test
    void missingUppercase() {
        assertFalse(Solution.isStrong("secret99"));
    }
}
