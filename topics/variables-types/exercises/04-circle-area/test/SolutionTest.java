import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testRadiusOne() {
        assertEquals(Math.PI, Solution.circleArea(1.0), 0.0001);
    }

    @Test
    public void testRadiusFive() {
        assertEquals(78.5398, Solution.circleArea(5.0), 0.001);
    }

    @Test
    public void testRadiusZero() {
        assertEquals(0.0, Solution.circleArea(0.0), 0.0001);
    }
}
