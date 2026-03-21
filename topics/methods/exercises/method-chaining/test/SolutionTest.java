import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void setAndGet() {
        assertEquals(5, new Solution().set(5).getResult());
    }

    @Test
    void addChain() {
        assertEquals(8, new Solution().set(5).add(3).getResult());
    }

    @Test
    void subChain() {
        assertEquals(18, new Solution().set(10).sub(4).mul(3).getResult());
    }

    @Test
    void defaultIsZero() {
        assertEquals(0, new Solution().getResult());
    }

    @Test
    void addWithoutSet() {
        assertEquals(10, new Solution().add(5).add(5).getResult());
    }
}
