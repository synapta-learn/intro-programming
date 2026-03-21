import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testZeroIsEven() {
        assertTrue(Solution.isEven(0), "0 is an even number");
    }

    @Test
    public void testZeroIsNotOdd() {
        assertFalse(Solution.isOdd(0), "0 is not an odd number");
    }

    @Test
    public void testOneIsOdd() {
        assertTrue(Solution.isOdd(1));
    }

    @Test
    public void testTwoIsEven() {
        assertTrue(Solution.isEven(2));
    }

    @Test
    public void testNegativeEven() {
        assertTrue(Solution.isEven(-4), "Negative even numbers are still even");
    }

    @Test
    public void testNegativeOdd() {
        assertTrue(Solution.isOdd(-3), "Negative odd numbers are still odd");
    }

    @Test
    public void testLargeEven() {
        assertTrue(Solution.isEven(1000000));
    }

    @Test
    public void testLargeOdd() {
        assertTrue(Solution.isOdd(999999));
    }

    @Test
    public void testIsEvenAndIsOddOpposite() {
        for (int i = -5; i <= 5; i++) {
            assertNotEquals(Solution.isEven(i), Solution.isOdd(i),
                "isEven and isOdd should always return opposite results for " + i);
        }
    }

    @Test
    public void testRemainderZero() {
        assertEquals(0, Solution.remainder(15, 5),
            "15 % 5 should be 0");
    }

    @Test
    public void testRemainderOne() {
        assertEquals(1, Solution.remainder(7, 2),
            "7 % 2 should be 1");
    }

    @Test
    public void testRemainderLargerDivisor() {
        assertEquals(3, Solution.remainder(3, 10),
            "3 % 10 should be 3 (3 is smaller than 10)");
    }

    @Test
    public void testRemainderByOne() {
        assertEquals(0, Solution.remainder(42, 1),
            "Any number % 1 should be 0");
    }

    @Test
    public void testRemainderSameNumbers() {
        assertEquals(0, Solution.remainder(7, 7),
            "7 % 7 should be 0");
    }
}
