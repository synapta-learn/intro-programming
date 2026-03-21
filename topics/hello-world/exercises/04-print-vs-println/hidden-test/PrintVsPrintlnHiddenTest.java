import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintVsPrintlnHiddenTest {
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
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals(3, lines.length,
            "Output should have exactly 3 lines");
    }

    @Test
    public void testNameLine() {
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Name: Ada Lovelace", lines[0]);
    }

    @Test
    public void testAgeLine() {
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Age: 36", lines[1]);
    }

    @Test
    public void testCityLine() {
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("City: London", lines[2]);
    }

    @Test
    public void testColonSpacing() {
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        for (String line : lines) {
            assertTrue(line.contains(": "),
                "Each line should have a colon followed by a space: '" + line + "'");
        }
    }

    @Test
    public void testNoExtraSpaces() {
        PrintVsPrintln.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        for (String line : lines) {
            assertEquals(line.trim(), line,
                "Lines should not have leading or trailing spaces");
            assertFalse(line.contains("  "),
                "Lines should not have double spaces: '" + line + "'");
        }
    }
}
