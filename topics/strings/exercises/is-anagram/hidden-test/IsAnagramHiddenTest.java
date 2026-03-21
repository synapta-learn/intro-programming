import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsAnagramHiddenTest {

    @Test
    void singleCharacterAnagram() {
        assertTrue(IsAnagram.isAnagram("a", "A"));
    }

    @Test
    void differentLengths() {
        assertFalse(IsAnagram.isAnagram("abc", "abcd"));
    }

    @Test
    void anagramWithMixedCase() {
        assertTrue(IsAnagram.isAnagram("Tea", "Eat"));
    }
}
