import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void areaCalculation() {
        Rectangle rect = new Rectangle();
        rect.width = 5.0;
        rect.height = 3.0;
        assertEquals(15.0, rect.area(), 0.001);
    }

    @Test
    void perimeterCalculation() {
        Rectangle rect = new Rectangle();
        rect.width = 5.0;
        rect.height = 3.0;
        assertEquals(16.0, rect.perimeter(), 0.001);
    }

    @Test
    void isSquareTrue() {
        Rectangle square = new Rectangle();
        square.width = 4.0;
        square.height = 4.0;
        assertTrue(square.isSquare());
    }

    @Test
    void isSquareFalse() {
        Rectangle rect = new Rectangle();
        rect.width = 5.0;
        rect.height = 3.0;
        assertFalse(rect.isSquare());
    }
}
