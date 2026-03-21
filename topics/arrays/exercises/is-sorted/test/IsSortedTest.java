import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsSortedTest {

    @Test
    void sortedArray() {
        assertTrue(IsSorted.isSorted(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void unsortedArray() {
        assertFalse(IsSorted.isSorted(new int[]{1, 3, 2, 4}));
    }

    @Test
    void descendingArray() {
        assertFalse(IsSorted.isSorted(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void sortedWithDuplicates() {
        assertTrue(IsSorted.isSorted(new int[]{1, 1, 2, 2, 3}));
    }

    @Test
    void emptyArray() {
        assertTrue(IsSorted.isSorted(new int[]{}));
    }

    @Test
    void singleElement() {
        assertTrue(IsSorted.isSorted(new int[]{7}));
    }
}
