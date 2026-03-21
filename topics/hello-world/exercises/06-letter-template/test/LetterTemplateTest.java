import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LetterTemplateTest {
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
    public void testLetterOutput() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String expected =
            "Dear Professor,\n" +
            "\n" +
            "I am writing to confirm my enrollment\n" +
            "in the Introduction to Programming course.\n" +
            "\n" +
            "I look forward to learning Java.\n" +
            "\n" +
            "Sincerely,\n" +
            "Ada Lovelace";
        assertEquals(expected, output);
    }
}
