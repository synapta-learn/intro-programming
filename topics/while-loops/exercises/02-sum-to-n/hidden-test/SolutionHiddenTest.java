import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeInput() {
        assertEquals(0, Solution.sumToN(-5));
    }

    @Test
    void sumToHundred() {
        assertEquals(5050, Solution.sumToN(100));
    }

    @Test
    void sumToTwo() {
        assertEquals(3, Solution.sumToN(2));
    }
}
