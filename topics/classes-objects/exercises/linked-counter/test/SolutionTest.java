import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void unlinkedCounterWorks() {
        Solution c = new Solution();
        c.increment();
        c.increment();
        assertEquals(2, c.getCount());
    }

    @Test
    void linkedIncrementDecrementsOther() {
        Solution up = new Solution();
        Solution down = new Solution();
        up.linkTo(down);
        up.increment();
        assertEquals(1, up.getCount());
        assertEquals(-1, down.getCount());
    }

    @Test
    void linkedDecrementIncrementsOther() {
        Solution a = new Solution();
        Solution b = new Solution();
        a.linkTo(b);
        a.decrement();
        assertEquals(-1, a.getCount());
        assertEquals(1, b.getCount());
    }

    @Test
    void unlinkStopsAffectingOther() {
        Solution a = new Solution();
        Solution b = new Solution();
        a.linkTo(b);
        a.increment();
        a.unlink();
        a.increment();
        assertEquals(2, a.getCount());
        assertEquals(-1, b.getCount());  // not affected after unlink
    }
}
