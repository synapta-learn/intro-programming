import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {

    @Test
    void one() {
        assertEquals(1, PowerOfTwo.powerOfTwo(1));
    }

    @Test
    void two() {
        assertEquals(2, PowerOfTwo.powerOfTwo(2));
    }

    @Test
    void three() {
        assertEquals(4, PowerOfTwo.powerOfTwo(3));
    }

    @Test
    void exactPower() {
        assertEquals(8, PowerOfTwo.powerOfTwo(8));
    }

    @Test
    void hundred() {
        assertEquals(128, PowerOfTwo.powerOfTwo(100));
    }
}
