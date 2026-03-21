import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testAdd() {
        assertEquals(13, Solution.add(10, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(7, Solution.subtract(10, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(30, Solution.multiply(10, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(3, Solution.divide(10, 3));
    }
}
