import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeMorgansTest {

    @Test
    void notBothTrue() {
        assertFalse(DeMorgans.notBoth(true, true));
    }

    @Test
    void notBothOneFalse() {
        assertTrue(DeMorgans.notBoth(true, false));
    }

    @Test
    void notEitherBothFalse() {
        assertTrue(DeMorgans.notEither(false, false));
    }

    @Test
    void notEitherOneTrue() {
        assertFalse(DeMorgans.notEither(true, false));
    }

    @Test
    void notAllThreeOneFalse() {
        assertTrue(DeMorgans.notAllThree(true, true, false));
    }
}
