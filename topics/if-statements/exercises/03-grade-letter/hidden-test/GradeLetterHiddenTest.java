import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeLetterHiddenTest {

    @Test
    void boundaryA() {
        assertEquals("A", GradeLetter.gradeLetter(90));
    }

    @Test
    void boundaryB() {
        assertEquals("B", GradeLetter.gradeLetter(80));
    }

    @Test
    void boundaryC() {
        assertEquals("C", GradeLetter.gradeLetter(70));
    }

    @Test
    void boundaryD() {
        assertEquals("D", GradeLetter.gradeLetter(60));
    }

    @Test
    void perfectScore() {
        assertEquals("A", GradeLetter.gradeLetter(100));
    }

    @Test
    void zeroScore() {
        assertEquals("F", GradeLetter.gradeLetter(0));
    }

    @Test
    void justBelowA() {
        assertEquals("B", GradeLetter.gradeLetter(89));
    }
}
