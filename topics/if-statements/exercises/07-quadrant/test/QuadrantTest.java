import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadrantTest {

    @Test
    void origin() {
        assertEquals("Origin", Quadrant.quadrant(0, 0));
    }

    @Test
    void xAxis() {
        assertEquals("Axis", Quadrant.quadrant(3, 0));
    }

    @Test
    void yAxis() {
        assertEquals("Axis", Quadrant.quadrant(0, -5));
    }

    @Test
    void quadrantOne() {
        assertEquals("Q1", Quadrant.quadrant(1, 1));
    }

    @Test
    void quadrantTwo() {
        assertEquals("Q2", Quadrant.quadrant(-1, 1));
    }

    @Test
    void quadrantThree() {
        assertEquals("Q3", Quadrant.quadrant(-1, -1));
    }

    @Test
    void quadrantFour() {
        assertEquals("Q4", Quadrant.quadrant(1, -1));
    }
}
