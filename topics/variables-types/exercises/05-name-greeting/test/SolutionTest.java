import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testGreetAda() {
        assertEquals("Hello, Ada Lovelace! Welcome!", Solution.greet("Ada", "Lovelace"));
    }

    @Test
    public void testGreetAlan() {
        assertEquals("Hello, Alan Turing! Welcome!", Solution.greet("Alan", "Turing"));
    }
}
