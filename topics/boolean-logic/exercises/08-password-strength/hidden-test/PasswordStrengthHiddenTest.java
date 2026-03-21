import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthHiddenTest {

    @Test
    void emptyPassword() {
        assertFalse(PasswordStrength.isLongEnough(""));
        assertFalse(PasswordStrength.hasDigit(""));
        assertFalse(PasswordStrength.hasUppercase(""));
        assertFalse(PasswordStrength.isStrong(""));
    }

    @Test
    void tooShortButHasDigitAndUppercase() {
        assertFalse(PasswordStrength.isStrong("Short1A"));
    }

    @Test
    void longButNoDigitNoUppercase() {
        assertFalse(PasswordStrength.isStrong("longpassword"));
    }

    @Test
    void digitAtEnd() {
        assertTrue(PasswordStrength.hasDigit("password9"));
    }

    @Test
    void uppercaseAtEnd() {
        assertTrue(PasswordStrength.hasUppercase("lowercasE"));
    }
}
