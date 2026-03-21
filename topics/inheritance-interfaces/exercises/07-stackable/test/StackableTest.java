import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackableTest {

    @Test
    void pushAndPeek() {
        Stackable<String> stack = new ArrayStack<>();
        stack.push("hello");
        assertEquals("hello", stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void lifoOrder() {
        Stackable<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void emptyStackReturnsNull() {
        Stackable<String> stack = new ArrayStack<>();
        assertNull(stack.pop());
        assertNull(stack.peek());
        assertTrue(stack.isEmpty());
    }

    @Test
    void sizeTracking() {
        Stackable<String> stack = new ArrayStack<>();
        assertEquals(0, stack.size());
        stack.push("a");
        stack.push("b");
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }
}
