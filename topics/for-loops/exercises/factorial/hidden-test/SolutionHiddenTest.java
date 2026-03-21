import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void factorialOfTwo() {
        assertEquals(2, Solution.factorial(2));
    }

    @Test
    void factorialOfThree() {
        assertEquals(6, Solution.factorial(3));
    }

    @Test
    void factorialOfSeven() {
        assertEquals(5040, Solution.factorial(7));
    }

    @Test
    void factorialOfTwelve() {
        assertEquals(479001600L, Solution.factorial(12));
    }

    @Test
    void factorialOfTwenty() {
        assertEquals(2432902008176640000L, Solution.factorial(20));
    }

    @Test
    void factorialOfFifteen() {
        assertEquals(1307674368000L, Solution.factorial(15));
    }
}
