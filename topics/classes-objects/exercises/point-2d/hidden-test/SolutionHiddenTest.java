import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void originDistanceToOrigin() {
        Solution p = new Solution();
        p.x = 0.0;
        p.y = 0.0;
        assertEquals(0.0, p.distanceToOrigin(), 0.001);
    }

    @Test
    void negativeCoordinates() {
        Solution p1 = new Solution();
        p1.x = -3.0;
        p1.y = -4.0;
        assertEquals(5.0, p1.distanceToOrigin(), 0.001);
    }

    @Test
    void distanceIsSymmetric() {
        Solution p1 = new Solution();
        p1.x = 1.0;
        p1.y = 0.0;
        Solution p2 = new Solution();
        p2.x = 4.0;
        p2.y = 0.0;
        assertEquals(p1.distanceTo(p2), p2.distanceTo(p1), 0.001);
    }
}
