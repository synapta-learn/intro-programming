import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImmutablePointHiddenTest {

    @Test
    void distanceToSamePoint() {
        ImmutablePoint p1 = new ImmutablePoint(5.0, 5.0);
        ImmutablePoint p2 = new ImmutablePoint(5.0, 5.0);
        assertEquals(0.0, p1.distanceTo(p2), 0.001);
    }

    @Test
    void negativeCoordinates() {
        ImmutablePoint p = new ImmutablePoint(-3.0, -4.0);
        assertEquals(-3.0, p.getX(), 0.001);
        assertEquals(-4.0, p.getY(), 0.001);
    }

    @Test
    void translateByZero() {
        ImmutablePoint p = new ImmutablePoint(7.0, 8.0);
        ImmutablePoint same = p.translate(0.0, 0.0);
        assertEquals(7.0, same.getX(), 0.001);
        assertEquals(8.0, same.getY(), 0.001);
    }
}
