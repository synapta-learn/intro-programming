import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryConversionTest {

    @Test
    void zero() {
        assertEquals("0", BinaryConversion.toBinary(0));
    }

    @Test
    void one() {
        assertEquals("1", BinaryConversion.toBinary(1));
    }

    @Test
    void two() {
        assertEquals("10", BinaryConversion.toBinary(2));
    }

    @Test
    void five() {
        assertEquals("101", BinaryConversion.toBinary(5));
    }

    @Test
    void ten() {
        assertEquals("1010", BinaryConversion.toBinary(10));
    }
}
