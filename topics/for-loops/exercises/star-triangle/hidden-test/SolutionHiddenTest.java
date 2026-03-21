import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void triangleNegative() {
        assertEquals("", Solution.starTriangle(-3));
    }

    @Test
    void triangleOfTwo() {
        assertEquals("*\n**\n", Solution.starTriangle(2));
    }

    @Test
    void triangleOfSix() {
        String expected = "*\n**\n***\n****\n*****\n******\n";
        assertEquals(expected, Solution.starTriangle(6));
    }

    @Test
    void lastRowHasNStars() {
        String result = Solution.starTriangle(5);
        String[] lines = result.split("\n");
        assertEquals(5, lines.length);
        assertEquals("*****", lines[4]);
    }

    @Test
    void firstRowHasOneStar() {
        String result = Solution.starTriangle(10);
        String[] lines = result.split("\n");
        assertEquals("*", lines[0]);
    }

    @Test
    void endsWithNewline() {
        assertTrue(Solution.starTriangle(3).endsWith("\n"));
    }
}
