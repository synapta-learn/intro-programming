import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    void startsAtZero() {
        Counter counter = new Counter();
        assertEquals(0, counter.getCount());
    }

    @Test
    void incrementOnce() {
        Counter counter = new Counter();
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    void incrementMultipleTimes() {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        assertEquals(3, counter.getCount());
    }

    @Test
    void decrementOnce() {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        assertEquals(1, counter.getCount());
    }
}
