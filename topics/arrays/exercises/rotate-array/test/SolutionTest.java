import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void rotateByTwo() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, Solution.rotate(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    void rotateByOne() {
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, Solution.rotate(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void rotateByLength() {
        assertArrayEquals(new int[]{1, 2, 3}, Solution.rotate(new int[]{1, 2, 3}, 3));
    }

    @Test
    void rotateByZero() {
        assertArrayEquals(new int[]{1, 2, 3}, Solution.rotate(new int[]{1, 2, 3}, 0));
    }
}
