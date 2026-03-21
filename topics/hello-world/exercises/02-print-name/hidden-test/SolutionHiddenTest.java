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
        assertEquals("My name is Ada Lovelace" + System.lineSeparator(), output,
            "Output must be exactly 'My name is Ada Lovelace' followed by a newline");
    }

    @Test
    public void testSingleLine() {
        Solution.main(new String[]{});
        String output = outContent.toString().trim();
        assertFalse(output.contains("\n"),
            "Output should be a single line");
    }

    @Test
    public void testContainsFullName() {
        Solution.main(new String[]{});
        String output = outContent.toString().trim();
        assertTrue(output.contains("Ada"), "Output must contain the first name 'Ada'");
        assertTrue(output.contains("Lovelace"), "Output must contain the last name 'Lovelace'");
    }

    @Test
    public void testStartsWithMyNameIs() {
        Solution.main(new String[]{});
        String output = outContent.toString().trim();
        assertTrue(output.startsWith("My name is"),
            "Output should start with 'My name is'");
    }
}
