import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesHiddenTest {

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{7}, RemoveDuplicates.removeDuplicates(new int[]{7}));
    }

    @Test
    void preservesOrder() {
        assertArrayEquals(new int[]{3, 1, 2}, RemoveDuplicates.removeDuplicates(new int[]{3, 1, 2, 1, 3}));
    }

    @Test
    void withNegatives() {
        assertArrayEquals(new int[]{-1, 2, -3}, RemoveDuplicates.removeDuplicates(new int[]{-1, 2, -3, 2, -1}));
    }

    @Test
    void twoSameElements() {
        assertArrayEquals(new int[]{4}, RemoveDuplicates.removeDuplicates(new int[]{4, 4}));
    }

    @Test
    void twoDifferentElements() {
        assertArrayEquals(new int[]{4, 5}, RemoveDuplicates.removeDuplicates(new int[]{4, 5}));
    }

    @Test
    void withZeros() {
        assertArrayEquals(new int[]{0, 1, 2}, RemoveDuplicates.removeDuplicates(new int[]{0, 1, 0, 2, 1}));
    }

    @Test
    void longerArrayWithDuplicates() {
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5},
            RemoveDuplicates.removeDuplicates(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5})
        );
    }
}
