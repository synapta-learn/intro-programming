import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailAddressHiddenTest {

    @Test
    void multipleAtSignsThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmailAddress("a@b@c");
        });
    }

    @Test
    void singleCharUserAndDomain() {
        EmailAddress email = new EmailAddress("a@b");
        assertEquals("a", email.getUsername());
        assertEquals("b", email.getDomain());
    }

    @Test
    void emptyStringThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmailAddress("");
        });
    }
}
