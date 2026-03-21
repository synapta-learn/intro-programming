import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiLineHiddenTest {
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
    public void testExactlyFourLines() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals(4, lines.length,
            "Output should have exactly 4 lines");
    }

    @Test
    public void testFirstLine() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Roses are red,", lines[0],
            "First line must be 'Roses are red,'");
    }

    @Test
    public void testSecondLine() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Violets are blue,", lines[1],
            "Second line must be 'Violets are blue,'");
    }

    @Test
    public void testThirdLine() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Java is fun,", lines[2],
            "Third line must be 'Java is fun,'");
    }

    @Test
    public void testFourthLine() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("And so are you.", lines[3],
            "Fourth line must be 'And so are you.'");
    }

    @Test
    public void testNoLeadingSpaces() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        for (String line : lines) {
            assertEquals(line.trim(), line,
                "Lines should not have leading or trailing spaces: '" + line + "'");
        }
    }
}
