import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void palindrome() {
        assertEquals(12321, Solution.reverseNumber(12321));
    }

    @Test
    void oneZeroInMiddle() {
        assertEquals(201, Solution.reverseNumber(102));
    }

    @Test
    void ten() {
        assertEquals(1, Solution.reverseNumber(10));
    }

    @Test
    void allSameDigits() {
        assertEquals(111, Solution.reverseNumber(111));
    }
}
