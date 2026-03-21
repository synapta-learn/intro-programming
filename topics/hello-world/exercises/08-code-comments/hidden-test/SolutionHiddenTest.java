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
        assertEquals(3, lines.length,
            "Output should have exactly 3 lines — did you forget to comment out Step 4?");
    }

    @Test
    public void testStep1() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Step 1: Start", lines[0],
            "First line should be 'Step 1: Start' — did you uncomment it?");
    }

    @Test
    public void testStep2() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Step 2: Process", lines[1],
            "Second line should be 'Step 2: Process'");
    }

    @Test
    public void testStep3() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");
        assertEquals("Step 3: Done", lines[2],
            "Third line should be 'Step 3: Done' — did you uncomment it?");
    }

    @Test
    public void testNoStep4() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertFalse(output.contains("Step 4"),
            "Step 4 should remain commented out — it should NOT appear in the output");
    }

    @Test
    public void testCorrectOrder() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        int pos1 = output.indexOf("Step 1");
        int pos2 = output.indexOf("Step 2");
        int pos3 = output.indexOf("Step 3");
        assertTrue(pos1 < pos2 && pos2 < pos3,
            "Steps should appear in order: 1, 2, 3");
    }
}
