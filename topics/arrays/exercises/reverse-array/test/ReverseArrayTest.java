import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {

    @Test
    void reverseFiveElements() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ReverseArray.reverse(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void reverseTwoElements() {
        assertArrayEquals(new int[]{20, 10}, ReverseArray.reverse(new int[]{10, 20}));
    }

    @Test
    void reverseSingleElement() {
        assertArrayEquals(new int[]{42}, ReverseArray.reverse(new int[]{42}));
    }

    @Test
    void reverseEmptyArray() {
        assertArrayEquals(new int[]{}, ReverseArray.reverse(new int[]{}));
    }
}
