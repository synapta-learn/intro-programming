import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void alreadyOne() {
        assertEquals(0, Solution.collatzSteps(1));
    }

    @Test
    void two() {
        assertEquals(1, Solution.collatzSteps(2));
    }

    @Test
    void three() {
        assertEquals(7, Solution.collatzSteps(3));
    }

    @Test
    void six() {
        assertEquals(8, Solution.collatzSteps(6));
    }

    @Test
    void seven() {
        assertEquals(16, Solution.collatzSteps(7));
    }
}
