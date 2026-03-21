import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class FrequencyMapTest {

    private ArrayList<String> listOf(String... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void countOfExistingItems() {
        FrequencyCounter fc = new FrequencyCounter(listOf("cat", "dog", "cat", "bird", "cat", "dog"));
        assertEquals(3, fc.countOf("cat"));
        assertEquals(2, fc.countOf("dog"));
        assertEquals(1, fc.countOf("bird"));
    }

    @Test
    void countOfMissingItem() {
        FrequencyCounter fc = new FrequencyCounter(listOf("a", "b"));
        assertEquals(0, fc.countOf("z"));
    }

    @Test
    void mostCommonElement() {
        FrequencyCounter fc = new FrequencyCounter(listOf("x", "y", "x", "z", "x"));
        assertEquals("x", fc.mostCommon());
    }

    @Test
    void uniqueCount() {
        FrequencyCounter fc = new FrequencyCounter(listOf("a", "b", "a", "c", "b"));
        assertEquals(3, fc.uniqueCount());
    }
}
