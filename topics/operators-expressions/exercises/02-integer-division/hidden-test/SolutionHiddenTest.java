import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testIntDivideExact() {
        assertEquals(5, Solution.intDivide(10, 2));
    }

    @Test
    public void testIntDivideWithRemainder() {
        assertEquals(3, Solution.intDivide(10, 3),
            "10 / 3 as int should be 3");
    }

    @Test
    public void testDoubleDivideExact() {
        assertEquals(5.0, Solution.doubleDivide(10, 2), 0.0001);
    }

    @Test
    public void testDoubleDivideNotTruncated() {
        double result = Solution.doubleDivide(10, 3);
        assertTrue(result > 3.3 && result < 3.4,
            "10.0 / 3 should be approximately 3.333..., got " + result);
    }

    @Test
    public void testDoubleDivideOneByTwo() {
        assertEquals(0.5, Solution.doubleDivide(1, 2), 0.0001,
            "1 / 2 as double should be 0.5, not 0");
    }

    @Test
    public void testIntDivideOneByTwo() {
        assertEquals(0, Solution.intDivide(1, 2),
            "1 / 2 as int should be 0");
    }

    @Test
    public void testDoubleDividePreservesDecimals() {
        double result = Solution.doubleDivide(1, 4);
        assertEquals(0.25, result, 0.0001,
            "1 / 4 as double should be 0.25");
    }

    @Test
    public void testIntDivideNegative() {
        assertEquals(-3, Solution.intDivide(-7, 2));
    }

    @Test
    public void testDoubleDivideNegative() {
        assertEquals(-3.5, Solution.doubleDivide(-7, 2), 0.0001);
    }

    @Test
    public void testDoubleDivideLargeNumbers() {
        double result = Solution.doubleDivide(1000000, 3);
        assertEquals(333333.3333, result, 0.01);
    }

    @Test
    public void testDoubleDivideNotCastingAfter() {
        // This test checks that the student is casting BEFORE division, not after
        // If they do (double)(a / b), they get 3.0 instead of 3.5
        double result = Solution.doubleDivide(7, 2);
        assertNotEquals(3.0, result,
            "Make sure you cast to double BEFORE dividing, not after");
        assertEquals(3.5, result, 0.0001);
    }
}
