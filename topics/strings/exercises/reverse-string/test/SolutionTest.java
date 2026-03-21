import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void reverseHello() {
        assertEquals("olleh", Solution.reverse("hello"));
    }

    @Test
    void reverseJava() {
        assertEquals("avaJ", Solution.reverse("Java"));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("a", Solution.reverse("a"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", Solution.reverse(""));
    }
}
