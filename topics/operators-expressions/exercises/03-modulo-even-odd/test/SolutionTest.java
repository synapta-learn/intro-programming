import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testIsEvenTrue() {
        assertTrue(Solution.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(Solution.isEven(7));
    }

    @Test
    public void testIsOddTrue() {
        assertTrue(Solution.isOdd(7));
    }

    @Test
    public void testIsOddFalse() {
        assertFalse(Solution.isOdd(4));
    }

    @Test
    public void testRemainder() {
        assertEquals(1, Solution.remainder(10, 3));
    }
}
