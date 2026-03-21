import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void validEmailParts() {
        Solution email = new Solution("alice@example.com");
        assertEquals("alice", email.getUsername());
        assertEquals("example.com", email.getDomain());
    }

    @Test
    void fullEmail() {
        Solution email = new Solution("bob@mail.org");
        assertEquals("bob@mail.org", email.getFullEmail());
    }

    @Test
    void noAtSignThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("invalid");
        });
    }

    @Test
    void noUsernameThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("@example.com");
        });
    }

    @Test
    void noDomainThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution("alice@");
        });
    }
}
