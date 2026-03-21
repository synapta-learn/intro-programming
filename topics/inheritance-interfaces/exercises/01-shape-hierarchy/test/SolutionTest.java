import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void circleArea() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.area(), 0.001);
    }

    @Test
    void circlePerimeter() {
        Circle c = new Circle(5);
        assertEquals(2 * Math.PI * 5, c.perimeter(), 0.001);
    }

    @Test
    void rectangleArea() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(12.0, r.area(), 0.001);
    }

    @Test
    void rectanglePerimeter() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(14.0, r.perimeter(), 0.001);
    }

    @Test
    void shapeReference() {
        Shape s = new Circle(1);
        assertEquals(Math.PI, s.area(), 0.001);
    }
}
