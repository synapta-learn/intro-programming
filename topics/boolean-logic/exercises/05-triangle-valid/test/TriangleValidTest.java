import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleValidTest {

    @Test
    void validRightTriangle() {
        assertTrue(TriangleValid.isValidTriangle(3, 4, 5));
    }

    @Test
    void invalidSumEquals() {
        assertFalse(TriangleValid.isValidTriangle(1, 1, 3));
    }

    @Test
    void equilateral() {
        assertTrue(TriangleValid.isValidTriangle(5, 5, 5));
    }

    @Test
    void zeroSide() {
        assertFalse(TriangleValid.isValidTriangle(0, 1, 1));
    }

    @Test
    void negativeSide() {
        assertFalse(TriangleValid.isValidTriangle(-1, 2, 3));
    }
}
