import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void constructorSetsCoordinates() {
        Solution p = new Solution(3.0, 4.0);
        assertEquals(3.0, p.getX(), 0.001);
        assertEquals(4.0, p.getY(), 0.001);
    }

    @Test
    void distanceTo345() {
        Solution p = new Solution(3.0, 4.0);
        Solution origin = new Solution(0.0, 0.0);
        assertEquals(5.0, p.distanceTo(origin), 0.001);
    }

    @Test
    void translateReturnsNewPoint() {
        Solution p = new Solution(1.0, 2.0);
        Solution moved = p.translate(3.0, -1.0);
        assertEquals(4.0, moved.getX(), 0.001);
        assertEquals(1.0, moved.getY(), 0.001);
    }

    @Test
    void translateDoesNotModifyOriginal() {
        Solution p = new Solution(1.0, 2.0);
        p.translate(10.0, 10.0);
        assertEquals(1.0, p.getX(), 0.001);
        assertEquals(2.0, p.getY(), 0.001);
    }
}
