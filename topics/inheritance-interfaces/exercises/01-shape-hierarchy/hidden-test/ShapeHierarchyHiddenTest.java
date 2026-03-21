import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeHierarchyHiddenTest {

    @Test
    void circleWithRadiusOne() {
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.area(), 0.001);
        assertEquals(2 * Math.PI, c.perimeter(), 0.001);
    }

    @Test
    void squareIsRectangle() {
        Rectangle r = new Rectangle(5, 5);
        assertEquals(25.0, r.area(), 0.001);
        assertEquals(20.0, r.perimeter(), 0.001);
    }

    @Test
    void gettersWork() {
        Circle c = new Circle(7);
        assertEquals(7, c.getRadius(), 0.001);

        Rectangle r = new Rectangle(3, 8);
        assertEquals(3, r.getWidth(), 0.001);
        assertEquals(8, r.getHeight(), 0.001);
    }
}
