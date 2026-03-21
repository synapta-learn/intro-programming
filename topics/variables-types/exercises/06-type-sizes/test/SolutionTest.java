import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMinInt() {
        assertEquals(Integer.MIN_VALUE, Solution.getMinInt());
    }

    @Test
    public void testMaxInt() {
        assertEquals(Integer.MAX_VALUE, Solution.getMaxInt());
    }

    @Test
    public void testIntRange() {
        assertEquals(4294967296L, Solution.getIntRange());
    }
}
