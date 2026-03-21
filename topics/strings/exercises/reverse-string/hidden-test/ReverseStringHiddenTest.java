import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringHiddenTest {

    @Test
    void palindromeStaysSame() {
        assertEquals("racecar", ReverseString.reverse("racecar"));
    }

    @Test
    void reverseWithSpaces() {
        assertEquals("dlrow olleh", ReverseString.reverse("hello world"));
    }

    @Test
    void reverseWithNumbers() {
        assertEquals("321cba", ReverseString.reverse("abc123"));
    }
}
