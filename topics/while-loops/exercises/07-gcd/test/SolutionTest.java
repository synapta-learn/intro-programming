import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void twelveAndEight() {
        assertEquals(4, Solution.gcd(12, 8));
    }

    @Test
    void fiftyFourAndTwentyFour() {
        assertEquals(6, Solution.gcd(54, 24));
    }

    @Test
    void coprime() {
        assertEquals(1, Solution.gcd(7, 3));
    }

    @Test
    void oneIsMultiple() {
        assertEquals(25, Solution.gcd(100, 25));
    }

    @Test
    void equal() {
        assertEquals(17, Solution.gcd(17, 17));
    }
}
