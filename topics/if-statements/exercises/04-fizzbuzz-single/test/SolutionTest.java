import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void divisibleByBoth() {
        assertEquals("FizzBuzz", Solution.fizzBuzz(15));
    }

    @Test
    void divisibleByThreeOnly() {
        assertEquals("Fizz", Solution.fizzBuzz(9));
    }

    @Test
    void divisibleByFiveOnly() {
        assertEquals("Buzz", Solution.fizzBuzz(10));
    }

    @Test
    void notDivisibleByEither() {
        assertEquals("7", Solution.fizzBuzz(7));
    }

    @Test
    void one() {
        assertEquals("1", Solution.fizzBuzz(1));
    }
}
