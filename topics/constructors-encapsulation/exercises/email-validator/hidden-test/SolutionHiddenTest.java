import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void multipleAtSignsThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("a@b@c");
        });
    }

    @Test
    void singleCharUserAndDomain() {
        Solution email = new Solution("a@b");
        assertEquals("a", email.getUsername());
        assertEquals("b", email.getDomain());
    }

    @Test
    void emptyStringThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("");
        });
    }
}
