import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthTest {

    @Test
    void shortPassword() {
        assertFalse(PasswordStrength.isLongEnough("abc"));
    }

    @Test
    void exactlyEightChars() {
        assertTrue(PasswordStrength.isLongEnough("abcdefgh"));
    }

    @Test
    void noDigit() {
        assertFalse(PasswordStrength.hasDigit("hello"));
    }

    @Test
    void withDigit() {
        assertTrue(PasswordStrength.hasDigit("hello1"));
    }

    @Test
    void noUppercase() {
        assertFalse(PasswordStrength.hasUppercase("hello"));
    }

    @Test
    void withUppercase() {
        assertTrue(PasswordStrength.hasUppercase("Hello"));
    }

    @Test
    void strongPassword() {
        assertTrue(PasswordStrength.isStrong("Secret99"));
    }

    @Test
    void missingUppercase() {
        assertFalse(PasswordStrength.isStrong("secret99"));
    }
}
