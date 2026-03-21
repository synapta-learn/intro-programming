import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitExtractionTest {

    @Test
    public void testOnesDigit() {
        assertEquals(5, DigitExtraction.onesDigit(735));
    }

    @Test
    public void testTensDigit() {
        assertEquals(3, DigitExtraction.tensDigit(735));
    }

    @Test
    public void testHundredsDigit() {
        assertEquals(7, DigitExtraction.hundredsDigit(735));
    }

    @Test
    public void testOnesDigitWithZero() {
        assertEquals(0, DigitExtraction.onesDigit(100));
    }

    @Test
    public void testTensDigitWithZero() {
        assertEquals(0, DigitExtraction.tensDigit(402));
    }
}
