import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiamondPatternTest {

    @Test
    void diamondOfThree() {
        String expected = "  *\n ***\n*****\n ***\n  *\n";
        assertEquals(expected, DiamondPattern.diamond(3));
    }

    @Test
    void diamondOfOne() {
        assertEquals("*\n", DiamondPattern.diamond(1));
    }

    @Test
    void diamondOfFour() {
        String expected = "   *\n  ***\n *****\n*******\n *****\n  ***\n   *\n";
        assertEquals(expected, DiamondPattern.diamond(4));
    }

    @Test
    void diamondOfZero() {
        assertEquals("", DiamondPattern.diamond(0));
    }
}
