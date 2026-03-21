import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class EventSystemHiddenTest {

    @Test
    void noListenersFiringDoesNotCrash() {
        EventBus bus = new EventBus();
        bus.fire("test", "data");
        // should not throw
        assertEquals(0, bus.listenerCount());
    }

    @Test
    void multipleListenersReceiveEvent() {
        CountListener c1 = new CountListener("C1");
        CountListener c2 = new CountListener("C2");
        EventBus bus = new EventBus();
        bus.register(c1);
        bus.register(c2);
        bus.fire("ping", "");
        assertEquals(1, c1.getCount());
        assertEquals(1, c2.getCount());
    }

    @Test
    void logReturnsACopy() {
        LogListener log = new LogListener("L");
        EventBus bus = new EventBus();
        bus.register(log);
        bus.fire("e", "d");
        ArrayList<String> copy = log.getLog();
        copy.clear();
        assertEquals(1, log.getLog().size());
    }

    @Test
    void unregisterNonexistentDoesNotCrash() {
        EventBus bus = new EventBus();
        bus.register(new CountListener("Exists"));
        bus.unregister("DoesNotExist");
        assertEquals(1, bus.listenerCount());
    }
}
