import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sumToFive() {
        assertEquals(15, Solution.sumToN(5));
    }

    @Test
    void sumToOne() {
        assertEquals(1, Solution.sumToN(1));
    }

    @Test
    void sumToTen() {
        assertEquals(55, Solution.sumToN(10));
    }

    @Test
    void sumToZero() {
        assertEquals(0, Solution.sumToN(0));
    }
}
