import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void distanceToOrigin345() {
        Solution p = new Solution();
        p.x = 3.0;
        p.y = 4.0;
        assertEquals(5.0, p.distanceToOrigin(), 0.001);
    }

    @Test
    void distanceBetweenTwoPoints() {
        Solution p1 = new Solution();
        p1.x = 1.0;
        p1.y = 2.0;
        Solution p2 = new Solution();
        p2.x = 4.0;
        p2.y = 6.0;
        assertEquals(5.0, p1.distanceTo(p2), 0.001);
    }

    @Test
    void translateMovesPoint() {
        Solution p = new Solution();
        p.x = 1.0;
        p.y = 1.0;
        p.translate(3.0, -1.0);
        assertEquals(4.0, p.x, 0.001);
        assertEquals(0.0, p.y, 0.001);
    }

    @Test
    void distanceToSamePoint() {
        Solution p1 = new Solution();
        p1.x = 5.0;
        p1.y = 5.0;
        Solution p2 = new Solution();
        p2.x = 5.0;
        p2.y = 5.0;
        assertEquals(0.0, p1.distanceTo(p2), 0.001);
    }
}
