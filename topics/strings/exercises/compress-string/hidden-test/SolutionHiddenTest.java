import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void singleCharacter() {
        assertEquals("a", Solution.compress("a"));
    }

    @Test
    void twoSameChars() {
        assertEquals("aa", Solution.compress("aa"));
    }

    @Test
    void longRunOfSingleChar() {
        assertEquals("b10", Solution.compress("bbbbbbbbbb"));
    }

    @Test
    void alternatingChars() {
        assertEquals("ababab", Solution.compress("ababab"));
    }
}
