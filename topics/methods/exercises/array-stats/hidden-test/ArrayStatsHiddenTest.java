import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStatsHiddenTest {

    @Test
    void minWithNegatives() {
        assertEquals(-10, ArrayStats.min(new int[]{-3, -10, -1}));
    }

    @Test
    void maxWithNegatives() {
        assertEquals(-1, ArrayStats.max(new int[]{-3, -10, -1}));
    }

    @Test
    void averageWithNegatives() {
        assertEquals(-2.0, ArrayStats.average(new int[]{-1, -2, -3}), 0.001);
    }

    @Test
    void averageNotIntegerResult() {
        // Average of {1, 2} is 1.5, not 1
        assertEquals(1.5, ArrayStats.average(new int[]{1, 2}), 0.001);
    }

    @Test
    void averageOfOddCount() {
        assertEquals(2.0, ArrayStats.average(new int[]{1, 2, 3}), 0.001);
    }

    @Test
    void minAtEnd() {
        assertEquals(0, ArrayStats.min(new int[]{5, 3, 7, 0}));
    }

    @Test
    void maxAtBeginning() {
        assertEquals(100, ArrayStats.max(new int[]{100, 50, 25}));
    }

    @Test
    void allSameValues() {
        assertEquals(4, ArrayStats.min(new int[]{4, 4, 4}));
        assertEquals(4, ArrayStats.max(new int[]{4, 4, 4}));
        assertEquals(4.0, ArrayStats.average(new int[]{4, 4, 4}), 0.001);
    }

    @Test
    void twoElements() {
        assertEquals(1, ArrayStats.min(new int[]{1, 5}));
        assertEquals(5, ArrayStats.max(new int[]{1, 5}));
        assertEquals(3.0, ArrayStats.average(new int[]{1, 5}), 0.001);
    }
}
