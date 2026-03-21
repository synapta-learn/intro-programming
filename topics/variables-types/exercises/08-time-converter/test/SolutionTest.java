import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testHours3661() {
        assertEquals(1, Solution.toHours(3661));
    }

    @Test
    public void testMinutes3661() {
        assertEquals(1, Solution.toMinutes(3661));
    }

    @Test
    public void testSeconds3661() {
        assertEquals(1, Solution.toSeconds(3661));
    }

    @Test
    public void testHours7325() {
        assertEquals(2, Solution.toHours(7325));
    }

    @Test
    public void testMinutes7325() {
        assertEquals(2, Solution.toMinutes(7325));
    }

    @Test
    public void testSeconds7325() {
        assertEquals(5, Solution.toSeconds(7325));
    }
}
