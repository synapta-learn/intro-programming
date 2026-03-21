import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void listenAndSilent() {
        assertTrue(Solution.isAnagram("listen", "silent"));
    }

    @Test
    void helloAndWorld() {
        assertFalse(Solution.isAnagram("hello", "world"));
    }

    @Test
    void caseInsensitiveWithSpaces() {
        assertTrue(Solution.isAnagram("Astronomer", "Moon starer"));
    }

    @Test
    void sameLengthButNotAnagram() {
        assertFalse(Solution.isAnagram("aab", "bba"));
    }

    @Test
    void emptyStrings() {
        assertTrue(Solution.isAnagram("", ""));
    }
}
