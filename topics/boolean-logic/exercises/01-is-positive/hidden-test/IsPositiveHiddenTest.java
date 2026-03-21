import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPositiveHiddenTest {

    @Test
    void one() {
        assertTrue(IsPositive.isPositive(1));
    }

    @Test
    void negativeOne() {
        assertFalse(IsPositive.isPositive(-1));
    }

    @Test
    void largeNegative() {
        assertFalse(IsPositive.isPositive(-999999));
    }
}
