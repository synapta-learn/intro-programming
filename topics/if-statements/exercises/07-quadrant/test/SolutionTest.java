import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void origin() {
        assertEquals("Origin", Solution.quadrant(0, 0));
    }

    @Test
    void xAxis() {
        assertEquals("Axis", Solution.quadrant(3, 0));
    }

    @Test
    void yAxis() {
        assertEquals("Axis", Solution.quadrant(0, -5));
    }

    @Test
    void quadrantOne() {
        assertEquals("Q1", Solution.quadrant(1, 1));
    }

    @Test
    void quadrantTwo() {
        assertEquals("Q2", Solution.quadrant(-1, 1));
    }

    @Test
    void quadrantThree() {
        assertEquals("Q3", Solution.quadrant(-1, -1));
    }

    @Test
    void quadrantFour() {
        assertEquals("Q4", Solution.quadrant(1, -1));
    }
}
