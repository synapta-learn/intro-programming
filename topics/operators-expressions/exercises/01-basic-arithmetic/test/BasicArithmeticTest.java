import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicArithmeticTest {

    @Test
    public void testAdd() {
        assertEquals(13, BasicArithmetic.add(10, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(7, BasicArithmetic.subtract(10, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(30, BasicArithmetic.multiply(10, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(3, BasicArithmetic.divide(10, 3));
    }
}
