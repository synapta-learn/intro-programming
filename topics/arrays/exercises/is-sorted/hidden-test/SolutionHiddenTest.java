import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void allSameElements() {
        assertTrue(Solution.isSorted(new int[]{3, 3, 3, 3}));
    }

    @Test
    void unsortedAtEnd() {
        assertFalse(Solution.isSorted(new int[]{1, 2, 3, 4, 2}));
    }

    @Test
    void unsortedAtBeginning() {
        assertFalse(Solution.isSorted(new int[]{5, 1, 2, 3, 4}));
    }

    @Test
    void twoElementsSorted() {
        assertTrue(Solution.isSorted(new int[]{1, 2}));
    }

    @Test
    void twoElementsUnsorted() {
        assertFalse(Solution.isSorted(new int[]{2, 1}));
    }

    @Test
    void negativeNumbers() {
        assertTrue(Solution.isSorted(new int[]{-10, -5, 0, 5, 10}));
    }

    @Test
    void negativeNumbersUnsorted() {
        assertFalse(Solution.isSorted(new int[]{-5, -10, 0}));
    }
}
