import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void distanceToSamePoint() {
        Solution p1 = new Solution(5.0, 5.0);
        Solution p2 = new Solution(5.0, 5.0);
        assertEquals(0.0, p1.distanceTo(p2), 0.001);
    }

    @Test
    void negativeCoordinates() {
        Solution p = new Solution(-3.0, -4.0);
        assertEquals(-3.0, p.getX(), 0.001);
        assertEquals(-4.0, p.getY(), 0.001);
    }

    @Test
    void translateByZero() {
        Solution p = new Solution(7.0, 8.0);
        Solution same = p.translate(0.0, 0.0);
        assertEquals(7.0, same.getX(), 0.001);
        assertEquals(8.0, same.getY(), 0.001);
    }
}
