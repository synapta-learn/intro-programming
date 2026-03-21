import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void tieReturnsFirst() {
        assertEquals("a", Solution.mostFrequentWord("a b a b c"));
    }

    @Test
    void allSameWord() {
        assertEquals("go", Solution.mostFrequentWord("go go go"));
    }

    @Test
    void allUnique() {
        assertEquals("one", Solution.mostFrequentWord("one two three"));
    }
}
