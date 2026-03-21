import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    private ArrayList<String> listOf(String... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void emptyList() {
        FrequencyCounter fc = new FrequencyCounter(new ArrayList<>());
        assertNull(fc.mostCommon());
        assertEquals(0, fc.uniqueCount());
        assertEquals(0, fc.countOf("anything"));
    }

    @Test
    void singleElement() {
        FrequencyCounter fc = new FrequencyCounter(listOf("solo"));
        assertEquals(1, fc.countOf("solo"));
        assertEquals("solo", fc.mostCommon());
        assertEquals(1, fc.uniqueCount());
    }

    @Test
    void tieBreaksByFirstOccurrence() {
        // "a" and "b" both appear twice, but "a" comes first
        FrequencyCounter fc = new FrequencyCounter(listOf("a", "b", "a", "b"));
        assertEquals("a", fc.mostCommon());
    }
}
