import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void undergradGPA() {
        Undergrad u = new Undergrad("Alice");
        u.addGrade(100);
        u.addGrade(75);
        // avg = 87.5, GPA = 87.5/25 = 3.50
        assertEquals(3.50, u.calculateGPA(), 0.01);
    }

    @Test
    void graduateGPA() {
        Graduate g = new Graduate("Bob");
        g.addGrade(95);
        g.addGrade(90);
        // avg = 92.5, GPA = (92.5-10)/22.5 = 3.667
        assertEquals(3.667, g.calculateGPA(), 0.01);
    }

    @Test
    void honorRoll() {
        ArrayList<Student> roster = new ArrayList<>();
        Undergrad u1 = new Undergrad("Alice");
        u1.addGrade(100); u1.addGrade(100); // GPA 4.0
        Undergrad u2 = new Undergrad("Bob");
        u2.addGrade(50); u2.addGrade(50);   // GPA 2.0
        Solution.addStudent(roster, u1);
        Solution.addStudent(roster, u2);
        ArrayList<Student> honor = Solution.getHonorRoll(roster);
        assertEquals(1, honor.size());
        assertEquals("Alice", honor.get(0).getName());
    }

    @Test
    void topStudentFound() {
        ArrayList<Student> roster = new ArrayList<>();
        Undergrad u = new Undergrad("Alice");
        u.addGrade(90);
        Graduate g = new Graduate("Bob");
        g.addGrade(90);
        Solution.addStudent(roster, u);
        Solution.addStudent(roster, g);
        // Alice GPA = 90/25 = 3.6, Bob GPA = (90-10)/22.5 = 3.56
        Student top = Solution.topStudent(roster);
        assertEquals("Alice", top.getName());
    }

    @Test
    void toStringFormat() {
        Undergrad u = new Undergrad("Carol");
        u.addGrade(75);
        assertEquals("Carol (GPA: 3.00)", u.toString());
    }
}
