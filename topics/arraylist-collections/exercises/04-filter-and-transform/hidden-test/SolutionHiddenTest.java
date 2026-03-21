import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void doesNotModifyOriginal() {
        ArrayList<Integer> original = listOf(1, 2, 3, 4);
        Solution.filterAndDouble(original);
        assertEquals(listOf(1, 2, 3, 4), original);
    }

    @Test
    void singleEvenElement() {
        assertEquals(listOf(20), Solution.filterAndDouble(listOf(10)));
    }

    @Test
    void singleOddElement() {
        assertTrue(Solution.filterAndDouble(listOf(7)).isEmpty());
    }

    @Test
    void largeNegativeEvens() {
        assertEquals(listOf(-200, -400), Solution.filterAndDouble(listOf(-100, -99, -200)));
    }
}
