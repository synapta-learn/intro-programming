import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StopwatchTest {

    @Test
    void startsNotRunning() {
        Stopwatch sw = new Stopwatch();
        assertFalse(sw.isRunning());
        assertEquals(0, sw.getElapsedMs());
    }

    @Test
    void startAndAddTime() {
        Stopwatch sw = new Stopwatch();
        sw.start();
        assertTrue(sw.isRunning());
        sw.addTime(1000);
        assertEquals(1000, sw.getElapsedMs());
    }

    @Test
    void stopPreservesTime() {
        Stopwatch sw = new Stopwatch();
        sw.start();
        sw.addTime(500);
        sw.stop();
        assertFalse(sw.isRunning());
        assertEquals(500, sw.getElapsedMs());
    }

    @Test
    void addTimeWhileStoppedDoesNothing() {
        Stopwatch sw = new Stopwatch();
        sw.addTime(1000);
        assertEquals(0, sw.getElapsedMs());
    }

    @Test
    void resetClearsEverything() {
        Stopwatch sw = new Stopwatch();
        sw.start();
        sw.addTime(1000);
        sw.reset();
        assertEquals(0, sw.getElapsedMs());
        assertFalse(sw.isRunning());
    }
}
