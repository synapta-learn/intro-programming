import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void factorialOfZero() {
        assertEquals(1, Solution.factorial(0));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1, Solution.factorial(1));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120, Solution.factorial(5));
    }

    @Test
    void factorialOfTen() {
        assertEquals(3628800, Solution.factorial(10));
    }
}
