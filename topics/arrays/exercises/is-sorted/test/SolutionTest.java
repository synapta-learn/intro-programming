import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sortedArray() {
        assertTrue(Solution.isSorted(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void unsortedArray() {
        assertFalse(Solution.isSorted(new int[]{1, 3, 2, 4}));
    }

    @Test
    void descendingArray() {
        assertFalse(Solution.isSorted(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void sortedWithDuplicates() {
        assertTrue(Solution.isSorted(new int[]{1, 1, 2, 2, 3}));
    }

    @Test
    void emptyArray() {
        assertTrue(Solution.isSorted(new int[]{}));
    }

    @Test
    void singleElement() {
        assertTrue(Solution.isSorted(new int[]{7}));
    }
}
