import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void accumulatesAcrossStartStop() {
        Solution sw = new Solution();
        sw.start();
        sw.addTime(1000);
        sw.stop();
        sw.start();
        sw.addTime(500);
        sw.stop();
        assertEquals(1500, sw.getElapsedMs());
    }

    @Test
    void doubleStartDoesNotReset() {
        Solution sw = new Solution();
        sw.start();
        sw.addTime(1000);
        sw.start();  // should do nothing
        sw.addTime(500);
        assertEquals(1500, sw.getElapsedMs());
    }

    @Test
    void doubleStopIsHarmless() {
        Solution sw = new Solution();
        sw.start();
        sw.addTime(1000);
        sw.stop();
        sw.stop();  // should do nothing
        assertEquals(1000, sw.getElapsedMs());
    }
}
