import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeWordsTest {

    @Test
    void twoWords() {
        assertEquals("Hello World", CapitalizeWords.capitalizeWords("hello world"));
    }

    @Test
    void alreadyUppercase() {
        assertEquals("Already Caps", CapitalizeWords.capitalizeWords("ALREADY CAPS"));
    }

    @Test
    void singleCharacter() {
        assertEquals("A", CapitalizeWords.capitalizeWords("a"));
    }

    @Test
    void emptyString() {
        assertEquals("", CapitalizeWords.capitalizeWords(""));
    }
}
