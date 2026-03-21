import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void notBothTrue() {
        assertFalse(Solution.notBoth(true, true));
    }

    @Test
    void notBothOneFalse() {
        assertTrue(Solution.notBoth(true, false));
    }

    @Test
    void notEitherBothFalse() {
        assertTrue(Solution.notEither(false, false));
    }

    @Test
    void notEitherOneTrue() {
        assertFalse(Solution.notEither(true, false));
    }

    @Test
    void notAllThreeOneFalse() {
        assertTrue(Solution.notAllThree(true, true, false));
    }
}
