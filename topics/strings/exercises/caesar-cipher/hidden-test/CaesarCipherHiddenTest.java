import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherHiddenTest {

    @Test
    void shiftBy26IsNoChange() {
        assertEquals("hello", CaesarCipher.encrypt("hello", 26));
    }

    @Test
    void encryptThenDecryptRoundTrip() {
        String original = "The quick brown fox jumps over 13 lazy dogs!";
        String encrypted = CaesarCipher.encrypt(original, 17);
        assertEquals(original, CaesarCipher.decrypt(encrypted, 17));
    }

    @Test
    void decryptSimple() {
        assertEquals("abc", CaesarCipher.decrypt("bcd", 1));
    }
}
