import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testAllSameDigits() {
        assertEquals(5, Solution.onesDigit(555));
        assertEquals(5, Solution.tensDigit(555));
        assertEquals(5, Solution.hundredsDigit(555));
    }

    @Test
    public void testSequentialDigits() {
        assertEquals(3, Solution.onesDigit(123));
        assertEquals(2, Solution.tensDigit(123));
        assertEquals(1, Solution.hundredsDigit(123));
    }

    @Test
    public void testReversedDigits() {
        assertEquals(1, Solution.onesDigit(321));
        assertEquals(2, Solution.tensDigit(321));
        assertEquals(3, Solution.hundredsDigit(321));
    }

    @Test
    public void testMinimumThreeDigit() {
        assertEquals(0, Solution.onesDigit(100));
        assertEquals(0, Solution.tensDigit(100));
        assertEquals(1, Solution.hundredsDigit(100));
    }

    @Test
    public void testMaximumThreeDigit() {
        assertEquals(9, Solution.onesDigit(999));
        assertEquals(9, Solution.tensDigit(999));
        assertEquals(9, Solution.hundredsDigit(999));
    }

    @Test
    public void testZerosInMiddle() {
        assertEquals(2, Solution.onesDigit(402));
        assertEquals(0, Solution.tensDigit(402));
        assertEquals(4, Solution.hundredsDigit(402));
    }

    @Test
    public void testZerosAtEnd() {
        assertEquals(0, Solution.onesDigit(350));
        assertEquals(5, Solution.tensDigit(350));
        assertEquals(3, Solution.hundredsDigit(350));
    }

    @Test
    public void testDigitRange() {
        // Each digit should be 0-9
        for (int n = 100; n <= 999; n += 137) {
            int ones = Solution.onesDigit(n);
            int tens = Solution.tensDigit(n);
            int hundreds = Solution.hundredsDigit(n);
            assertTrue(ones >= 0 && ones <= 9, "Ones digit should be 0-9 for " + n);
            assertTrue(tens >= 0 && tens <= 9, "Tens digit should be 0-9 for " + n);
            assertTrue(hundreds >= 1 && hundreds <= 9, "Hundreds digit should be 1-9 for " + n);
        }
    }

    @Test
    public void testDigitsReconstructNumber() {
        int number = 582;
        int reconstructed = Solution.hundredsDigit(number) * 100
            + Solution.tensDigit(number) * 10
            + Solution.onesDigit(number);
        assertEquals(number, reconstructed,
            "Reconstructing from digits should give the original number");
    }
}
