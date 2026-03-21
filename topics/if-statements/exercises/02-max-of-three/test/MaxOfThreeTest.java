import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxOfThreeTest {

    @Test
    void thirdIsLargest() {
        assertEquals(3, MaxOfThree.maxOfThree(1, 2, 3));
    }

    @Test
    void firstIsLargest() {
        assertEquals(3, MaxOfThree.maxOfThree(3, 2, 1));
    }

    @Test
    void allEqual() {
        assertEquals(5, MaxOfThree.maxOfThree(5, 5, 5));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-1, MaxOfThree.maxOfThree(-1, -2, -3));
    }

    @Test
    void middleIsLargest() {
        assertEquals(10, MaxOfThree.maxOfThree(3, 10, 7));
    }
}
