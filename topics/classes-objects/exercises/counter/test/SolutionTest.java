import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void startsAtZero() {
        Solution counter = new Solution();
        assertEquals(0, counter.getCount());
    }

    @Test
    void incrementOnce() {
        Solution counter = new Solution();
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    void incrementMultipleTimes() {
        Solution counter = new Solution();
        counter.increment();
        counter.increment();
        counter.increment();
        assertEquals(3, counter.getCount());
    }

    @Test
    void decrementOnce() {
        Solution counter = new Solution();
        counter.increment();
        counter.increment();
        counter.decrement();
        assertEquals(1, counter.getCount());
    }
}
