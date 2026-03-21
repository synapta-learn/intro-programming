import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiamondPatternHiddenTest {

    @Test
    void diamondNegative() {
        assertEquals("", DiamondPattern.diamond(-2));
    }

    @Test
    void diamondOfTwo() {
        String expected = " *\n***\n *\n";
        assertEquals(expected, DiamondPattern.diamond(2));
    }

    @Test
    void diamondOfFive() {
        String result = DiamondPattern.diamond(5);
        String[] lines = result.split("\n");
        // 5 rows top half + 4 rows bottom half = 9 total
        assertEquals(9, lines.length);
    }

    @Test
    void middleRowIsWidest() {
        String result = DiamondPattern.diamond(4);
        String[] lines = result.split("\n");
        // Middle row (index 3) should have 7 stars, no spaces
        assertEquals("*******", lines[3]);
    }

    @Test
    void symmetry() {
        String result = DiamondPattern.diamond(5);
        String[] lines = result.split("\n");
        // First line should equal last line
        assertEquals(lines[0], lines[lines.length - 1]);
        // Second line should equal second-to-last
        assertEquals(lines[1], lines[lines.length - 2]);
    }

    @Test
    void totalRowCount() {
        String result = DiamondPattern.diamond(6);
        String[] lines = result.split("\n");
        assertEquals(11, lines.length); // 2*6 - 1
    }
}
