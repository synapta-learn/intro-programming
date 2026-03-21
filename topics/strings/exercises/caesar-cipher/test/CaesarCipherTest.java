import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {

    @Test
    void encryptSimple() {
        assertEquals("bcd", CaesarCipher.encrypt("abc", 1));
    }

    @Test
    void encryptWrapsAround() {
        assertEquals("abc", CaesarCipher.encrypt("xyz", 3));
    }

    @Test
    void encryptPreservesCaseAndPunctuation() {
        assertEquals("Mjqqt, Btwqi!", CaesarCipher.encrypt("Hello, World!", 5));
    }

    @Test
    void decryptReversesEncrypt() {
        assertEquals("Hello, World!", CaesarCipher.decrypt("Mjqqt, Btwqi!", 5));
    }

    @Test
    void encryptEmptyString() {
        assertEquals("", CaesarCipher.encrypt("", 10));
    }
}
