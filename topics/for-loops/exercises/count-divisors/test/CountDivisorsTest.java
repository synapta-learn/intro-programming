import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountDivisorsTest {

    @Test
    void divisorsOfTwelve() {
        assertEquals(6, CountDivisors.countDivisors(12));
    }

    @Test
    void divisorsOfSeven() {
        assertEquals(2, CountDivisors.countDivisors(7));
    }

    @Test
    void divisorsOfOne() {
        assertEquals(1, CountDivisors.countDivisors(1));
    }

    @Test
    void divisorsOfSixteen() {
        assertEquals(5, CountDivisors.countDivisors(16));
    }
}
