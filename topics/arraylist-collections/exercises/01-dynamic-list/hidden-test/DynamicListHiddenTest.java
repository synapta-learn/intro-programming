import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicListHiddenTest {

    @Test
    void createListFromEmptyArray() {
        ArrayList<String> list = DynamicList.createList(new String[]{});
        assertTrue(list.isEmpty());
    }

    @Test
    void removeByIndexOutOfBoundsReturnsNull() {
        ArrayList<String> list = DynamicList.createList(new String[]{"A", "B"});
        assertNull(DynamicList.removeByIndex(list, 5));
        assertNull(DynamicList.removeByIndex(list, -1));
        assertEquals(2, list.size());
    }

    @Test
    void removeByValueNotFoundReturnsFalse() {
        ArrayList<String> list = DynamicList.createList(new String[]{"Alice", "Bob"});
        assertFalse(DynamicList.removeByValue(list, "Eve"));
        assertEquals(2, list.size());
    }

    @Test
    void toArrayFromEmptyList() {
        ArrayList<String> list = DynamicList.createList(new String[]{});
        String[] arr = DynamicList.toArray(list);
        assertEquals(0, arr.length);
    }
}
