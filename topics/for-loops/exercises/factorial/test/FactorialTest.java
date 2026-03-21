import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void factorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void factorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void factorialOfFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void factorialOfTen() {
        assertEquals(3628800, Factorial.factorial(10));
    }
}
