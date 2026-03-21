import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordFieldTest {

    @Test
    void correctPasswordMatches() {
        PasswordField pw = new PasswordField("secret");
        assertTrue(pw.isMatch("secret"));
    }

    @Test
    void wrongPasswordDoesNotMatch() {
        PasswordField pw = new PasswordField("secret");
        assertFalse(pw.isMatch("wrong"));
    }

    @Test
    void maskedOutput() {
        PasswordField pw = new PasswordField("secret");
        assertEquals("******", pw.getMasked());
    }

    @Test
    void passwordLength() {
        PasswordField pw = new PasswordField("mypass");
        assertEquals(6, pw.getLength());
    }

    @Test
    void tooShortThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PasswordField("ab");
        });
    }
}
