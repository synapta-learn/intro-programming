import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeDenominatorNormalized() {
        Solution f = new Solution(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    void addResultSimplified() {
        Solution a = new Solution(1, 4);
        Solution b = new Solution(1, 4);
        Solution sum = a.add(b);
        assertEquals("1/2", sum.toString());
    }

    @Test
    void wholeNumber() {
        Solution f = new Solution(6, 3);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void zeroNumerator() {
        Solution f = new Solution(0, 5);
        assertEquals(0, f.getNumerator());
    }
}
