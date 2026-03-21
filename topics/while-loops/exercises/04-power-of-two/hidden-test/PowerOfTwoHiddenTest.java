import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoHiddenTest {

    @Test
    void five() {
        assertEquals(8, PowerOfTwo.powerOfTwo(5));
    }

    @Test
    void nine() {
        assertEquals(16, PowerOfTwo.powerOfTwo(9));
    }

    @Test
    void sixteenExact() {
        assertEquals(16, PowerOfTwo.powerOfTwo(16));
    }

    @Test
    void seventeen() {
        assertEquals(32, PowerOfTwo.powerOfTwo(17));
    }

    @Test
    void largeValue() {
        assertEquals(1024, PowerOfTwo.powerOfTwo(1000));
    }
}
