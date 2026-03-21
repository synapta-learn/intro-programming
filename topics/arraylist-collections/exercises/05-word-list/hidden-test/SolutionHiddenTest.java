import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void getWordsReturnsACopy() {
        WordList wl = new WordList();
        wl.addWord("alpha");
        wl.addWord("beta");
        ArrayList<String> words = wl.getWords();
        words.clear();  // modifying the returned list
        assertEquals(2, wl.size());  // internal list should be unaffected
    }

    @Test
    void multipleWordsWithContains() {
        WordList wl = new WordList();
        wl.addWord("dog");
        wl.addWord("cat");
        wl.addWord("bird");
        assertTrue(wl.contains("cat"));
        assertTrue(wl.contains("bird"));
        assertFalse(wl.contains("fish"));
    }

    @Test
    void sizeAfterMultipleAdds() {
        WordList wl = new WordList();
        wl.addWord("one");
        wl.addWord("two");
        wl.addWord("three");
        wl.addWord("one");  // duplicate
        assertEquals(3, wl.size());
    }
}
