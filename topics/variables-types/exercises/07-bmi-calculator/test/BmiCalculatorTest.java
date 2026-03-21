import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    @Test
    public void testNormalWeight() {
        double result = BmiCalculator.calculateBMI(70.0, 1.75);
        assertEquals(22.857, result, 0.01);
    }

    @Test
    public void testOverweight() {
        double result = BmiCalculator.calculateBMI(90.0, 1.80);
        assertEquals(27.778, result, 0.01);
    }

    @Test
    public void testLightWeight() {
        double result = BmiCalculator.calculateBMI(55.0, 1.65);
        assertEquals(20.202, result, 0.01);
    }
}
