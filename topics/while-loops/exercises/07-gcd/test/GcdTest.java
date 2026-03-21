import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GcdTest {

    @Test
    void twelveAndEight() {
        assertEquals(4, Gcd.gcd(12, 8));
    }

    @Test
    void fiftyFourAndTwentyFour() {
        assertEquals(6, Gcd.gcd(54, 24));
    }

    @Test
    void coprime() {
        assertEquals(1, Gcd.gcd(7, 3));
    }

    @Test
    void oneIsMultiple() {
        assertEquals(25, Gcd.gcd(100, 25));
    }

    @Test
    void equal() {
        assertEquals(17, Gcd.gcd(17, 17));
    }
}
