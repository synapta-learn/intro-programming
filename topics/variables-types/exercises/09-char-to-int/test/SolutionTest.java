import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testCharToAsciiA() {
        assertEquals(65, Solution.charToAscii('A'));
    }

    @Test
    public void testCharToAsciiLowerA() {
        assertEquals(97, Solution.charToAscii('a'));
    }

    @Test
    public void testAsciiToChar65() {
        assertEquals('A', Solution.asciiToChar(65));
    }

    @Test
    public void testShiftCharByOne() {
        assertEquals('B', Solution.shiftChar('A', 1));
    }

    @Test
    public void testShiftCharBy25() {
        assertEquals('Z', Solution.shiftChar('A', 25));
    }
}
