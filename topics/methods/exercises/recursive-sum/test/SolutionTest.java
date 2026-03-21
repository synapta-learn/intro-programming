import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void sumOfOneTwoThree() {
        assertEquals(6, Solution.digitSum(123));
    }

    @Test
    void singleDigit() {
        assertEquals(9, Solution.digitSum(9));
    }

    @Test
    void zero() {
        assertEquals(0, Solution.digitSum(0));
    }

    @Test
    void allNines() {
        assertEquals(27, Solution.digitSum(999));
    }

    @Test
    void numberWithZero() {
        assertEquals(1, Solution.digitSum(10));
    }
}
