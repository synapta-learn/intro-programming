import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void verticalDistance() {
        assertEquals(5.0, Solution.distance(0, 0, 0, 5), 0.001);
    }

    @Test
    void diagonalDistance() {
        assertEquals(Math.sqrt(2), Solution.distance(0, 0, 1, 1), 0.001);
    }

    @Test
    void symmetricDistance() {
        double d1 = Solution.distance(1, 2, 4, 6);
        double d2 = Solution.distance(4, 6, 1, 2);
        assertEquals(d1, d2, 0.001);
    }

    @Test
    void largerDistance() {
        assertEquals(13.0, Solution.distance(0, 0, 5, 12), 0.001);
    }

    @Test
    void decimalCoordinates() {
        assertEquals(1.0, Solution.distance(0.5, 0.5, 1.5, 0.5), 0.001);
    }

    @Test
    void bothNegative() {
        assertEquals(5.0, Solution.distance(-3, -4, 0, 0), 0.001);
    }

    @Test
    void originToOrigin() {
        assertEquals(0.0, Solution.distance(0, 0, 0, 0), 0.001);
    }
}
