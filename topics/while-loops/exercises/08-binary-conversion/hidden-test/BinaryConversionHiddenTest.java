import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryConversionHiddenTest {

    @Test
    void powerOfTwo() {
        assertEquals("10000", BinaryConversion.toBinary(16));
    }

    @Test
    void allOnes() {
        assertEquals("11111111", BinaryConversion.toBinary(255));
    }

    @Test
    void seven() {
        assertEquals("111", BinaryConversion.toBinary(7));
    }

    @Test
    void thirtyTwo() {
        assertEquals("100000", BinaryConversion.toBinary(32));
    }
}
