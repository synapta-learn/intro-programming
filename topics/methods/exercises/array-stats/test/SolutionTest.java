import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void minOfArray() {
        assertEquals(1, Solution.min(new int[]{3, 7, 1, 9, 4}));
    }

    @Test
    void maxOfArray() {
        assertEquals(9, Solution.max(new int[]{3, 7, 1, 9, 4}));
    }

    @Test
    void averageOfArray() {
        assertEquals(4.8, Solution.average(new int[]{3, 7, 1, 9, 4}), 0.001);
    }

    @Test
    void singleElement() {
        assertEquals(10, Solution.min(new int[]{10}));
        assertEquals(10, Solution.max(new int[]{10}));
        assertEquals(10.0, Solution.average(new int[]{10}), 0.001);
    }
}
