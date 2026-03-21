import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class FlattenListsTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void flattenMultipleLists() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(listOf(1, 2));
        nested.add(listOf(3, 4));
        nested.add(listOf(5));
        assertEquals(listOf(1, 2, 3, 4, 5), FlattenLists.flatten(nested));
    }

    @Test
    void flattenWithEmptyInnerLists() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(listOf(10));
        nested.add(new ArrayList<>());
        nested.add(listOf(20, 30));
        assertEquals(listOf(10, 20, 30), FlattenLists.flatten(nested));
    }

    @Test
    void flattenEmptyOuter() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        assertTrue(FlattenLists.flatten(nested).isEmpty());
    }

    @Test
    void flattenSingleList() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(listOf(7, 8, 9));
        assertEquals(listOf(7, 8, 9), FlattenLists.flatten(nested));
    }
}
