import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void diamondOfThree() {
        String expected = "  *\n ***\n*****\n ***\n  *\n";
        assertEquals(expected, Solution.diamond(3));
    }

    @Test
    void diamondOfOne() {
        assertEquals("*\n", Solution.diamond(1));
    }

    @Test
    void diamondOfFour() {
        String expected = "   *\n  ***\n *****\n*******\n *****\n  ***\n   *\n";
        assertEquals(expected, Solution.diamond(4));
    }

    @Test
    void diamondOfZero() {
        assertEquals("", Solution.diamond(0));
    }
}
