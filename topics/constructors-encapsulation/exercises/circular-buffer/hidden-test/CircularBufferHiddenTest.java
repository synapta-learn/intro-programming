import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferHiddenTest {

    @Test
    void indexOutOfBoundsThrows() {
        CircularBuffer buf = new CircularBuffer(3);
        buf.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            buf.get(1);  // only index 0 is valid
        });
    }

    @Test
    void capacityOneBuffer() {
        CircularBuffer buf = new CircularBuffer(1);
        buf.add(5);
        assertTrue(buf.isFull());
        assertEquals(5, buf.get(0));
        buf.add(10);
        assertEquals(10, buf.get(0));
    }

    @Test
    void multipleOverwrites() {
        CircularBuffer buf = new CircularBuffer(2);
        buf.add(1);
        buf.add(2);
        buf.add(3);
        buf.add(4);
        assertEquals(3, buf.get(0));
        assertEquals(4, buf.get(1));
    }

    @Test
    void negativeCapacityThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CircularBuffer(-1);
        });
    }
}
