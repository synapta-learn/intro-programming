import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterHiddenTest {

    @Test
    void canGoNegative() {
        Counter counter = new Counter();
        counter.decrement();
        assertEquals(-1, counter.getCount());
    }

    @Test
    void multipleDecrements() {
        Counter counter = new Counter();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        assertEquals(-3, counter.getCount());
    }

    @Test
    void independentCounters() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c1.increment();
        c2.increment();
        assertEquals(2, c1.getCount());
        assertEquals(1, c2.getCount());
    }
}
