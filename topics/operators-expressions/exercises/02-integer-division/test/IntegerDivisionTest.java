import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerDivisionTest {

    @Test
    public void testIntDivide() {
        assertEquals(3, IntegerDivision.intDivide(7, 2));
    }

    @Test
    public void testDoubleDivide() {
        assertEquals(3.5, IntegerDivision.doubleDivide(7, 2), 0.0001);
    }

    @Test
    public void testIntDivideSmallByLarge() {
        assertEquals(0, IntegerDivision.intDivide(1, 3));
    }

    @Test
    public void testDoubleDivideSmallByLarge() {
        assertEquals(0.3333, IntegerDivision.doubleDivide(1, 3), 0.001);
    }
}
