import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void theAppearstwice() {
        assertEquals("the", Solution.mostFrequentWord("the cat sat on the mat"));
    }

    @Test
    void singleWord() {
        assertEquals("hello", Solution.mostFrequentWord("hello"));
    }

    @Test
    void caseInsensitive() {
        assertEquals("to", Solution.mostFrequentWord("To be or not to be"));
    }

    @Test
    void emptyString() {
        assertEquals("", Solution.mostFrequentWord(""));
    }
}
