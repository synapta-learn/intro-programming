import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRecordHiddenTest {

    @Test
    void emptyGradesAverage() {
        StudentRecord student = new StudentRecord();
        student.grades = new int[]{};
        assertEquals(0.0, student.averageGrade(), 0.001);
    }

    @Test
    void emptyGradesHighest() {
        StudentRecord student = new StudentRecord();
        student.grades = new int[]{};
        assertEquals(0, student.highestGrade());
    }

    @Test
    void emptyGradesCount() {
        StudentRecord student = new StudentRecord();
        student.grades = new int[]{};
        assertEquals(0, student.gradeCount());
    }

    @Test
    void allSameGrades() {
        StudentRecord student = new StudentRecord();
        student.grades = new int[]{80, 80, 80};
        assertEquals(80.0, student.averageGrade(), 0.001);
        assertEquals(80, student.highestGrade());
    }
}
