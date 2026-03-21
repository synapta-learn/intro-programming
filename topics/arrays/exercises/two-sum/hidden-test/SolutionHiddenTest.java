import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void pairAtEnd() {
        assertArrayEquals(new int[]{2, 3}, Solution.twoSum(new int[]{1, 2, 5, 4}, 9));
    }

    @Test
    void withNegatives() {
        assertArrayEquals(new int[]{0, 2}, Solution.twoSum(new int[]{-1, 3, 5}, 4));
    }

    @Test
    void targetZero() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{-3, 3, 1}, 0));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{}, Solution.twoSum(new int[]{5}, 5));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[]{}, Solution.twoSum(new int[]{}, 5));
    }

    @Test
    void firstPairReturned() {
        // Multiple valid pairs: (0,3) and (1,2) — (0,3) should be returned
        assertArrayEquals(new int[]{0, 3}, Solution.twoSum(new int[]{1, 3, 4, 6}, 7));
    }

    @Test
    void largerArray() {
        assertArrayEquals(new int[]{3, 4}, Solution.twoSum(new int[]{10, 20, 30, 40, 50}, 90));
    }
}
