import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyPatternTest {

    @Test
    void bubbleSortWorks() {
        int[] data = {5, 2, 8, 1, 9};
        Sorter s = new Sorter(new BubbleSort());
        s.sort(data);
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, data);
    }

    @Test
    void selectionSortWorks() {
        int[] data = {3, 1, 4, 1, 5};
        Sorter s = new Sorter(new SelectionSort());
        s.sort(data);
        assertArrayEquals(new int[]{1, 1, 3, 4, 5}, data);
    }

    @Test
    void switchStrategy() {
        Sorter s = new Sorter(new BubbleSort());
        assertEquals("BubbleSort", s.getStrategyName());
        s.setStrategy(new SelectionSort());
        assertEquals("SelectionSort", s.getStrategyName());

        int[] data = {9, 7, 5, 3, 1};
        s.sort(data);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, data);
    }

    @Test
    void alreadySorted() {
        int[] data = {1, 2, 3, 4, 5};
        Sorter s = new Sorter(new BubbleSort());
        s.sort(data);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }
}
