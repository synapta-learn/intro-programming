import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void correctPasswordMatches() {
        Solution pw = new Solution("secret");
        assertTrue(pw.isMatch("secret"));
    }

    @Test
    void wrongPasswordDoesNotMatch() {
        Solution pw = new Solution("secret");
        assertFalse(pw.isMatch("wrong"));
    }

    @Test
    void maskedOutput() {
        Solution pw = new Solution("secret");
        assertEquals("******", pw.getMasked());
    }

    @Test
    void passwordLength() {
        Solution pw = new Solution("mypass");
        assertEquals(6, pw.getLength());
    }

    @Test
    void tooShortThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("ab");
        });
    }
}
