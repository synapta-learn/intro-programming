import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedCounterTest {

    @Test
    void unlinkedCounterWorks() {
        LinkedCounter c = new LinkedCounter();
        c.increment();
        c.increment();
        assertEquals(2, c.getCount());
    }

    @Test
    void linkedIncrementDecrementsOther() {
        LinkedCounter up = new LinkedCounter();
        LinkedCounter down = new LinkedCounter();
        up.linkTo(down);
        up.increment();
        assertEquals(1, up.getCount());
        assertEquals(-1, down.getCount());
    }

    @Test
    void linkedDecrementIncrementsOther() {
        LinkedCounter a = new LinkedCounter();
        LinkedCounter b = new LinkedCounter();
        a.linkTo(b);
        a.decrement();
        assertEquals(-1, a.getCount());
        assertEquals(1, b.getCount());
    }

    @Test
    void unlinkStopsAffectingOther() {
        LinkedCounter a = new LinkedCounter();
        LinkedCounter b = new LinkedCounter();
        a.linkTo(b);
        a.increment();
        a.unlink();
        a.increment();
        assertEquals(2, a.getCount());
        assertEquals(-1, b.getCount());  // not affected after unlink
    }
}
