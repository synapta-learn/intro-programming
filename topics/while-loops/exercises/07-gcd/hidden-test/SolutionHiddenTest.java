import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void reversedOrder() {
        // gcd(a,b) should equal gcd(b,a)
        assertEquals(Solution.gcd(12, 8), Solution.gcd(8, 12));
    }

    @Test
    void oneAndAnything() {
        assertEquals(1, Solution.gcd(1, 100));
    }

    @Test
    void largeCoprime() {
        assertEquals(1, Solution.gcd(97, 89));
    }

    @Test
    void largeCommonFactor() {
        assertEquals(50, Solution.gcd(150, 100));
    }
}
