import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPrimeTest {

    @Test
    void twoIsPrime() {
        assertTrue(IsPrime.isPrime(2));
    }

    @Test
    void sevenIsPrime() {
        assertTrue(IsPrime.isPrime(7));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(IsPrime.isPrime(4));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(IsPrime.isPrime(1));
    }

    @Test
    void zeroIsNotPrime() {
        assertFalse(IsPrime.isPrime(0));
    }
}
