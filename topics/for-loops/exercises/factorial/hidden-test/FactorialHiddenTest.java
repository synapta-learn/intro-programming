import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialHiddenTest {

    @Test
    void factorialOfTwo() {
        assertEquals(2, Factorial.factorial(2));
    }

    @Test
    void factorialOfThree() {
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    void factorialOfSeven() {
        assertEquals(5040, Factorial.factorial(7));
    }

    @Test
    void factorialOfTwelve() {
        assertEquals(479001600L, Factorial.factorial(12));
    }

    @Test
    void factorialOfTwenty() {
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }

    @Test
    void factorialOfFifteen() {
        assertEquals(1307674368000L, Factorial.factorial(15));
    }
}
