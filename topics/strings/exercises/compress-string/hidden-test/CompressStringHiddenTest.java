import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompressStringHiddenTest {

    @Test
    void singleCharacter() {
        assertEquals("a", CompressString.compress("a"));
    }

    @Test
    void twoSameChars() {
        assertEquals("aa", CompressString.compress("aa"));
    }

    @Test
    void longRunOfSingleChar() {
        assertEquals("b10", CompressString.compress("bbbbbbbbbb"));
    }

    @Test
    void alternatingChars() {
        assertEquals("ababab", CompressString.compress("ababab"));
    }
}
