import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void pushAndPeek() {
        Stack s = new Stack();
        s.push(42);
        assertEquals(42, s.peek());
        assertEquals(1, s.size());
    }

    @Test
    void pushAndPop() {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        assertEquals(20, s.pop());
        assertEquals(10, s.pop());
    }

    @Test
    void lifoOrder() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.pop());
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
    }

    @Test
    void emptyStack() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        assertEquals(-1, s.pop());
        assertEquals(-1, s.peek());
    }
}
