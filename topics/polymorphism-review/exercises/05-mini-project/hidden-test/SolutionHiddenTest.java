import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void noGradesReturnsZero() {
        Undergrad u = new Undergrad("Empty");
        assertEquals(0.0, u.calculateGPA(), 0.001);
        Graduate g = new Graduate("Empty");
        assertEquals(0.0, g.calculateGPA(), 0.001);
    }

    @Test
    void gpaCappedAtFour() {
        Undergrad u = new Undergrad("Perfect");
        u.addGrade(100);
        u.addGrade(100);
        u.addGrade(100);
        // 100/25 = 4.0, exactly at cap
        assertEquals(4.0, u.calculateGPA(), 0.001);
    }

    @Test
    void graduateGPAFlooredAtZero() {
        Graduate g = new Graduate("Low");
        g.addGrade(5);
        // (5 - 10) / 22.5 = -0.222, should be floored to 0
        assertEquals(0.0, g.calculateGPA(), 0.001);
    }

    @Test
    void emptyRoster() {
        ArrayList<Student> roster = new ArrayList<>();
        assertNull(Solution.topStudent(roster));
        assertEquals(0.0, Solution.classAverage(roster), 0.001);
        assertTrue(Solution.getHonorRoll(roster).isEmpty());
    }

    @Test
    void classAverageComputation() {
        ArrayList<Student> roster = new ArrayList<>();
        Undergrad u1 = new Undergrad("A");
        u1.addGrade(100); // GPA 4.0
        Undergrad u2 = new Undergrad("B");
        u2.addGrade(50);  // GPA 2.0
        Solution.addStudent(roster, u1);
        Solution.addStudent(roster, u2);
        assertEquals(3.0, Solution.classAverage(roster), 0.01);
    }
}
