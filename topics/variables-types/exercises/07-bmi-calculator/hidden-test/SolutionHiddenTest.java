import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testBMIFormula() {
        double weight = 80.0;
        double height = 1.80;
        double expected = weight / (height * height);
        assertEquals(expected, Solution.calculateBMI(weight, height), 0.0001);
    }

    @Test
    public void testVeryTallPerson() {
        double result = Solution.calculateBMI(85.0, 2.00);
        assertEquals(85.0 / 4.0, result, 0.0001);
    }

    @Test
    public void testShortPerson() {
        double result = Solution.calculateBMI(50.0, 1.50);
        double expected = 50.0 / (1.50 * 1.50);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testHeavyPerson() {
        double result = Solution.calculateBMI(120.0, 1.70);
        double expected = 120.0 / (1.70 * 1.70);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testResultIsPositive() {
        double result = Solution.calculateBMI(70.0, 1.75);
        assertTrue(result > 0, "BMI should be positive");
    }

    @Test
    public void testOneKgOneMeter() {
        double result = Solution.calculateBMI(1.0, 1.0);
        assertEquals(1.0, result, 0.0001,
            "1 kg at 1 meter should give BMI of 1.0");
    }

    @Test
    public void testDividingByHeightSquared() {
        // If they divide by height instead of height*height, this will fail
        double result = Solution.calculateBMI(100.0, 2.0);
        assertEquals(25.0, result, 0.0001,
            "100 / (2*2) = 25.0 — make sure you square the height");
    }
}
