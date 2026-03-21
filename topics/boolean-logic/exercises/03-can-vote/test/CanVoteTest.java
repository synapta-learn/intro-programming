import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanVoteTest {

    @Test
    void adultCitizen() {
        assertTrue(CanVote.canVote(20, true));
    }

    @Test
    void minorCitizen() {
        assertFalse(CanVote.canVote(17, true));
    }

    @Test
    void adultNonCitizen() {
        assertFalse(CanVote.canVote(20, false));
    }

    @Test
    void minorNonCitizen() {
        assertFalse(CanVote.canVote(17, false));
    }

    @Test
    void exactlyEighteen() {
        assertTrue(CanVote.canVote(18, true));
    }
}
