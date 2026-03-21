import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    @Test
    void reverseHello() {
        assertEquals("olleh", ReverseString.reverse("hello"));
    }

    @Test
    void reverseJava() {
        assertEquals("avaJ", ReverseString.reverse("Java"));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("a", ReverseString.reverse("a"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", ReverseString.reverse(""));
    }
}
