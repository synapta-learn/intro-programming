import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterTest {

    @Test
    public void testHours3661() {
        assertEquals(1, TimeConverter.toHours(3661));
    }

    @Test
    public void testMinutes3661() {
        assertEquals(1, TimeConverter.toMinutes(3661));
    }

    @Test
    public void testSeconds3661() {
        assertEquals(1, TimeConverter.toSeconds(3661));
    }

    @Test
    public void testHours7325() {
        assertEquals(2, TimeConverter.toHours(7325));
    }

    @Test
    public void testMinutes7325() {
        assertEquals(2, TimeConverter.toMinutes(7325));
    }

    @Test
    public void testSeconds7325() {
        assertEquals(5, TimeConverter.toSeconds(7325));
    }
}
