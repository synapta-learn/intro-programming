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
    public void testExactOutput() {
        Solution.main(new String[]{});
        String output = outContent.toString();
        assertEquals("Hello, World!" + System.lineSeparator(), output,
            "Output must be exactly 'Hello, World!' followed by a newline");
    }

    @Test
    public void testNoExtraLines() {
        Solution.main(new String[]{});
        String output = outContent.toString();
        String[] lines = output.split("\\r?\\n", -1);
        // Should be exactly one line of text plus a trailing empty string from the final newline
        assertEquals(2, lines.length,
            "There should be exactly one line of output");
        assertEquals("Hello, World!", lines[0]);
        assertEquals("", lines[1]);
    }

    @Test
    public void testNoCaseMistakes() {
        Solution.main(new String[]{});
        String output = outContent.toString().trim();
        assertNotEquals("hello, world!", output,
            "Check your capitalization — 'Hello' starts with a capital H");
        assertNotEquals("Hello, world!", output,
            "Check your capitalization — 'World' starts with a capital W");
    }

    @Test
    public void testPunctuationPresent() {
        Solution.main(new String[]{});
        String output = outContent.toString().trim();
        assertTrue(output.contains(","), "Don't forget the comma after 'Hello'");
        assertTrue(output.endsWith("!"), "Don't forget the exclamation mark at the end");
    }
}
