import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sumEvenUpToTen() {
        assertEquals(30, Solution.sumEven(10));
    }

    @Test
    void sumEvenUpToSeven() {
        assertEquals(12, Solution.sumEven(7));
    }

    @Test
    void sumEvenUpToOne() {
        assertEquals(0, Solution.sumEven(1));
    }

    @Test
    void sumEvenUpToTwo() {
        assertEquals(2, Solution.sumEven(2));
    }
}
