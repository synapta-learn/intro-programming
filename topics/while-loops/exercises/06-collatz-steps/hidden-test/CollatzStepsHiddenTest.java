import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollatzStepsHiddenTest {

    @Test
    void four() {
        assertEquals(2, CollatzSteps.collatzSteps(4));
    }

    @Test
    void sixteen() {
        assertEquals(4, CollatzSteps.collatzSteps(16));
    }

    @Test
    void twentySeven() {
        assertEquals(111, CollatzSteps.collatzSteps(27));
    }
}
