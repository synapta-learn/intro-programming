import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void fullBuild() {
        String result = new Solution()
            .setName("Alice")
            .setAge(30)
            .setEmail("alice@example.com")
            .build();
        assertEquals("Name: Alice, Age: 30, Email: alice@example.com", result);
    }

    @Test
    void partialBuild() {
        String result = new Solution()
            .setName("Bob")
            .build();
        assertEquals("Name: Bob, Age: 0, Email: unknown", result);
    }

    @Test
    void defaultBuild() {
        String result = new Solution().build();
        assertEquals("Name: unknown, Age: 0, Email: unknown", result);
    }

    @Test
    void chainingReturnsBuilder() {
        Solution builder = new Solution();
        Solution returned = builder.setName("Test");
        assertSame(builder, returned);  // same object reference
    }
}
