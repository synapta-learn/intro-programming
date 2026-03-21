import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointDistanceTest {

    @Test
    void threeFourFiveTriangle() {
        assertEquals(5.0, PointDistance.distance(0, 0, 3, 4), 0.001);
    }

    @Test
    void samePoint() {
        assertEquals(0.0, PointDistance.distance(1, 1, 1, 1), 0.001);
    }

    @Test
    void horizontalDistance() {
        assertEquals(1.0, PointDistance.distance(0, 0, 1, 0), 0.001);
    }

    @Test
    void withNegativeCoordinates() {
        assertEquals(5.0, PointDistance.distance(-1, -1, 2, 3), 0.001);
    }
}
