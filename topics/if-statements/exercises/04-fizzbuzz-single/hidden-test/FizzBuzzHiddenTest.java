import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzHiddenTest {

    @Test
    void thirty() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void three() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void five() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void two() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    void fortyFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }
}
