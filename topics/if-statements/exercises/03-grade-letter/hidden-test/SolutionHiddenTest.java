import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void boundaryA() {
        assertEquals("A", Solution.gradeLetter(90));
    }

    @Test
    void boundaryB() {
        assertEquals("B", Solution.gradeLetter(80));
    }

    @Test
    void boundaryC() {
        assertEquals("C", Solution.gradeLetter(70));
    }

    @Test
    void boundaryD() {
        assertEquals("D", Solution.gradeLetter(60));
    }

    @Test
    void perfectScore() {
        assertEquals("A", Solution.gradeLetter(100));
    }

    @Test
    void zeroScore() {
        assertEquals("F", Solution.gradeLetter(0));
    }

    @Test
    void justBelowA() {
        assertEquals("B", Solution.gradeLetter(89));
    }
}
