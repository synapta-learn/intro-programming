import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void onlyAge() {
        String result = new Solution()
            .setAge(25)
            .build();
        assertEquals("Name: unknown, Age: 25, Email: unknown", result);
    }

    @Test
    void onlyEmail() {
        String result = new Solution()
            .setEmail("test@test.com")
            .build();
        assertEquals("Name: unknown, Age: 0, Email: test@test.com", result);
    }

    @Test
    void nameAndEmail() {
        String result = new Solution()
            .setName("Carol")
            .setEmail("carol@mail.com")
            .build();
        assertEquals("Name: Carol, Age: 0, Email: carol@mail.com", result);
    }
}
