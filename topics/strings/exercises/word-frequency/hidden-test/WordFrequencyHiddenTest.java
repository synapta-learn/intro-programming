import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyHiddenTest {

    @Test
    void tieReturnsFirst() {
        assertEquals("a", WordFrequency.mostFrequentWord("a b a b c"));
    }

    @Test
    void allSameWord() {
        assertEquals("go", WordFrequency.mostFrequentWord("go go go"));
    }

    @Test
    void allUnique() {
        assertEquals("one", WordFrequency.mostFrequentWord("one two three"));
    }
}
