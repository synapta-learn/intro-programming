import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    void emptyBuffer() {
        CircularBuffer buf = new CircularBuffer(3);
        assertEquals(0, buf.size());
        assertFalse(buf.isFull());
        assertEquals(3, buf.getCapacity());
    }

    @Test
    void addAndGet() {
        CircularBuffer buf = new CircularBuffer(3);
        buf.add(10);
        buf.add(20);
        assertEquals(2, buf.size());
        assertEquals(10, buf.get(0));
        assertEquals(20, buf.get(1));
    }

    @Test
    void fullBuffer() {
        CircularBuffer buf = new CircularBuffer(3);
        buf.add(10);
        buf.add(20);
        buf.add(30);
        assertTrue(buf.isFull());
        assertEquals(3, buf.size());
    }

    @Test
    void overwriteOldest() {
        CircularBuffer buf = new CircularBuffer(3);
        buf.add(10);
        buf.add(20);
        buf.add(30);
        buf.add(40);  // overwrites 10
        assertEquals(20, buf.get(0));  // new oldest
        assertEquals(40, buf.get(2));  // newest
    }

    @Test
    void invalidCapacityThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CircularBuffer(0);
        });
    }
}
