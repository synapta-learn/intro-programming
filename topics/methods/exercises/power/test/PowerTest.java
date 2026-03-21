import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerTest {

    @Test
    void twoToTheTen() {
        assertEquals(1024, Power.power(2, 10));
    }

    @Test
    void threeToTheFour() {
        assertEquals(81, Power.power(3, 4));
    }

    @Test
    void anythingToZero() {
        assertEquals(1, Power.power(5, 0));
    }

    @Test
    void anythingToOne() {
        assertEquals(7, Power.power(7, 1));
    }

    @Test
    void zeroToPositive() {
        assertEquals(0, Power.power(0, 5));
    }
}
