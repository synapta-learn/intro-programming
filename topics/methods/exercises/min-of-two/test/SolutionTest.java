import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void minIntFirstSmaller() {
        assertEquals(3, Solution.min(3, 7));
    }

    @Test
    void minIntSecondSmaller() {
        assertEquals(2, Solution.min(10, 2));
    }

    @Test
    void minIntEqual() {
        assertEquals(5, Solution.min(5, 5));
    }

    @Test
    void minDoubleSecondSmaller() {
        assertEquals(2.71, Solution.min(3.14, 2.71), 0.001);
    }

    @Test
    void minStringShorter() {
        assertEquals("hi", Solution.min("hi", "hello"));
    }

    @Test
    void minStringSameLength() {
        assertEquals("cat", Solution.min("cat", "dog"));
    }
}
