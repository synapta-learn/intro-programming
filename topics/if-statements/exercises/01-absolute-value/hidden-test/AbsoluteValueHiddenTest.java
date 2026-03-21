import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteValueHiddenTest {

    @Test
    void one() {
        assertEquals(1, AbsoluteValue.absoluteValue(1));
    }

    @Test
    void negativeOne() {
        assertEquals(1, AbsoluteValue.absoluteValue(-1));
    }

    @Test
    void largePositive() {
        assertEquals(999999, AbsoluteValue.absoluteValue(999999));
    }
}
