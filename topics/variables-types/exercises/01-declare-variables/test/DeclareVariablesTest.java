import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeclareVariablesTest {

    @Test
    public void testGetAge() {
        assertEquals(25, DeclareVariables.getAge());
    }

    @Test
    public void testGetPrice() {
        assertEquals(9.99, DeclareVariables.getPrice(), 0.001);
    }

    @Test
    public void testIsStudent() {
        assertTrue(DeclareVariables.isStudent());
    }

    @Test
    public void testGetInitial() {
        assertEquals('J', DeclareVariables.getInitial());
    }

    @Test
    public void testGetName() {
        assertEquals("Java", DeclareVariables.getName());
    }
}
