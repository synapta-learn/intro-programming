import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaTest {

    @Test
    public void testRadiusOne() {
        assertEquals(Math.PI, CircleArea.circleArea(1.0), 0.0001);
    }

    @Test
    public void testRadiusFive() {
        assertEquals(78.5398, CircleArea.circleArea(5.0), 0.001);
    }

    @Test
    public void testRadiusZero() {
        assertEquals(0.0, CircleArea.circleArea(0.0), 0.0001);
    }
}
