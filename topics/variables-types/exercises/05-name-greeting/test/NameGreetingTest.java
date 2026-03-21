import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameGreetingTest {

    @Test
    public void testGreetAda() {
        assertEquals("Hello, Ada Lovelace! Welcome!", NameGreeting.greet("Ada", "Lovelace"));
    }

    @Test
    public void testGreetAlan() {
        assertEquals("Hello, Alan Turing! Welcome!", NameGreeting.greet("Alan", "Turing"));
    }
}
