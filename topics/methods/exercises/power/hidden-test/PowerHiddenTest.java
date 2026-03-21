import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerHiddenTest {

    @Test
    void oneToAnyPower() {
        assertEquals(1, Power.power(1, 100));
    }

    @Test
    void twoToTwenty() {
        assertEquals(1048576L, Power.power(2, 20));
    }

    @Test
    void tenToThree() {
        assertEquals(1000, Power.power(10, 3));
    }

    @Test
    void zeroToZero() {
        // By convention, 0^0 = 1
        assertEquals(1, Power.power(0, 0));
    }

    @Test
    void negativeBase() {
        assertEquals(-8, Power.power(-2, 3));
    }

    @Test
    void negativeBaseEvenExponent() {
        assertEquals(16, Power.power(-2, 4));
    }

    @Test
    void largeResult() {
        assertEquals(10000000000L, Power.power(10, 10));
    }
}
