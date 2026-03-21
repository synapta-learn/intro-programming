import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void divisibleByBoth() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void divisibleByThreeOnly() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void divisibleByFiveOnly() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void notDivisibleByEither() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void one() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
}
