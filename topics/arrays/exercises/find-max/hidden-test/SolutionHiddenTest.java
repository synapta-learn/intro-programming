import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void maxAtBeginning() {
        assertEquals(100, Solution.findMax(new int[]{100, 50, 25, 10}));
    }

    @Test
    void maxAtEnd() {
        assertEquals(99, Solution.findMax(new int[]{10, 20, 30, 99}));
    }

    @Test
    void maxInMiddle() {
        assertEquals(50, Solution.findMax(new int[]{10, 50, 30}));
    }

    @Test
    void allNegativeNumbers() {
        assertEquals(-1, Solution.findMax(new int[]{-10, -5, -1, -20}));
    }

    @Test
    void twoElements() {
        assertEquals(7, Solution.findMax(new int[]{3, 7}));
    }

    @Test
    void largerArray() {
        assertEquals(10, Solution.findMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void maxWithZero() {
        assertEquals(0, Solution.findMax(new int[]{-3, -1, 0, -5}));
    }
}
