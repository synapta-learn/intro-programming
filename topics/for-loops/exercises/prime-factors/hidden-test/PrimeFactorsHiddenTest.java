import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsHiddenTest {

    @Test
    void factorsOfTwo() {
        assertArrayEquals(new int[]{2}, PrimeFactors.primeFactors(2));
    }

    @Test
    void factorsOfSixty() {
        assertArrayEquals(new int[]{2, 2, 3, 5}, PrimeFactors.primeFactors(60));
    }

    @Test
    void factorsOfPowerOfTwo() {
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, PrimeFactors.primeFactors(32));
    }

    @Test
    void factorsOfLargerPrime() {
        assertArrayEquals(new int[]{97}, PrimeFactors.primeFactors(97));
    }

    @Test
    void factorsOfEighteen() {
        assertArrayEquals(new int[]{2, 3, 3}, PrimeFactors.primeFactors(18));
    }

    @Test
    void factorsAreInAscendingOrder() {
        int[] result = PrimeFactors.primeFactors(210); // 2 * 3 * 5 * 7
        assertArrayEquals(new int[]{2, 3, 5, 7}, result);
    }

    @Test
    void factorsOfLargeNumber() {
        // 360 = 2^3 * 3^2 * 5
        assertArrayEquals(new int[]{2, 2, 2, 3, 3, 5}, PrimeFactors.primeFactors(360));
    }
}
