import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxOfThreeHiddenTest {

    @Test
    void twoEqual() {
        assertEquals(5, MaxOfThree.maxOfThree(5, 5, 3));
    }

    @Test
    void zeroAndNegatives() {
        assertEquals(0, MaxOfThree.maxOfThree(0, -1, -2));
    }

    @Test
    void largeNumbers() {
        assertEquals(1000000, MaxOfThree.maxOfThree(1000000, 999999, 999998));
    }
}
