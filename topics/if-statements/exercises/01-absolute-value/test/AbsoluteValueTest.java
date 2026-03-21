import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteValueTest {

    @Test
    void positiveNumber() {
        assertEquals(5, AbsoluteValue.absoluteValue(5));
    }

    @Test
    void negativeNumber() {
        assertEquals(5, AbsoluteValue.absoluteValue(-5));
    }

    @Test
    void zero() {
        assertEquals(0, AbsoluteValue.absoluteValue(0));
    }

    @Test
    void largeNegative() {
        assertEquals(42, AbsoluteValue.absoluteValue(-42));
    }
}
