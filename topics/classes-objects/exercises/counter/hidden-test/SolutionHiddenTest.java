import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void canGoNegative() {
        Solution counter = new Solution();
        counter.decrement();
        assertEquals(-1, counter.getCount());
    }

    @Test
    void multipleDecrements() {
        Solution counter = new Solution();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        assertEquals(-3, counter.getCount());
    }

    @Test
    void independentCounters() {
        Solution c1 = new Solution();
        Solution c2 = new Solution();
        c1.increment();
        c1.increment();
        c2.increment();
        assertEquals(2, c1.getCount());
        assertEquals(1, c2.getCount());
    }
}
