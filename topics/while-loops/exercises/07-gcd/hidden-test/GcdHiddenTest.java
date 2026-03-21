import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GcdHiddenTest {

    @Test
    void reversedOrder() {
        // gcd(a,b) should equal gcd(b,a)
        assertEquals(Gcd.gcd(12, 8), Gcd.gcd(8, 12));
    }

    @Test
    void oneAndAnything() {
        assertEquals(1, Gcd.gcd(1, 100));
    }

    @Test
    void largeCoprime() {
        assertEquals(1, Gcd.gcd(97, 89));
    }

    @Test
    void largeCommonFactor() {
        assertEquals(50, Gcd.gcd(150, 100));
    }
}
