import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testNormalWeight() {
        double result = Solution.calculateBMI(70.0, 1.75);
        assertEquals(22.857, result, 0.01);
    }

    @Test
    public void testOverweight() {
        double result = Solution.calculateBMI(90.0, 1.80);
        assertEquals(27.778, result, 0.01);
    }

    @Test
    public void testLightWeight() {
        double result = Solution.calculateBMI(55.0, 1.65);
        assertEquals(20.202, result, 0.01);
    }
}
