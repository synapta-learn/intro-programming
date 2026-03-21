import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyTest {

    @Test
    void theAppearstwice() {
        assertEquals("the", WordFrequency.mostFrequentWord("the cat sat on the mat"));
    }

    @Test
    void singleWord() {
        assertEquals("hello", WordFrequency.mostFrequentWord("hello"));
    }

    @Test
    void caseInsensitive() {
        assertEquals("to", WordFrequency.mostFrequentWord("To be or not to be"));
    }

    @Test
    void emptyString() {
        assertEquals("", WordFrequency.mostFrequentWord(""));
    }
}
