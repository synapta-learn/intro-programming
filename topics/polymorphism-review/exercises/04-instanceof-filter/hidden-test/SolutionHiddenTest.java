import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void noCirclesInList() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(1, 2));
        shapes.add(new Triangle(3, 4));
        assertTrue(Solution.filterCircles(shapes).isEmpty());
        assertEquals(0.0, Solution.totalCircleArea(shapes), 0.001);
        assertNull(Solution.largestCircle(shapes));
    }

    @Test
    void emptyList() {
        ArrayList<Shape> empty = new ArrayList<>();
        assertTrue(Solution.filterCircles(empty).isEmpty());
        assertNull(Solution.largestCircle(empty));
        assertTrue(Solution.describeAll(empty).isEmpty());
    }

    @Test
    void singleCircle() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(7));
        Circle c = Solution.largestCircle(shapes);
        assertNotNull(c);
        assertEquals(7, c.getRadius(), 0.001);
    }
}
