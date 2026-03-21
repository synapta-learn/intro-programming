import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class InstanceofFilterTest {

    private ArrayList<Shape> mixedShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Circle(2));
        shapes.add(new Triangle(6, 3));
        return shapes;
    }

    @Test
    void filterCirclesFindsTwo() {
        ArrayList<Circle> circles = InstanceofFilter.filterCircles(mixedShapes());
        assertEquals(2, circles.size());
        assertEquals(5, circles.get(0).getRadius(), 0.001);
        assertEquals(2, circles.get(1).getRadius(), 0.001);
    }

    @Test
    void totalCircleArea() {
        double total = InstanceofFilter.totalCircleArea(mixedShapes());
        double expected = Math.PI * 25 + Math.PI * 4;
        assertEquals(expected, total, 0.01);
    }

    @Test
    void largestCircleFound() {
        Circle largest = InstanceofFilter.largestCircle(mixedShapes());
        assertNotNull(largest);
        assertEquals(5, largest.getRadius(), 0.001);
    }

    @Test
    void describeAllFormats() {
        ArrayList<String> desc = InstanceofFilter.describeAll(mixedShapes());
        assertEquals("Circle with radius 5.0", desc.get(0));
        assertEquals("Rectangle 3.0x4.0", desc.get(1));
        assertEquals("Circle with radius 2.0", desc.get(2));
        assertEquals("Triangle with base 6.0 and height 3.0", desc.get(3));
    }
}
