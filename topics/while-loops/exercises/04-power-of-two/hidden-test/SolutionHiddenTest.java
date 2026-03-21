import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void five() {
        assertEquals(8, Solution.powerOfTwo(5));
    }

    @Test
    void nine() {
        assertEquals(16, Solution.powerOfTwo(9));
    }

    @Test
    void sixteenExact() {
        assertEquals(16, Solution.powerOfTwo(16));
    }

    @Test
    void seventeen() {
        assertEquals(32, Solution.powerOfTwo(17));
    }

    @Test
    void largeValue() {
        assertEquals(1024, Solution.powerOfTwo(1000));
    }
}
