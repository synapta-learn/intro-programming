import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void nine() {
        assertEquals(1, Solution.digitCount(9));
    }

    @Test
    void ten() {
        assertEquals(2, Solution.digitCount(10));
    }

    @Test
    void ninetyNine() {
        assertEquals(2, Solution.digitCount(99));
    }

    @Test
    void oneHundred() {
        assertEquals(3, Solution.digitCount(100));
    }

    @Test
    void largeNumber() {
        assertEquals(7, Solution.digitCount(1000000));
    }
}
