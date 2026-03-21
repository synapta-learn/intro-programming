import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void startsNotRunning() {
        Solution sw = new Solution();
        assertFalse(sw.isRunning());
        assertEquals(0, sw.getElapsedMs());
    }

    @Test
    void startAndAddTime() {
        Solution sw = new Solution();
        sw.start();
        assertTrue(sw.isRunning());
        sw.addTime(1000);
        assertEquals(1000, sw.getElapsedMs());
    }

    @Test
    void stopPreservesTime() {
        Solution sw = new Solution();
        sw.start();
        sw.addTime(500);
        sw.stop();
        assertFalse(sw.isRunning());
        assertEquals(500, sw.getElapsedMs());
    }

    @Test
    void addTimeWhileStoppedDoesNothing() {
        Solution sw = new Solution();
        sw.addTime(1000);
        assertEquals(0, sw.getElapsedMs());
    }

    @Test
    void resetClearsEverything() {
        Solution sw = new Solution();
        sw.start();
        sw.addTime(1000);
        sw.reset();
        assertEquals(0, sw.getElapsedMs());
        assertFalse(sw.isRunning());
    }
}
