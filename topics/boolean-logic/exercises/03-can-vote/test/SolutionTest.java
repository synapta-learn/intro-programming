import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void adultCitizen() {
        assertTrue(Solution.canVote(20, true));
    }

    @Test
    void minorCitizen() {
        assertFalse(Solution.canVote(17, true));
    }

    @Test
    void adultNonCitizen() {
        assertFalse(Solution.canVote(20, false));
    }

    @Test
    void minorNonCitizen() {
        assertFalse(Solution.canVote(17, false));
    }

    @Test
    void exactlyEighteen() {
        assertTrue(Solution.canVote(18, true));
    }
}
