import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void mixedNumbers() {
        assertEquals(listOf(4, 8, 12), Solution.filterAndDouble(listOf(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void allEven() {
        assertEquals(listOf(4, 8, 12), Solution.filterAndDouble(listOf(2, 4, 6)));
    }

    @Test
    void allOdd() {
        assertTrue(Solution.filterAndDouble(listOf(1, 3, 5)).isEmpty());
    }

    @Test
    void emptyList() {
        assertTrue(Solution.filterAndDouble(new ArrayList<>()).isEmpty());
    }

    @Test
    void zeroAndNegatives() {
        assertEquals(listOf(0, -4), Solution.filterAndDouble(listOf(0, 1, -2, 3)));
    }
}
