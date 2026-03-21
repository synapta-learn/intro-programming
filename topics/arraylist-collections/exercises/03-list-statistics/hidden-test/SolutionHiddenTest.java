import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void allNegativeNumbers() {
        double[] result = Solution.statistics(listOf(-10, -20, -5));
        assertEquals(-20.0, result[0]);
        assertEquals(-5.0, result[1]);
        assertEquals(-35.0, result[2]);
        assertEquals(-35.0 / 3, result[3], 0.001);
    }

    @Test
    void allSameValues() {
        double[] result = Solution.statistics(listOf(7, 7, 7, 7));
        assertEquals(7.0, result[0]);
        assertEquals(7.0, result[1]);
        assertEquals(28.0, result[2]);
        assertEquals(7.0, result[3]);
    }

    @Test
    void largerList() {
        double[] result = Solution.statistics(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(1.0, result[0]);
        assertEquals(10.0, result[1]);
        assertEquals(55.0, result[2]);
        assertEquals(5.5, result[3], 0.001);
    }
}
