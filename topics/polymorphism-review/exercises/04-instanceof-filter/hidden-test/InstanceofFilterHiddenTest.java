import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class InstanceofFilterHiddenTest {

    @Test
    void noCirclesInList() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(1, 2));
        shapes.add(new Triangle(3, 4));
        assertTrue(InstanceofFilter.filterCircles(shapes).isEmpty());
        assertEquals(0.0, InstanceofFilter.totalCircleArea(shapes), 0.001);
        assertNull(InstanceofFilter.largestCircle(shapes));
    }

    @Test
    void emptyList() {
        ArrayList<Shape> empty = new ArrayList<>();
        assertTrue(InstanceofFilter.filterCircles(empty).isEmpty());
        assertNull(InstanceofFilter.largestCircle(empty));
        assertTrue(InstanceofFilter.describeAll(empty).isEmpty());
    }

    @Test
    void singleCircle() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(7));
        Circle c = InstanceofFilter.largestCircle(shapes);
        assertNotNull(c);
        assertEquals(7, c.getRadius(), 0.001);
    }
}
