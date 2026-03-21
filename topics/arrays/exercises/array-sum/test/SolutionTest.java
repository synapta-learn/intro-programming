import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sumOfOneToFive() {
        assertEquals(15, Solution.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void sumWithNegatives() {
        assertEquals(14, Solution.sum(new int[]{10, -3, 7}));
    }

    @Test
    void sumOfSingleElement() {
        assertEquals(42, Solution.sum(new int[]{42}));
    }

    @Test
    void sumOfEmptyArray() {
        assertEquals(0, Solution.sum(new int[]{}));
    }
}
