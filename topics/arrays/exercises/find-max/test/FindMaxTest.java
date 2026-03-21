import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMaxTest {

    @Test
    void maxInMixedArray() {
        assertEquals(9, FindMax.findMax(new int[]{3, 7, 2, 9, 4}));
    }

    @Test
    void maxInNegativeArray() {
        assertEquals(-2, FindMax.findMax(new int[]{-5, -2, -8}));
    }

    @Test
    void maxSingleElement() {
        assertEquals(42, FindMax.findMax(new int[]{42}));
    }

    @Test
    void maxAllSame() {
        assertEquals(5, FindMax.findMax(new int[]{5, 5, 5}));
    }
}
