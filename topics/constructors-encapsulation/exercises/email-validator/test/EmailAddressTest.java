import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailAddressTest {

    @Test
    void validEmailParts() {
        EmailAddress email = new EmailAddress("alice@example.com");
        assertEquals("alice", email.getUsername());
        assertEquals("example.com", email.getDomain());
    }

    @Test
    void fullEmail() {
        EmailAddress email = new EmailAddress("bob@mail.org");
        assertEquals("bob@mail.org", email.getFullEmail());
    }

    @Test
    void noAtSignThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmailAddress("invalid");
        });
    }

    @Test
    void noUsernameThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmailAddress("@example.com");
        });
    }

    @Test
    void noDomainThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmailAddress("alice@");
        });
    }
}
