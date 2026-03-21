import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeMorgansHiddenTest {

    @Test
    void notBothBothFalse() {
        assertTrue(DeMorgans.notBoth(false, false));
    }

    @Test
    void notEitherBothTrue() {
        assertFalse(DeMorgans.notEither(true, true));
    }

    @Test
    void notAllThreeAllTrue() {
        assertFalse(DeMorgans.notAllThree(true, true, true));
    }

    @Test
    void notAllThreeAllFalse() {
        assertTrue(DeMorgans.notAllThree(false, false, false));
    }
}
