import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsSortedHiddenTest {

    @Test
    void allSameElements() {
        assertTrue(IsSorted.isSorted(new int[]{3, 3, 3, 3}));
    }

    @Test
    void unsortedAtEnd() {
        assertFalse(IsSorted.isSorted(new int[]{1, 2, 3, 4, 2}));
    }

    @Test
    void unsortedAtBeginning() {
        assertFalse(IsSorted.isSorted(new int[]{5, 1, 2, 3, 4}));
    }

    @Test
    void twoElementsSorted() {
        assertTrue(IsSorted.isSorted(new int[]{1, 2}));
    }

    @Test
    void twoElementsUnsorted() {
        assertFalse(IsSorted.isSorted(new int[]{2, 1}));
    }

    @Test
    void negativeNumbers() {
        assertTrue(IsSorted.isSorted(new int[]{-10, -5, 0, 5, 10}));
    }

    @Test
    void negativeNumbersUnsorted() {
        assertFalse(IsSorted.isSorted(new int[]{-5, -10, 0}));
    }
}
