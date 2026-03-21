import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void notBothBothFalse() {
        assertTrue(Solution.notBoth(false, false));
    }

    @Test
    void notEitherBothTrue() {
        assertFalse(Solution.notEither(true, true));
    }

    @Test
    void notAllThreeAllTrue() {
        assertFalse(Solution.notAllThree(true, true, true));
    }

    @Test
    void notAllThreeAllFalse() {
        assertTrue(Solution.notAllThree(false, false, false));
    }
}
