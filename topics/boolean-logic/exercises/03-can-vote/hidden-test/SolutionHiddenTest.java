import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void exactlySeventeenNotCitizen() {
        assertFalse(Solution.canVote(17, false));
    }

    @Test
    void veryOldCitizen() {
        assertTrue(Solution.canVote(100, true));
    }

    @Test
    void zeroAge() {
        assertFalse(Solution.canVote(0, true));
    }
}
