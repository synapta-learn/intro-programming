import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void addAndContains() {
        WordList wl = new WordList();
        wl.addWord("hello");
        assertTrue(wl.contains("hello"));
        assertFalse(wl.contains("world"));
    }

    @Test
    void noDuplicates() {
        WordList wl = new WordList();
        wl.addWord("cat");
        wl.addWord("cat");
        wl.addWord("cat");
        assertEquals(1, wl.size());
    }

    @Test
    void getWordsReturnsSorted() {
        WordList wl = new WordList();
        wl.addWord("banana");
        wl.addWord("apple");
        wl.addWord("cherry");
        ArrayList<String> words = wl.getWords();
        assertEquals(new ArrayList<>(Arrays.asList("apple", "banana", "cherry")), words);
    }

    @Test
    void emptyListSize() {
        WordList wl = new WordList();
        assertEquals(0, wl.size());
        assertTrue(wl.getWords().isEmpty());
    }
}
