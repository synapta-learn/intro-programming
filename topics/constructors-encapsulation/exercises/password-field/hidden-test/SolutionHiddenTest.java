import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void exactlyFourCharsIsValid() {
        Solution pw = new Solution("abcd");
        assertEquals(4, pw.getLength());
        assertTrue(pw.isMatch("abcd"));
    }

    @Test
    void threeCharsThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("abc");
        });
    }

    @Test
    void caseSensitiveMatch() {
        Solution pw = new Solution("Secret");
        assertFalse(pw.isMatch("secret"));
    }

    @Test
    void maskedLengthMatchesPassword() {
        Solution pw = new Solution("longpassword");
        assertEquals(12, pw.getMasked().length());
        assertEquals("************", pw.getMasked());
    }
}
