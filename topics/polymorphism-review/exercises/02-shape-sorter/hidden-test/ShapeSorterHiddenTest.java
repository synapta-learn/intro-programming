import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeSorterHiddenTest {

    @Test
    void emptyList() {
        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeSorter.sortByArea(shapes);
        assertEquals(0.0, ShapeSorter.totalArea(shapes), 0.001);
    }

    @Test
    void singleShape() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        ShapeSorter.sortByArea(shapes);
        assertEquals("Circle", shapes.get(0).name());
        assertEquals(Math.PI * 25, ShapeSorter.totalArea(shapes), 0.01);
    }

    @Test
    void triangleArea() {
        Triangle t = new Triangle(10, 4);
        assertEquals(20.0, t.area(), 0.001);
        assertEquals("Triangle", t.name());
    }

    @Test
    void compareToWorks() {
        Shape small = new Rectangle(1, 1);   // area 1
        Shape big = new Circle(10);           // area ~314
        assertTrue(small.compareTo(big) < 0);
        assertTrue(big.compareTo(small) > 0);
    }
}
