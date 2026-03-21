import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {

    @Test
    void firstBracketOnly() {
        assertEquals(500.0, TaxCalculator.calculateTax(5000), 0.01);
    }

    @Test
    void exactlyFirstBracket() {
        assertEquals(1000.0, TaxCalculator.calculateTax(10000), 0.01);
    }

    @Test
    void twoBrackets() {
        // 1000 + (15000 * 0.20) = 1000 + 3000 = 4000
        assertEquals(4000.0, TaxCalculator.calculateTax(25000), 0.01);
    }

    @Test
    void allThreeBrackets() {
        // 1000 + 6000 + (10000 * 0.30) = 10000
        assertEquals(10000.0, TaxCalculator.calculateTax(50000), 0.01);
    }

    @Test
    void zeroIncome() {
        assertEquals(0.0, TaxCalculator.calculateTax(0), 0.01);
    }
}
