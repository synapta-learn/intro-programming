import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionHiddenTest {

    @Test
    void negativeDenominatorNormalized() {
        Fraction f = new Fraction(3, -4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    void addResultSimplified() {
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 4);
        Fraction sum = a.add(b);
        assertEquals("1/2", sum.toString());
    }

    @Test
    void wholeNumber() {
        Fraction f = new Fraction(6, 3);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void zeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals(0, f.getNumerator());
    }
}
