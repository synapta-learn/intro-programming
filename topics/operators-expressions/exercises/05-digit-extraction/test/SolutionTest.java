import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testOnesDigit() {
        assertEquals(5, Solution.onesDigit(735));
    }

    @Test
    public void testTensDigit() {
        assertEquals(3, Solution.tensDigit(735));
    }

    @Test
    public void testHundredsDigit() {
        assertEquals(7, Solution.hundredsDigit(735));
    }

    @Test
    public void testOnesDigitWithZero() {
        assertEquals(0, Solution.onesDigit(100));
    }

    @Test
    public void testTensDigitWithZero() {
        assertEquals(0, Solution.tensDigit(402));
    }
}
