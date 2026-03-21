import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsAnagramTest {

    @Test
    void listenAndSilent() {
        assertTrue(IsAnagram.isAnagram("listen", "silent"));
    }

    @Test
    void helloAndWorld() {
        assertFalse(IsAnagram.isAnagram("hello", "world"));
    }

    @Test
    void caseInsensitiveWithSpaces() {
        assertTrue(IsAnagram.isAnagram("Astronomer", "Moon starer"));
    }

    @Test
    void sameLengthButNotAnagram() {
        assertFalse(IsAnagram.isAnagram("aab", "bba"));
    }

    @Test
    void emptyStrings() {
        assertTrue(IsAnagram.isAnagram("", ""));
    }
}
