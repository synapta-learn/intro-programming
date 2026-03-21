import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void twoIsPrime() {
        assertTrue(Solution.isPrime(2));
    }

    @Test
    void sevenIsPrime() {
        assertTrue(Solution.isPrime(7));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(Solution.isPrime(4));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(Solution.isPrime(1));
    }

    @Test
    void zeroIsNotPrime() {
        assertFalse(Solution.isPrime(0));
    }
}
