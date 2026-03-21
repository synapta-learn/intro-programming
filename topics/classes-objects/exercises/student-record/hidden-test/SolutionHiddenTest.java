import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void emptyGradesAverage() {
        Solution student = new Solution();
        student.grades = new int[]{};
        assertEquals(0.0, student.averageGrade(), 0.001);
    }

    @Test
    void emptyGradesHighest() {
        Solution student = new Solution();
        student.grades = new int[]{};
        assertEquals(0, student.highestGrade());
    }

    @Test
    void emptyGradesCount() {
        Solution student = new Solution();
        student.grades = new int[]{};
        assertEquals(0, student.gradeCount());
    }

    @Test
    void allSameGrades() {
        Solution student = new Solution();
        student.grades = new int[]{80, 80, 80};
        assertEquals(80.0, student.averageGrade(), 0.001);
        assertEquals(80, student.highestGrade());
    }
}
