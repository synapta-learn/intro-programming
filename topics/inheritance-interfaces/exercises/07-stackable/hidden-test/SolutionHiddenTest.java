import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void peekDoesNotRemove() {
        Stackable<Integer> stack = new ArrayStack<>();
        stack.push(42);
        stack.peek();
        stack.peek();
        assertEquals(1, stack.size());
        assertEquals(42, stack.pop());
    }

    @Test
    void worksWithDifferentTypes() {
        Stackable<Double> stack = new ArrayStack<>();
        stack.push(3.14);
        stack.push(2.72);
        assertEquals(2.72, stack.pop(), 0.001);
        assertEquals(3.14, stack.pop(), 0.001);
    }

    @Test
    void pushAfterEmptying() {
        Stackable<String> stack = new ArrayStack<>();
        stack.push("x");
        stack.pop();
        assertTrue(stack.isEmpty());
        stack.push("y");
        assertFalse(stack.isEmpty());
        assertEquals("y", stack.peek());
    }
}
