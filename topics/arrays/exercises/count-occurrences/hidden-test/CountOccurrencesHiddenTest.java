import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountOccurrencesHiddenTest {

    @Test
    void countSingleOccurrence() {
        assertEquals(1, CountOccurrences.countOccurrences(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void countZeros() {
        assertEquals(3, CountOccurrences.countOccurrences(new int[]{0, 1, 0, 2, 0}, 0));
    }

    @Test
    void countNegativeTarget() {
        assertEquals(2, CountOccurrences.countOccurrences(new int[]{-1, 3, -1, 5}, -1));
    }

    @Test
    void countInSingleElementArray() {
        assertEquals(1, CountOccurrences.countOccurrences(new int[]{7}, 7));
    }

    @Test
    void countSingleElementNotFound() {
        assertEquals(0, CountOccurrences.countOccurrences(new int[]{7}, 3));
    }

    @Test
    void countAtBeginningAndEnd() {
        assertEquals(2, CountOccurrences.countOccurrences(new int[]{9, 1, 2, 3, 9}, 9));
    }
}
