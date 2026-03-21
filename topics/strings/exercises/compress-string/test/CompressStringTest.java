import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompressStringTest {

    @Test
    void compressRepeatedChars() {
        assertEquals("a2b1c5a3", CompressString.compress("aabcccccaaa"));
    }

    @Test
    void noCompressionWhenLonger() {
        assertEquals("abcdef", CompressString.compress("abcdef"));
    }

    @Test
    void compressAllSame() {
        assertEquals("a3", CompressString.compress("aaa"));
    }

    @Test
    void emptyString() {
        assertEquals("", CompressString.compress(""));
    }
}
