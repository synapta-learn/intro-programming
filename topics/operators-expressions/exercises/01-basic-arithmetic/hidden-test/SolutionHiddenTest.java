import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testAddZero() {
        assertEquals(5, Solution.add(5, 0));
        assertEquals(5, Solution.add(0, 5));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, Solution.add(2, -3));
    }

    @Test
    public void testAddBothNegative() {
        assertEquals(-8, Solution.add(-3, -5));
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-5, Solution.subtract(3, 8));
    }

    @Test
    public void testSubtractSame() {
        assertEquals(0, Solution.subtract(7, 7));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, Solution.multiply(42, 0));
    }

    @Test
    public void testMultiplyByOne() {
        assertEquals(42, Solution.multiply(42, 1));
    }

    @Test
    public void testMultiplyNegatives() {
        assertEquals(15, Solution.multiply(-3, -5));
    }

    @Test
    public void testMultiplyMixedSigns() {
        assertEquals(-12, Solution.multiply(3, -4));
    }

    @Test
    public void testDivideExact() {
        assertEquals(5, Solution.divide(15, 3));
    }

    @Test
    public void testDivideWithRemainder() {
        assertEquals(2, Solution.divide(7, 3),
            "7 / 3 should be 2 (integer division truncates)");
    }

    @Test
    public void testDivideSmallByLarge() {
        assertEquals(0, Solution.divide(3, 10),
            "3 / 10 should be 0 (integer division truncates)");
    }

    @Test
    public void testDivideSameNumber() {
        assertEquals(1, Solution.divide(7, 7));
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-3, Solution.divide(-9, 3));
    }

    @Test
    public void testAddLargeNumbers() {
        assertEquals(2000000, Solution.add(1000000, 1000000));
    }
}
