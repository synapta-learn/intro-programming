import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void one() {
        assertEquals(1, Solution.powerOfTwo(1));
    }

    @Test
    void two() {
        assertEquals(2, Solution.powerOfTwo(2));
    }

    @Test
    void three() {
        assertEquals(4, Solution.powerOfTwo(3));
    }

    @Test
    void exactPower() {
        assertEquals(8, Solution.powerOfTwo(8));
    }

    @Test
    void hundred() {
        assertEquals(128, Solution.powerOfTwo(100));
    }
}
