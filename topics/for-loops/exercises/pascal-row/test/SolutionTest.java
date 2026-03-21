import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void rowZero() {
        assertArrayEquals(new int[]{1}, Solution.pascalRow(0));
    }

    @Test
    void rowOne() {
        assertArrayEquals(new int[]{1, 1}, Solution.pascalRow(1));
    }

    @Test
    void rowFour() {
        assertArrayEquals(new int[]{1, 4, 6, 4, 1}, Solution.pascalRow(4));
    }

    @Test
    void rowHasCorrectLength() {
        assertEquals(6, Solution.pascalRow(5).length);
    }
}
