import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void thirty() {
        assertEquals("FizzBuzz", Solution.fizzBuzz(30));
    }

    @Test
    void three() {
        assertEquals("Fizz", Solution.fizzBuzz(3));
    }

    @Test
    void five() {
        assertEquals("Buzz", Solution.fizzBuzz(5));
    }

    @Test
    void two() {
        assertEquals("2", Solution.fizzBuzz(2));
    }

    @Test
    void fortyFive() {
        assertEquals("FizzBuzz", Solution.fizzBuzz(45));
    }
}
