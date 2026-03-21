import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void emptyPassword() {
        assertFalse(Solution.isLongEnough(""));
        assertFalse(Solution.hasDigit(""));
        assertFalse(Solution.hasUppercase(""));
        assertFalse(Solution.isStrong(""));
    }

    @Test
    void tooShortButHasDigitAndUppercase() {
        assertFalse(Solution.isStrong("Short1A"));
    }

    @Test
    void longButNoDigitNoUppercase() {
        assertFalse(Solution.isStrong("longpassword"));
    }

    @Test
    void digitAtEnd() {
        assertTrue(Solution.hasDigit("password9"));
    }

    @Test
    void uppercaseAtEnd() {
        assertTrue(Solution.hasUppercase("lowercasE"));
    }
}
