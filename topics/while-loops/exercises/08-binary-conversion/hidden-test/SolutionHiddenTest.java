import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void powerOfTwo() {
        assertEquals("10000", Solution.toBinary(16));
    }

    @Test
    void allOnes() {
        assertEquals("11111111", Solution.toBinary(255));
    }

    @Test
    void seven() {
        assertEquals("111", Solution.toBinary(7));
    }

    @Test
    void thirtyTwo() {
        assertEquals("100000", Solution.toBinary(32));
    }
}
