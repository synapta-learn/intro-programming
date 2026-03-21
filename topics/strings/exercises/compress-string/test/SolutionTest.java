import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void compressRepeatedChars() {
        assertEquals("a2b1c5a3", Solution.compress("aabcccccaaa"));
    }

    @Test
    void noCompressionWhenLonger() {
        assertEquals("abcdef", Solution.compress("abcdef"));
    }

    @Test
    void compressAllSame() {
        assertEquals("a3", Solution.compress("aaa"));
    }

    @Test
    void emptyString() {
        assertEquals("", Solution.compress(""));
    }
}
