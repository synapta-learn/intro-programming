import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiLineTest {
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
    public void testPoemOutput() {
        MultiLine.main(new String[]{});
        String output = outContent.toString().trim();
        String expected = "Roses are red,\nViolets are blue,\nJava is fun,\nAnd so are you.";
        assertEquals(expected, output.replace("\r\n", "\n"));
    }
}
