import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    public void testCharToAsciiZero() {
        assertEquals(48, Solution.charToAscii('0'),
            "'0' should have ASCII value 48");
    }

    @Test
    public void testCharToAsciiSpace() {
        assertEquals(32, Solution.charToAscii(' '),
            "Space should have ASCII value 32");
    }

    @Test
    public void testCharToAsciiZ() {
        assertEquals(90, Solution.charToAscii('Z'),
            "'Z' should have ASCII value 90");
    }

    @Test
    public void testAsciiToChar97() {
        assertEquals('a', Solution.asciiToChar(97),
            "ASCII 97 should be 'a'");
    }

    @Test
    public void testAsciiToChar48() {
        assertEquals('0', Solution.asciiToChar(48),
            "ASCII 48 should be '0'");
    }

    @Test
    public void testAsciiToChar90() {
        assertEquals('Z', Solution.asciiToChar(90),
            "ASCII 90 should be 'Z'");
    }

    @Test
    public void testShiftCharLowercase() {
        assertEquals('d', Solution.shiftChar('a', 3),
            "'a' + 3 should be 'd'");
    }

    @Test
    public void testShiftCharByZero() {
        assertEquals('A', Solution.shiftChar('A', 0),
            "Shifting by 0 should return the same character");
    }

    @Test
    public void testShiftDigitChar() {
        assertEquals('5', Solution.shiftChar('0', 5),
            "'0' + 5 should be '5'");
    }

    @Test
    public void testRoundTrip() {
        char original = 'M';
        int ascii = Solution.charToAscii(original);
        char result = Solution.asciiToChar(ascii);
        assertEquals(original, result,
            "Converting char to ASCII and back should give the original char");
    }

    @Test
    public void testDifferenceBetweenUpperAndLower() {
        int upperA = Solution.charToAscii('A');
        int lowerA = Solution.charToAscii('a');
        assertEquals(32, lowerA - upperA,
            "The difference between 'a' and 'A' should be 32");
    }
}
