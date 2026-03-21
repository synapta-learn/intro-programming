import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void equalStudentsCompareToZero() {
        Student s1 = new Student("Alice", 4.0);
        Student s2 = new Student("Alice", 4.0);
        assertEquals(0, s1.compareTo(s2));
    }

    @Test
    void lowerGpaComesLast() {
        Student low = new Student("Zoe", 2.0);
        Student high = new Student("Adam", 4.0);
        assertTrue(low.compareTo(high) > 0);
    }

    @Test
    void toStringWithWholeNumber() {
        Student s = new Student("Bob", 4.0);
        assertEquals("Bob (4.0)", s.toString());
    }
}
