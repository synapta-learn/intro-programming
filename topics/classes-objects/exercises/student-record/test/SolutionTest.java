import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void averageOfFiveGrades() {
        Solution student = new Solution();
        student.grades = new int[]{85, 92, 78, 95, 88};
        assertEquals(87.6, student.averageGrade(), 0.001);
    }

    @Test
    void highestGrade() {
        Solution student = new Solution();
        student.grades = new int[]{85, 92, 78, 95, 88};
        assertEquals(95, student.highestGrade());
    }

    @Test
    void gradeCount() {
        Solution student = new Solution();
        student.grades = new int[]{85, 92, 78, 95, 88};
        assertEquals(5, student.gradeCount());
    }

    @Test
    void singleGrade() {
        Solution student = new Solution();
        student.grades = new int[]{100};
        assertEquals(100.0, student.averageGrade(), 0.001);
        assertEquals(100, student.highestGrade());
    }
}
