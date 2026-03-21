import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveSumTest {

    @Test
    void sumOfOneTwoThree() {
        assertEquals(6, RecursiveSum.digitSum(123));
    }

    @Test
    void singleDigit() {
        assertEquals(9, RecursiveSum.digitSum(9));
    }

    @Test
    void zero() {
        assertEquals(0, RecursiveSum.digitSum(0));
    }

    @Test
    void allNines() {
        assertEquals(27, RecursiveSum.digitSum(999));
    }

    @Test
    void numberWithZero() {
        assertEquals(1, RecursiveSum.digitSum(10));
    }
}
