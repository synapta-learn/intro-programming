import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void four() {
        assertEquals(2, Solution.collatzSteps(4));
    }

    @Test
    void sixteen() {
        assertEquals(4, Solution.collatzSteps(16));
    }

    @Test
    void twentySeven() {
        assertEquals(111, Solution.collatzSteps(27));
    }
}
