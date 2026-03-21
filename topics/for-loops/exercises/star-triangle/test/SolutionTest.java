import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void triangleOfFour() {
        assertEquals("*\n**\n***\n****\n", Solution.starTriangle(4));
    }

    @Test
    void triangleOfOne() {
        assertEquals("*\n", Solution.starTriangle(1));
    }

    @Test
    void triangleOfThree() {
        assertEquals("*\n**\n***\n", Solution.starTriangle(3));
    }

    @Test
    void triangleOfZero() {
        assertEquals("", Solution.starTriangle(0));
    }
}
