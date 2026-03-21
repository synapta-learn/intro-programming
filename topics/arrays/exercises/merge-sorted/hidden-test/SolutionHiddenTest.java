import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void mergeDifferentLengths() {
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5},
            Solution.mergeSorted(new int[]{1, 5}, new int[]{2, 3, 4})
        );
    }

    @Test
    void mergeWithDuplicates() {
        assertArrayEquals(
            new int[]{1, 2, 2, 3, 3, 4},
            Solution.mergeSorted(new int[]{1, 2, 3}, new int[]{2, 3, 4})
        );
    }

    @Test
    void mergeFirstEmpty() {
        assertArrayEquals(
            new int[]{5, 10, 15},
            Solution.mergeSorted(new int[]{5, 10, 15}, new int[]{})
        );
    }

    @Test
    void mergeSingleElements() {
        assertArrayEquals(
            new int[]{1, 2},
            Solution.mergeSorted(new int[]{1}, new int[]{2})
        );
    }

    @Test
    void mergeSingleElementReversed() {
        assertArrayEquals(
            new int[]{1, 2},
            Solution.mergeSorted(new int[]{2}, new int[]{1})
        );
    }

    @Test
    void mergeWithNegatives() {
        assertArrayEquals(
            new int[]{-5, -3, -1, 0, 2, 4},
            Solution.mergeSorted(new int[]{-5, -1, 2}, new int[]{-3, 0, 4})
        );
    }

    @Test
    void mergeAllSame() {
        assertArrayEquals(
            new int[]{3, 3, 3, 3},
            Solution.mergeSorted(new int[]{3, 3}, new int[]{3, 3})
        );
    }

    @Test
    void resultHasCorrectLength() {
        int[] result = Solution.mergeSorted(new int[]{1, 2, 3}, new int[]{4, 5});
        assertEquals(5, result.length);
    }
}
