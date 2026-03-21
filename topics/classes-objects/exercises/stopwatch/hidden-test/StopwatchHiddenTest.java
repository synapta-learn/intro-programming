import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StopwatchHiddenTest {

    @Test
    void accumulatesAcrossStartStop() {
        Stopwatch sw = new Stopwatch();
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
        Stopwatch sw = new Stopwatch();
        sw.start();
        sw.addTime(1000);
        sw.start();  // should do nothing
        sw.addTime(500);
        assertEquals(1500, sw.getElapsedMs());
    }

    @Test
    void doubleStopIsHarmless() {
        Stopwatch sw = new Stopwatch();
        sw.start();
        sw.addTime(1000);
        sw.stop();
        sw.stop();  // should do nothing
        assertEquals(1000, sw.getElapsedMs());
    }
}
