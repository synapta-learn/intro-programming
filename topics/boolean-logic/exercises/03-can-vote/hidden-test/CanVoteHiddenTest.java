import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanVoteHiddenTest {

    @Test
    void exactlySeventeenNotCitizen() {
        assertFalse(CanVote.canVote(17, false));
    }

    @Test
    void veryOldCitizen() {
        assertTrue(CanVote.canVote(100, true));
    }

    @Test
    void zeroAge() {
        assertFalse(CanVote.canVote(0, true));
    }
}
