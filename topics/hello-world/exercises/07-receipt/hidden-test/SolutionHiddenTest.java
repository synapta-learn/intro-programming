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
    public void testLineCount() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals(9, lines.length, "Receipt should have exactly 9 lines");
    }

    @Test
    public void testHeaderBorder() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("==============================", lines[0],
            "First line should be 30 '=' characters");
    }

    @Test
    public void testStoreName() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertTrue(lines[1].contains("JAVA MART"),
            "Second line should contain 'JAVA MART'");
    }

    @Test
    public void testContainsTotalAmount() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.contains("$13.45"), "Receipt should contain total of $13.45");
    }

    @Test
    public void testDividerLine() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.contains("------------------------------"),
            "Receipt should contain a divider of 30 '-' characters");
    }

    @Test
    public void testFooterBorder() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("==============================", lines[8],
            "Last line should be 30 '=' characters");
    }

    @Test
    public void testAllItemsPresent() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.contains("Coffee"), "Receipt should contain 'Coffee'");
        assertTrue(output.contains("Sandwich"), "Receipt should contain 'Sandwich'");
        assertTrue(output.contains("Cookie"), "Receipt should contain 'Cookie'");
    }

    @Test
    public void testAllPricesPresent() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.contains("$5.98"), "Receipt should contain '$5.98'");
        assertTrue(output.contains("$4.50"), "Receipt should contain '$4.50'");
        assertTrue(output.contains("$2.97"), "Receipt should contain '$2.97'");
    }

    @Test
    public void testNoTabs() {
        Solution.main(new String[]{});
        String output = outContent.toString();
        assertFalse(output.contains("\t"),
            "Use spaces for alignment, not tabs");
    }
}
