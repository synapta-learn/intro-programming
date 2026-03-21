import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void createListFromEmptyArray() {
        ArrayList<String> list = Solution.createList(new String[]{});
        assertTrue(list.isEmpty());
    }

    @Test
    void removeByIndexOutOfBoundsReturnsNull() {
        ArrayList<String> list = Solution.createList(new String[]{"A", "B"});
        assertNull(Solution.removeByIndex(list, 5));
        assertNull(Solution.removeByIndex(list, -1));
        assertEquals(2, list.size());
    }

    @Test
    void removeByValueNotFoundReturnsFalse() {
        ArrayList<String> list = Solution.createList(new String[]{"Alice", "Bob"});
        assertFalse(Solution.removeByValue(list, "Eve"));
        assertEquals(2, list.size());
    }

    @Test
    void toArrayFromEmptyList() {
        ArrayList<String> list = Solution.createList(new String[]{});
        String[] arr = Solution.toArray(list);
        assertEquals(0, arr.length);
    }
}
