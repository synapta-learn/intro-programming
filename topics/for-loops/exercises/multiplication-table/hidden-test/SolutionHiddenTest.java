import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void tableOfZero() {
        String expected = "0 x 1 = 0\n0 x 2 = 0\n0 x 3 = 0\n0 x 4 = 0\n" +
                "0 x 5 = 0\n0 x 6 = 0\n0 x 7 = 0\n0 x 8 = 0\n" +
                "0 x 9 = 0\n0 x 10 = 0\n";
        assertEquals(expected, Solution.multiplicationTable(0));
    }

    @Test
    void tableOfNegative() {
        String result = Solution.multiplicationTable(-2);
        assertTrue(result.contains("-2 x 1 = -2"));
        assertTrue(result.contains("-2 x 10 = -20"));
    }

    @Test
    void tableOfTwelve() {
        String result = Solution.multiplicationTable(12);
        assertTrue(result.contains("12 x 12 = 144"));
        assertTrue(result.startsWith("12 x 1 = 12\n"));
    }

    @Test
    void endsWithNewline() {
        String result = Solution.multiplicationTable(4);
        assertTrue(result.endsWith("\n"));
    }

    @Test
    void correctFormat() {
        String result = Solution.multiplicationTable(9);
        assertTrue(result.contains("9 x 5 = 45"));
        assertTrue(result.contains("9 x 9 = 81"));
    }
}
