import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumHiddenTest {

    @Test
    void sumAllNegatives() {
        assertEquals(-15, ArraySum.sum(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    void sumWithZeros() {
        assertEquals(6, ArraySum.sum(new int[]{0, 1, 0, 2, 0, 3}));
    }

    @Test
    void sumLargerArray() {
        assertEquals(55, ArraySum.sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void sumAllZeros() {
        assertEquals(0, ArraySum.sum(new int[]{0, 0, 0, 0}));
    }

    @Test
    void sumTwoElements() {
        assertEquals(7, ArraySum.sum(new int[]{3, 4}));
    }

    @Test
    void sumMixedPositiveNegative() {
        assertEquals(0, ArraySum.sum(new int[]{5, -5, 10, -10}));
    }
}
