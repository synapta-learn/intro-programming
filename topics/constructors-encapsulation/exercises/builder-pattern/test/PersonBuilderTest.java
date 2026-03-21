import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonBuilderTest {

    @Test
    void fullBuild() {
        String result = new PersonBuilder()
            .setName("Alice")
            .setAge(30)
            .setEmail("alice@example.com")
            .build();
        assertEquals("Name: Alice, Age: 30, Email: alice@example.com", result);
    }

    @Test
    void partialBuild() {
        String result = new PersonBuilder()
            .setName("Bob")
            .build();
        assertEquals("Name: Bob, Age: 0, Email: unknown", result);
    }

    @Test
    void defaultBuild() {
        String result = new PersonBuilder().build();
        assertEquals("Name: unknown, Age: 0, Email: unknown", result);
    }

    @Test
    void chainingReturnsBuilder() {
        PersonBuilder builder = new PersonBuilder();
        PersonBuilder returned = builder.setName("Test");
        assertSame(builder, returned);  // same object reference
    }
}
