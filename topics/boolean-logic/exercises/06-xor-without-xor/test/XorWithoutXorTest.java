import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XorWithoutXorTest {

    @Test
    void bothTrue() {
        assertFalse(XorWithoutXor.xor(true, true));
    }

    @Test
    void firstTrueSecondFalse() {
        assertTrue(XorWithoutXor.xor(true, false));
    }

    @Test
    void firstFalseSecondTrue() {
        assertTrue(XorWithoutXor.xor(false, true));
    }

    @Test
    void bothFalse() {
        assertFalse(XorWithoutXor.xor(false, false));
    }
}
