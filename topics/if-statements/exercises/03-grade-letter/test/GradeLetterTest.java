import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeLetterTest {

    @Test
    void gradeA() {
        assertEquals("A", GradeLetter.gradeLetter(95));
    }

    @Test
    void gradeB() {
        assertEquals("B", GradeLetter.gradeLetter(85));
    }

    @Test
    void gradeC() {
        assertEquals("C", GradeLetter.gradeLetter(72));
    }

    @Test
    void gradeD() {
        assertEquals("D", GradeLetter.gradeLetter(65));
    }

    @Test
    void gradeF() {
        assertEquals("F", GradeLetter.gradeLetter(50));
    }
}
