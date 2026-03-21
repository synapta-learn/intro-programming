import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuloEvenOddTest {

    @Test
    public void testIsEvenTrue() {
        assertTrue(ModuloEvenOdd.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(ModuloEvenOdd.isEven(7));
    }

    @Test
    public void testIsOddTrue() {
        assertTrue(ModuloEvenOdd.isOdd(7));
    }

    @Test
    public void testIsOddFalse() {
        assertFalse(ModuloEvenOdd.isOdd(4));
    }

    @Test
    public void testRemainder() {
        assertEquals(1, ModuloEvenOdd.remainder(10, 3));
    }
}
