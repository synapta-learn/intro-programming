import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void divisorsOfTwelve() {
        assertEquals(6, Solution.countDivisors(12));
    }

    @Test
    void divisorsOfSeven() {
        assertEquals(2, Solution.countDivisors(7));
    }

    @Test
    void divisorsOfOne() {
        assertEquals(1, Solution.countDivisors(1));
    }

    @Test
    void divisorsOfSixteen() {
        assertEquals(5, Solution.countDivisors(16));
    }
}
