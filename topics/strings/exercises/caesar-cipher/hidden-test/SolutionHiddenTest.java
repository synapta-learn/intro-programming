import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void shiftBy26IsNoChange() {
        assertEquals("hello", Solution.encrypt("hello", 26));
    }

    @Test
    void encryptThenDecryptRoundTrip() {
        String original = "The quick brown fox jumps over 13 lazy dogs!";
        String encrypted = Solution.encrypt(original, 17);
        assertEquals(original, Solution.decrypt(encrypted, 17));
    }

    @Test
    void decryptSimple() {
        assertEquals("abc", Solution.decrypt("bcd", 1));
    }
}
