import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void bothTrue() {
        assertFalse(Solution.xor(true, true));
    }

    @Test
    void firstTrueSecondFalse() {
        assertTrue(Solution.xor(true, false));
    }

    @Test
    void firstFalseSecondTrue() {
        assertTrue(Solution.xor(false, true));
    }

    @Test
    void bothFalse() {
        assertFalse(Solution.xor(false, false));
    }
}
