import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollatzStepsTest {

    @Test
    void alreadyOne() {
        assertEquals(0, CollatzSteps.collatzSteps(1));
    }

    @Test
    void two() {
        assertEquals(1, CollatzSteps.collatzSteps(2));
    }

    @Test
    void three() {
        assertEquals(7, CollatzSteps.collatzSteps(3));
    }

    @Test
    void six() {
        assertEquals(8, CollatzSteps.collatzSteps(6));
    }

    @Test
    void seven() {
        assertEquals(16, CollatzSteps.collatzSteps(7));
    }
}
