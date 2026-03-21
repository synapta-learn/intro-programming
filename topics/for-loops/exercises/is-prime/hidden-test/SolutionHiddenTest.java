import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeIsNotPrime() {
        assertFalse(Solution.isPrime(-7));
    }

    @Test
    void threeIsPrime() {
        assertTrue(Solution.isPrime(3));
    }

    @Test
    void nineIsNotPrime() {
        assertFalse(Solution.isPrime(9));
    }

    @Test
    void elevenIsPrime() {
        assertTrue(Solution.isPrime(11));
    }

    @Test
    void twentyFiveIsNotPrime() {
        assertFalse(Solution.isPrime(25));
    }

    @Test
    void thirtySevenIsPrime() {
        assertTrue(Solution.isPrime(37));
    }

    @Test
    void largerPrime() {
        assertTrue(Solution.isPrime(97));
    }

    @Test
    void largerNonPrime() {
        assertFalse(Solution.isPrime(100));
    }

    @Test
    void twoDigitComposite() {
        assertFalse(Solution.isPrime(49));
    }
}
