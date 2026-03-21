import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPositiveTest {

    @Test
    void positiveNumber() {
        assertTrue(IsPositive.isPositive(5));
    }

    @Test
    void negativeNumber() {
        assertFalse(IsPositive.isPositive(-3));
    }

    @Test
    void zero() {
        assertFalse(IsPositive.isPositive(0));
    }

    @Test
    void largePositive() {
        assertTrue(IsPositive.isPositive(1000000));
    }
}
