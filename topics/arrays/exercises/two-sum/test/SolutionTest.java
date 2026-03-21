import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void basicTwoSum() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void pairInMiddle() {
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void noPairFound() {
        assertArrayEquals(new int[]{}, Solution.twoSum(new int[]{1, 2, 3}, 10));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{3, 3}, 6));
    }
}
