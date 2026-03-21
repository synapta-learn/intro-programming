import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sortByAreaOrder() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 5));   // area 50
        shapes.add(new Circle(3));           // area ~28.27
        shapes.add(new Triangle(8, 6));      // area 24
        Solution.sortByArea(shapes);
        assertEquals("Triangle", shapes.get(0).name());
        assertEquals("Circle", shapes.get(1).name());
        assertEquals("Rectangle", shapes.get(2).name());
    }

    @Test
    void totalAreaComputation() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));   // 20
        shapes.add(new Triangle(6, 4));     // 12
        assertEquals(32.0, Solution.totalArea(shapes), 0.01);
    }

    @Test
    void circleAreaCorrect() {
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.area(), 0.001);
    }

    @Test
    void toStringFormat() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals("Rectangle: area=12.00", r.toString());
    }
}
