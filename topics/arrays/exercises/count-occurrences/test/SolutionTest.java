import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void countMultipleOccurrences() {
        assertEquals(3, Solution.countOccurrences(new int[]{1, 2, 3, 2, 4, 2}, 2));
    }

    @Test
    void countAllSame() {
        assertEquals(4, Solution.countOccurrences(new int[]{5, 5, 5, 5}, 5));
    }

    @Test
    void countNotFound() {
        assertEquals(0, Solution.countOccurrences(new int[]{1, 2, 3}, 7));
    }

    @Test
    void countInEmptyArray() {
        assertEquals(0, Solution.countOccurrences(new int[]{}, 1));
    }
}
