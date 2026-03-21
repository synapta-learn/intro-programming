import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void areaCalculation() {
        Solution rect = new Solution();
        rect.width = 5.0;
        rect.height = 3.0;
        assertEquals(15.0, rect.area(), 0.001);
    }

    @Test
    void perimeterCalculation() {
        Solution rect = new Solution();
        rect.width = 5.0;
        rect.height = 3.0;
        assertEquals(16.0, rect.perimeter(), 0.001);
    }

    @Test
    void isSquareTrue() {
        Solution square = new Solution();
        square.width = 4.0;
        square.height = 4.0;
        assertTrue(square.isSquare());
    }

    @Test
    void isSquareFalse() {
        Solution rect = new Solution();
        rect.width = 5.0;
        rect.height = 3.0;
        assertFalse(rect.isSquare());
    }
}
