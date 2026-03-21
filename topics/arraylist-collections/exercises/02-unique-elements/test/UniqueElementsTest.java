import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueElementsTest {

    private ArrayList<String> listOf(String... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void removesDuplicates() {
        ArrayList<String> result = UniqueElements.uniqueElements(listOf("apple", "banana", "apple", "cherry"));
        assertEquals(listOf("apple", "banana", "cherry"), result);
    }

    @Test
    void preservesOrderOfFirstOccurrence() {
        ArrayList<String> result = UniqueElements.uniqueElements(listOf("c", "a", "b", "a", "c"));
        assertEquals(listOf("c", "a", "b"), result);
    }

    @Test
    void allUniqueUnchanged() {
        ArrayList<String> result = UniqueElements.uniqueElements(listOf("x", "y", "z"));
        assertEquals(listOf("x", "y", "z"), result);
    }

    @Test
    void emptyListReturnsEmpty() {
        ArrayList<String> result = UniqueElements.uniqueElements(new ArrayList<>());
        assertTrue(result.isEmpty());
    }
}
