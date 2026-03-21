import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void factorsOfTwelve() {
        assertArrayEquals(new int[]{2, 2, 3}, Solution.primeFactors(12));
    }

    @Test
    void factorsOfSeven() {
        assertArrayEquals(new int[]{7}, Solution.primeFactors(7));
    }

    @Test
    void factorsOfHundred() {
        assertArrayEquals(new int[]{2, 2, 5, 5}, Solution.primeFactors(100));
    }

    @Test
    void factorsOfOne() {
        assertArrayEquals(new int[]{}, Solution.primeFactors(1));
    }
}
