import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedCounterHiddenTest {

    @Test
    void oneDirectionalLink() {
        LinkedCounter a = new LinkedCounter();
        LinkedCounter b = new LinkedCounter();
        a.linkTo(b);
        b.increment();  // b is not linked to a
        assertEquals(0, a.getCount());  // a unaffected
        assertEquals(1, b.getCount());
    }

    @Test
    void multipleIncrements() {
        LinkedCounter a = new LinkedCounter();
        LinkedCounter b = new LinkedCounter();
        a.linkTo(b);
        a.increment();
        a.increment();
        a.increment();
        assertEquals(3, a.getCount());
        assertEquals(-3, b.getCount());
    }

    @Test
    void startsAtZero() {
        LinkedCounter c = new LinkedCounter();
        assertEquals(0, c.getCount());
    }
}
