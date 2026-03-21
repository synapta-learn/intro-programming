import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void oneDirectionalLink() {
        Solution a = new Solution();
        Solution b = new Solution();
        a.linkTo(b);
        b.increment();  // b is not linked to a
        assertEquals(0, a.getCount());  // a unaffected
        assertEquals(1, b.getCount());
    }

    @Test
    void multipleIncrements() {
        Solution a = new Solution();
        Solution b = new Solution();
        a.linkTo(b);
        a.increment();
        a.increment();
        a.increment();
        assertEquals(3, a.getCount());
        assertEquals(-3, b.getCount());
    }

    @Test
    void startsAtZero() {
        Solution c = new Solution();
        assertEquals(0, c.getCount());
    }
}
