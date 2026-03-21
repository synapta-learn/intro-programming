import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicListTest {

    @Test
    void createListFromArray() {
        ArrayList<String> list = DynamicList.createList(new String[]{"A", "B", "C"});
        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(2));
    }

    @Test
    void removeByIndexReturnsElement() {
        ArrayList<String> list = DynamicList.createList(new String[]{"X", "Y", "Z"});
        String removed = DynamicList.removeByIndex(list, 1);
        assertEquals("Y", removed);
        assertEquals(2, list.size());
    }

    @Test
    void removeByValueReturnsTrue() {
        ArrayList<String> list = DynamicList.createList(new String[]{"Alice", "Bob", "Carol"});
        assertTrue(DynamicList.removeByValue(list, "Bob"));
        assertEquals(2, list.size());
    }

    @Test
    void toArrayConvertsCorrectly() {
        ArrayList<String> list = DynamicList.createList(new String[]{"one", "two"});
        String[] arr = DynamicList.toArray(list);
        assertArrayEquals(new String[]{"one", "two"}, arr);
    }
}
