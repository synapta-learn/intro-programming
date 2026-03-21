import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testGetAge() {
        assertEquals(25, Solution.getAge());
    }

    @Test
    public void testGetPrice() {
        assertEquals(9.99, Solution.getPrice(), 0.001);
    }

    @Test
    public void testIsStudent() {
        assertTrue(Solution.isStudent());
    }

    @Test
    public void testGetInitial() {
        assertEquals('J', Solution.getInitial());
    }

    @Test
    public void testGetName() {
        assertEquals("Java", Solution.getName());
    }
}
