import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPrimeHiddenTest {

    @Test
    void negativeIsNotPrime() {
        assertFalse(IsPrime.isPrime(-7));
    }

    @Test
    void threeIsPrime() {
        assertTrue(IsPrime.isPrime(3));
    }

    @Test
    void nineIsNotPrime() {
        assertFalse(IsPrime.isPrime(9));
    }

    @Test
    void elevenIsPrime() {
        assertTrue(IsPrime.isPrime(11));
    }

    @Test
    void twentyFiveIsNotPrime() {
        assertFalse(IsPrime.isPrime(25));
    }

    @Test
    void thirtySevenIsPrime() {
        assertTrue(IsPrime.isPrime(37));
    }

    @Test
    void largerPrime() {
        assertTrue(IsPrime.isPrime(97));
    }

    @Test
    void largerNonPrime() {
        assertFalse(IsPrime.isPrime(100));
    }

    @Test
    void twoDigitComposite() {
        assertFalse(IsPrime.isPrime(49));
    }
}
