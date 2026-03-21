import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionTest {
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
    public void testReceiptOutput() {
        Solution.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String expected =
            "==============================\n" +
            "        JAVA MART\n" +
            "==============================\n" +
            "Coffee          x2      $5.98\n" +
            "Sandwich        x1      $4.50\n" +
            "Cookie          x3      $2.97\n" +
            "------------------------------\n" +
            "TOTAL                  $13.45\n" +
            "==============================";
        assertEquals(expected, output);
    }
}
