import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void maxInMixedArray() {
        assertEquals(9, Solution.findMax(new int[]{3, 7, 2, 9, 4}));
    }

    @Test
    void maxInNegativeArray() {
        assertEquals(-2, Solution.findMax(new int[]{-5, -2, -8}));
    }

    @Test
    void maxSingleElement() {
        assertEquals(42, Solution.findMax(new int[]{42}));
    }

    @Test
    void maxAllSame() {
        assertEquals(5, Solution.findMax(new int[]{5, 5, 5}));
    }
}
