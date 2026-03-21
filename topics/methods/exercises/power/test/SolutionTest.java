import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void twoToTheTen() {
        assertEquals(1024, Solution.power(2, 10));
    }

    @Test
    void threeToTheFour() {
        assertEquals(81, Solution.power(3, 4));
    }

    @Test
    void anythingToZero() {
        assertEquals(1, Solution.power(5, 0));
    }

    @Test
    void anythingToOne() {
        assertEquals(7, Solution.power(7, 1));
    }

    @Test
    void zeroToPositive() {
        assertEquals(0, Solution.power(0, 5));
    }
}
