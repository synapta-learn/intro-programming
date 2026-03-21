import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StarTriangleTest {

    @Test
    void triangleOfFour() {
        assertEquals("*\n**\n***\n****\n", StarTriangle.starTriangle(4));
    }

    @Test
    void triangleOfOne() {
        assertEquals("*\n", StarTriangle.starTriangle(1));
    }

    @Test
    void triangleOfThree() {
        assertEquals("*\n**\n***\n", StarTriangle.starTriangle(3));
    }

    @Test
    void triangleOfZero() {
        assertEquals("", StarTriangle.starTriangle(0));
    }
}
