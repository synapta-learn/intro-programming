import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ForLoopSumTest {

    @Test
    void sumOfFive() {
        assertEquals(15, ForLoopSum.sum(5));
    }

    @Test
    void sumOfOne() {
        assertEquals(1, ForLoopSum.sum(1));
    }

    @Test
    void sumOfZero() {
        assertEquals(0, ForLoopSum.sum(0));
    }

    @Test
    void sumOfTen() {
        assertEquals(55, ForLoopSum.sum(10));
    }

    @Test
    void sumOfNegative() {
        assertEquals(0, ForLoopSum.sum(-5));
    }
}
