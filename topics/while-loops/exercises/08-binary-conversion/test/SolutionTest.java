import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void zero() {
        assertEquals("0", Solution.toBinary(0));
    }

    @Test
    void one() {
        assertEquals("1", Solution.toBinary(1));
    }

    @Test
    void two() {
        assertEquals("10", Solution.toBinary(2));
    }

    @Test
    void five() {
        assertEquals("101", Solution.toBinary(5));
    }

    @Test
    void ten() {
        assertEquals("1010", Solution.toBinary(10));
    }
}
