import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharToIntTest {

    @Test
    public void testCharToAsciiA() {
        assertEquals(65, CharToInt.charToAscii('A'));
    }

    @Test
    public void testCharToAsciiLowerA() {
        assertEquals(97, CharToInt.charToAscii('a'));
    }

    @Test
    public void testAsciiToChar65() {
        assertEquals('A', CharToInt.asciiToChar(65));
    }

    @Test
    public void testShiftCharByOne() {
        assertEquals('B', CharToInt.shiftChar('A', 1));
    }

    @Test
    public void testShiftCharBy25() {
        assertEquals('Z', CharToInt.shiftChar('A', 25));
    }
}
