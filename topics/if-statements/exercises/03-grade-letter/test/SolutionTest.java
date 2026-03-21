import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void gradeA() {
        assertEquals("A", Solution.gradeLetter(95));
    }

    @Test
    void gradeB() {
        assertEquals("B", Solution.gradeLetter(85));
    }

    @Test
    void gradeC() {
        assertEquals("C", Solution.gradeLetter(72));
    }

    @Test
    void gradeD() {
        assertEquals("D", Solution.gradeLetter(65));
    }

    @Test
    void gradeF() {
        assertEquals("F", Solution.gradeLetter(50));
    }
}
