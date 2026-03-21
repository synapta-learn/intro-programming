import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void palindromeStaysSame() {
        assertEquals("racecar", Solution.reverse("racecar"));
    }

    @Test
    void reverseWithSpaces() {
        assertEquals("dlrow olleh", Solution.reverse("hello world"));
    }

    @Test
    void reverseWithNumbers() {
        assertEquals("321cba", Solution.reverse("abc123"));
    }
}
