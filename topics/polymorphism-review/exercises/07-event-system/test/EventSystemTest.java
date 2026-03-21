import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class EventSystemTest {

    @Test
    void logListenerRecordsEvents() {
        LogListener log = new LogListener("Logger");
        EventBus bus = new EventBus();
        bus.register(log);
        bus.fire("login", "user1");
        bus.fire("click", "button");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("login: user1", "click: button"));
        assertEquals(expected, log.getLog());
    }

    @Test
    void countListenerCountsEvents() {
        CountListener counter = new CountListener("Counter");
        EventBus bus = new EventBus();
        bus.register(counter);
        bus.fire("a", "1");
        bus.fire("b", "2");
        bus.fire("c", "3");
        assertEquals(3, counter.getCount());
    }

    @Test
    void unregisterStopsNotifications() {
        CountListener counter = new CountListener("Counter");
        EventBus bus = new EventBus();
        bus.register(counter);
        bus.fire("x", "data");
        bus.unregister("Counter");
        bus.fire("y", "data");
        assertEquals(1, counter.getCount());
    }

    @Test
    void listenerCount() {
        EventBus bus = new EventBus();
        assertEquals(0, bus.listenerCount());
        bus.register(new LogListener("A"));
        bus.register(new CountListener("B"));
        assertEquals(2, bus.listenerCount());
        bus.unregister("A");
        assertEquals(1, bus.listenerCount());
    }
}
