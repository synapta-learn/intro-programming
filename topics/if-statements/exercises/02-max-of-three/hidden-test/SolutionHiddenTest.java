import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void twoEqual() {
        assertEquals(5, Solution.maxOfThree(5, 5, 3));
    }

    @Test
    void zeroAndNegatives() {
        assertEquals(0, Solution.maxOfThree(0, -1, -2));
    }

    @Test
    void largeNumbers() {
        assertEquals(1000000, Solution.maxOfThree(1000000, 999999, 999998));
    }
}
