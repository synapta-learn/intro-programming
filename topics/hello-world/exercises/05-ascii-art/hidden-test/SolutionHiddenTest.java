import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionHiddenTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testExactlyThreeLines() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals(3, lines.length, "ASCII art box should have exactly 3 lines");
    }

    @Test
    public void testTopBorder() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("+--------+", lines[0], "Top border should be +--------+");
    }

    @Test
    public void testMiddleLine() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("|  JAVA  |", lines[1], "Middle line should be |  JAVA  |");
    }

    @Test
    public void testBottomBorder() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("+--------+", lines[2], "Bottom border should be +--------+");
    }

    @Test
    public void testSymmetry() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals(lines[0], lines[2], "Top and bottom borders should be identical");
    }

    @Test
    public void testLineWidths() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        for (String line : lines) {
            assertEquals(10, line.length(),
                "Each line should be exactly 10 characters wide: '" + line + "'");
        }
    }

    @Test
    public void testJavaIsUppercase() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.contains("JAVA"),
            "JAVA should be in uppercase");
        assertFalse(output.contains("java") || output.contains("Java"),
            "JAVA must be fully uppercase");
    }
}
