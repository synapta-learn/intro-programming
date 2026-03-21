import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void mergeInterleaved() {
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5, 6},
            Solution.mergeSorted(new int[]{1, 3, 5}, new int[]{2, 4, 6})
        );
    }

    @Test
    void mergeNonOverlapping() {
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5, 6},
            Solution.mergeSorted(new int[]{1, 2, 3}, new int[]{4, 5, 6})
        );
    }

    @Test
    void mergeWithEmptyArray() {
        assertArrayEquals(
            new int[]{1, 2, 3},
            Solution.mergeSorted(new int[]{}, new int[]{1, 2, 3})
        );
    }

    @Test
    void mergeTwoEmptyArrays() {
        assertArrayEquals(
            new int[]{},
            Solution.mergeSorted(new int[]{}, new int[]{})
        );
    }
}
