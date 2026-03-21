import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void encryptSimple() {
        assertEquals("bcd", Solution.encrypt("abc", 1));
    }

    @Test
    void encryptWrapsAround() {
        assertEquals("abc", Solution.encrypt("xyz", 3));
    }

    @Test
    void encryptPreservesCaseAndPunctuation() {
        assertEquals("Mjqqt, Btwqi!", Solution.encrypt("Hello, World!", 5));
    }

    @Test
    void decryptReversesEncrypt() {
        assertEquals("Hello, World!", Solution.decrypt("Mjqqt, Btwqi!", 5));
    }

    @Test
    void encryptEmptyString() {
        assertEquals("", Solution.encrypt("", 10));
    }
}
