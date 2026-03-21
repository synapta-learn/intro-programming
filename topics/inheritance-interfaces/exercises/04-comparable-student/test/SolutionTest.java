import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void higherGpaComesFirst() {
        Student high = new Student("Alice", 3.8);
        Student low = new Student("Bob", 3.5);
        assertTrue(high.compareTo(low) < 0);
    }

    @Test
    void sameGpaSortsByName() {
        Student alice = new Student("Alice", 3.8);
        Student carol = new Student("Carol", 3.8);
        assertTrue(alice.compareTo(carol) < 0);
    }

    @Test
    void sortingOrder() {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Bob", 3.5),
            new Student("Carol", 3.8),
            new Student("Alice", 3.8)
        ));
        Collections.sort(students);
        assertEquals("Alice", students.get(0).getName());
        assertEquals("Carol", students.get(1).getName());
        assertEquals("Bob", students.get(2).getName());
    }

    @Test
    void toStringFormat() {
        Student s = new Student("Alice", 3.8);
        assertEquals("Alice (3.8)", s.toString());
    }
}
