import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void singleCharacterAnagram() {
        assertTrue(Solution.isAnagram("a", "A"));
    }

    @Test
    void differentLengths() {
        assertFalse(Solution.isAnagram("abc", "abcd"));
    }

    @Test
    void anagramWithMixedCase() {
        assertTrue(Solution.isAnagram("Tea", "Eat"));
    }
}
