import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void emptyArray() {
        int[] data = {};
        new Sorter(new BubbleSort()).sort(data);
        assertArrayEquals(new int[]{}, data);

        new Sorter(new SelectionSort()).sort(data);
        assertArrayEquals(new int[]{}, data);
    }

    @Test
    void singleElement() {
        int[] data = {42};
        new Sorter(new BubbleSort()).sort(data);
        assertArrayEquals(new int[]{42}, data);
    }

    @Test
    void withNegatives() {
        int[] data = {3, -1, 4, -5, 2};
        new Sorter(new SelectionSort()).sort(data);
        assertArrayEquals(new int[]{-5, -1, 2, 3, 4}, data);
    }

    @Test
    void duplicates() {
        int[] data = {5, 5, 3, 3, 1, 1};
        new Sorter(new BubbleSort()).sort(data);
        assertArrayEquals(new int[]{1, 1, 3, 3, 5, 5}, data);
    }
}
