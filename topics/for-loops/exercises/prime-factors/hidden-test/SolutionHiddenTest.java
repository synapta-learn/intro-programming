import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void factorsOfTwo() {
        assertArrayEquals(new int[]{2}, Solution.primeFactors(2));
    }

    @Test
    void factorsOfSixty() {
        assertArrayEquals(new int[]{2, 2, 3, 5}, Solution.primeFactors(60));
    }

    @Test
    void factorsOfPowerOfTwo() {
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, Solution.primeFactors(32));
    }

    @Test
    void factorsOfLargerPrime() {
        assertArrayEquals(new int[]{97}, Solution.primeFactors(97));
    }

    @Test
    void factorsOfEighteen() {
        assertArrayEquals(new int[]{2, 3, 3}, Solution.primeFactors(18));
    }

    @Test
    void factorsAreInAscendingOrder() {
        int[] result = Solution.primeFactors(210); // 2 * 3 * 5 * 7
        assertArrayEquals(new int[]{2, 3, 5, 7}, result);
    }

    @Test
    void factorsOfLargeNumber() {
        // 360 = 2^3 * 3^2 * 5
        assertArrayEquals(new int[]{2, 2, 2, 3, 3, 5}, Solution.primeFactors(360));
    }
}
