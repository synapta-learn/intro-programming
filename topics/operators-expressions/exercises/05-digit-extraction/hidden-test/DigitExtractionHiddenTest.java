import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitExtractionHiddenTest {

    @Test
    public void testAllSameDigits() {
        assertEquals(5, DigitExtraction.onesDigit(555));
        assertEquals(5, DigitExtraction.tensDigit(555));
        assertEquals(5, DigitExtraction.hundredsDigit(555));
    }

    @Test
    public void testSequentialDigits() {
        assertEquals(3, DigitExtraction.onesDigit(123));
        assertEquals(2, DigitExtraction.tensDigit(123));
        assertEquals(1, DigitExtraction.hundredsDigit(123));
    }

    @Test
    public void testReversedDigits() {
        assertEquals(1, DigitExtraction.onesDigit(321));
        assertEquals(2, DigitExtraction.tensDigit(321));
        assertEquals(3, DigitExtraction.hundredsDigit(321));
    }

    @Test
    public void testMinimumThreeDigit() {
        assertEquals(0, DigitExtraction.onesDigit(100));
        assertEquals(0, DigitExtraction.tensDigit(100));
        assertEquals(1, DigitExtraction.hundredsDigit(100));
    }

    @Test
    public void testMaximumThreeDigit() {
        assertEquals(9, DigitExtraction.onesDigit(999));
        assertEquals(9, DigitExtraction.tensDigit(999));
        assertEquals(9, DigitExtraction.hundredsDigit(999));
    }

    @Test
    public void testZerosInMiddle() {
        assertEquals(2, DigitExtraction.onesDigit(402));
        assertEquals(0, DigitExtraction.tensDigit(402));
        assertEquals(4, DigitExtraction.hundredsDigit(402));
    }

    @Test
    public void testZerosAtEnd() {
        assertEquals(0, DigitExtraction.onesDigit(350));
        assertEquals(5, DigitExtraction.tensDigit(350));
        assertEquals(3, DigitExtraction.hundredsDigit(350));
    }

    @Test
    public void testDigitRange() {
        // Each digit should be 0-9
        for (int n = 100; n <= 999; n += 137) {
            int ones = DigitExtraction.onesDigit(n);
            int tens = DigitExtraction.tensDigit(n);
            int hundreds = DigitExtraction.hundredsDigit(n);
            assertTrue(ones >= 0 && ones <= 9, "Ones digit should be 0-9 for " + n);
            assertTrue(tens >= 0 && tens <= 9, "Tens digit should be 0-9 for " + n);
            assertTrue(hundreds >= 1 && hundreds <= 9, "Hundreds digit should be 1-9 for " + n);
        }
    }

    @Test
    public void testDigitsReconstructNumber() {
        int number = 582;
        int reconstructed = DigitExtraction.hundredsDigit(number) * 100
            + DigitExtraction.tensDigit(number) * 10
            + DigitExtraction.onesDigit(number);
        assertEquals(number, reconstructed,
            "Reconstructing from digits should give the original number");
    }
}
