import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordFieldHiddenTest {

    @Test
    void exactlyFourCharsIsValid() {
        PasswordField pw = new PasswordField("abcd");
        assertEquals(4, pw.getLength());
        assertTrue(pw.isMatch("abcd"));
    }

    @Test
    void threeCharsThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PasswordField("abc");
        });
    }

    @Test
    void caseSensitiveMatch() {
        PasswordField pw = new PasswordField("Secret");
        assertFalse(pw.isMatch("secret"));
    }

    @Test
    void maskedLengthMatchesPassword() {
        PasswordField pw = new PasswordField("longpassword");
        assertEquals(12, pw.getMasked().length());
        assertEquals("************", pw.getMasked());
    }
}
