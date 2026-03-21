import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void twoWords() {
        assertEquals("Hello World", Solution.capitalizeWords("hello world"));
    }

    @Test
    void alreadyUppercase() {
        assertEquals("Already Caps", Solution.capitalizeWords("ALREADY CAPS"));
    }

    @Test
    void singleCharacter() {
        assertEquals("A", Solution.capitalizeWords("a"));
    }

    @Test
    void emptyString() {
        assertEquals("", Solution.capitalizeWords(""));
    }
}
