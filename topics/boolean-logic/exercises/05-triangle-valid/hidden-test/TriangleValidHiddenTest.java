import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleValidHiddenTest {

    @Test
    void degenerateTriangle() {
        // 1 + 2 = 3, not strictly greater
        assertFalse(TriangleValid.isValidTriangle(1, 2, 3));
    }

    @Test
    void allZeros() {
        assertFalse(TriangleValid.isValidTriangle(0, 0, 0));
    }

    @Test
    void largeValidTriangle() {
        assertTrue(TriangleValid.isValidTriangle(100, 100, 100));
    }

    @Test
    void invalidThirdSideTooLong() {
        assertFalse(TriangleValid.isValidTriangle(2, 3, 10));
    }
}
