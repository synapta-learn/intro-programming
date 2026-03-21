import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void simplifiesFraction() {
        Solution f = new Solution(4, 8);
        assertEquals("1/2", f.toString());
    }

    @Test
    void addFractions() {
        Solution half = new Solution(1, 2);
        Solution third = new Solution(1, 3);
        Solution sum = half.add(third);
        assertEquals("5/6", sum.toString());
    }

    @Test
    void multiplyFractions() {
        Solution half = new Solution(1, 2);
        Solution third = new Solution(1, 3);
        Solution product = half.multiply(third);
        assertEquals("1/6", product.toString());
    }

    @Test
    void zeroDenominatorThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution(1, 0);
        });
    }

    @Test
    void negativeFraction() {
        Solution f = new Solution(-3, 4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
}
