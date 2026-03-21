import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class FlattenListsHiddenTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void flattenAllEmptyInner() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(new ArrayList<>());
        nested.add(new ArrayList<>());
        assertTrue(FlattenLists.flatten(nested).isEmpty());
    }

    @Test
    void flattenPreservesOrder() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(listOf(3, 1));
        nested.add(listOf(4, 1));
        nested.add(listOf(5, 9));
        assertEquals(listOf(3, 1, 4, 1, 5, 9), FlattenLists.flatten(nested));
    }

    @Test
    void flattenWithNegatives() {
        ArrayList<ArrayList<Integer>> nested = new ArrayList<>();
        nested.add(listOf(-1, -2));
        nested.add(listOf(0));
        nested.add(listOf(1, 2));
        assertEquals(listOf(-1, -2, 0, 1, 2), FlattenLists.flatten(nested));
    }
}
