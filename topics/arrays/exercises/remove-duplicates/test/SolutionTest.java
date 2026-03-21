import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void removeDuplicatesFromMixed() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Solution.removeDuplicates(new int[]{1, 2, 3, 2, 1, 4}));
    }

    @Test
    void allDuplicates() {
        assertArrayEquals(new int[]{5}, Solution.removeDuplicates(new int[]{5, 5, 5, 5}));
    }

    @Test
    void noDuplicates() {
        assertArrayEquals(new int[]{1, 2, 3}, Solution.removeDuplicates(new int[]{1, 2, 3}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[]{}, Solution.removeDuplicates(new int[]{}));
    }
}
