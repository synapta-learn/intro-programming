import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumTest {

    @Test
    void sumOfOneToFive() {
        assertEquals(15, ArraySum.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void sumWithNegatives() {
        assertEquals(14, ArraySum.sum(new int[]{10, -3, 7}));
    }

    @Test
    void sumOfSingleElement() {
        assertEquals(42, ArraySum.sum(new int[]{42}));
    }

    @Test
    void sumOfEmptyArray() {
        assertEquals(0, ArraySum.sum(new int[]{}));
    }
}
