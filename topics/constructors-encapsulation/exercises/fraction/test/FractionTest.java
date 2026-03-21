import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    void simplifiesFraction() {
        Fraction f = new Fraction(4, 8);
        assertEquals("1/2", f.toString());
    }

    @Test
    void addFractions() {
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        Fraction sum = half.add(third);
        assertEquals("5/6", sum.toString());
    }

    @Test
    void multiplyFractions() {
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        Fraction product = half.multiply(third);
        assertEquals("1/6", product.toString());
    }

    @Test
    void zeroDenominatorThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Fraction(1, 0);
        });
    }

    @Test
    void negativeFraction() {
        Fraction f = new Fraction(-3, 4);
        assertEquals(-3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
}
