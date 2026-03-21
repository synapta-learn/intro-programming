import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void validRightTriangle() {
        assertTrue(Solution.isValidTriangle(3, 4, 5));
    }

    @Test
    void invalidSumEquals() {
        assertFalse(Solution.isValidTriangle(1, 1, 3));
    }

    @Test
    void equilateral() {
        assertTrue(Solution.isValidTriangle(5, 5, 5));
    }

    @Test
    void zeroSide() {
        assertFalse(Solution.isValidTriangle(0, 1, 1));
    }

    @Test
    void negativeSide() {
        assertFalse(Solution.isValidTriangle(-1, 2, 3));
    }
}
