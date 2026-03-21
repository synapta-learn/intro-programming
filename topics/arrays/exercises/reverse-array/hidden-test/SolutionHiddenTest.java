import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void doesNotModifyOriginal() {
        int[] original = {1, 2, 3};
        Solution.reverse(original);
        assertArrayEquals(new int[]{1, 2, 3}, original);
    }

    @Test
    void reverseWithNegatives() {
        assertArrayEquals(new int[]{-3, -2, -1}, Solution.reverse(new int[]{-1, -2, -3}));
    }

    @Test
    void reversePalindrome() {
        assertArrayEquals(new int[]{1, 2, 3, 2, 1}, Solution.reverse(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    void reverseAllSame() {
        assertArrayEquals(new int[]{5, 5, 5}, Solution.reverse(new int[]{5, 5, 5}));
    }

    @Test
    void reverseReturnsNewArray() {
        int[] original = {1, 2, 3};
        int[] reversed = Solution.reverse(original);
        assertNotSame(original, reversed);
    }

    @Test
    void reverseLargerArray() {
        assertArrayEquals(
            new int[]{8, 7, 6, 5, 4, 3, 2, 1},
            Solution.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8})
        );
    }
}
