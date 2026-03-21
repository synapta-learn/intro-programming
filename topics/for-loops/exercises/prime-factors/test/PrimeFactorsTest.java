import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

    @Test
    void factorsOfTwelve() {
        assertArrayEquals(new int[]{2, 2, 3}, PrimeFactors.primeFactors(12));
    }

    @Test
    void factorsOfSeven() {
        assertArrayEquals(new int[]{7}, PrimeFactors.primeFactors(7));
    }

    @Test
    void factorsOfHundred() {
        assertArrayEquals(new int[]{2, 2, 5, 5}, PrimeFactors.primeFactors(100));
    }

    @Test
    void factorsOfOne() {
        assertArrayEquals(new int[]{}, PrimeFactors.primeFactors(1));
    }
}
