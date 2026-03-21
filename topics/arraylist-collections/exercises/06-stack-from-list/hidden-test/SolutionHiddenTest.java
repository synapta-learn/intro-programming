import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void popMakesStackSmaller() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        assertEquals(2, s.size());
        assertFalse(s.isEmpty());
    }

    @Test
    void peekDoesNotRemove() {
        Stack s = new Stack();
        s.push(99);
        s.peek();
        s.peek();
        s.peek();
        assertEquals(1, s.size());
        assertEquals(99, s.pop());
    }

    @Test
    void pushAfterPop() {
        Stack s = new Stack();
        s.push(1);
        s.pop();
        assertTrue(s.isEmpty());
        s.push(2);
        assertEquals(2, s.peek());
        assertEquals(1, s.size());
    }
}
