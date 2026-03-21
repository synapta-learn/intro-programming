import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameGreetingHiddenTest {

    @Test
    public void testGreetGrace() {
        assertEquals("Hello, Grace Hopper! Welcome!", NameGreeting.greet("Grace", "Hopper"));
    }

    @Test
    public void testGreetSingleCharNames() {
        assertEquals("Hello, A B! Welcome!", NameGreeting.greet("A", "B"));
    }

    @Test
    public void testStartsWithHello() {
        String result = NameGreeting.greet("Test", "User");
        assertTrue(result.startsWith("Hello, "),
            "Greeting should start with 'Hello, '");
    }

    @Test
    public void testEndsWithWelcome() {
        String result = NameGreeting.greet("Test", "User");
        assertTrue(result.endsWith("! Welcome!"),
            "Greeting should end with '! Welcome!'");
    }

    @Test
    public void testContainsFirstName() {
        String result = NameGreeting.greet("Marie", "Curie");
        assertTrue(result.contains("Marie"),
            "Greeting should contain the first name");
    }

    @Test
    public void testContainsLastName() {
        String result = NameGreeting.greet("Marie", "Curie");
        assertTrue(result.contains("Curie"),
            "Greeting should contain the last name");
    }

    @Test
    public void testSpaceBetweenNames() {
        String result = NameGreeting.greet("Marie", "Curie");
        assertTrue(result.contains("Marie Curie"),
            "There should be a space between first and last name");
    }

    @Test
    public void testNotNull() {
        String result = NameGreeting.greet("Test", "User");
        assertNotNull(result, "Method should not return null");
    }
}
