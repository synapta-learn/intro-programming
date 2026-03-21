import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LetterTemplateHiddenTest {
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
    public void testStartsWithDear() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.startsWith("Dear Professor,"),
            "Letter should start with 'Dear Professor,'");
    }

    @Test
    public void testEndsWithName() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        assertTrue(output.endsWith("Ada Lovelace"),
            "Letter should end with the name 'Ada Lovelace'");
    }

    @Test
    public void testBlankLineAfterGreeting() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n");
        assertTrue(output.contains("Dear Professor,\n\n"),
            "There should be a blank line after the greeting");
    }

    @Test
    public void testBlankLineAfterFirstParagraph() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n");
        assertTrue(output.contains("course.\n\n"),
            "There should be a blank line after 'course.'");
    }

    @Test
    public void testBlankLineAfterSecondParagraph() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n");
        assertTrue(output.contains("Java.\n\n"),
            "There should be a blank line after 'Java.'");
    }

    @Test
    public void testNoBlankLineBetweenClosingAndName() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n");
        assertTrue(output.contains("Sincerely,\nAda Lovelace"),
            "There should be NO blank line between 'Sincerely,' and 'Ada Lovelace'");
    }

    @Test
    public void testTotalLineCount() {
        LetterTemplate.main(new String[]{});
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n", -1);
        assertEquals(9, lines.length,
            "The letter should have exactly 9 lines (including blank lines)");
    }
}
