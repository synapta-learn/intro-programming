import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayHiddenTest {

    @Test
    void rotateByMoreThanLength() {
        // 5 % 3 = 2, so same as rotating by 2
        assertArrayEquals(new int[]{2, 3, 1}, RotateArray.rotate(new int[]{1, 2, 3}, 5));
    }

    @Test
    void rotateSingleElement() {
        assertArrayEquals(new int[]{42}, RotateArray.rotate(new int[]{42}, 7));
    }

    @Test
    void rotateEmptyArray() {
        assertArrayEquals(new int[]{}, RotateArray.rotate(new int[]{}, 3));
    }

    @Test
    void doesNotModifyOriginal() {
        int[] original = {1, 2, 3, 4};
        RotateArray.rotate(original, 2);
        assertArrayEquals(new int[]{1, 2, 3, 4}, original);
    }

    @Test
    void rotateTwoElements() {
        assertArrayEquals(new int[]{2, 1}, RotateArray.rotate(new int[]{1, 2}, 1));
    }

    @Test
    void largeRotation() {
        // 100 % 4 = 0, so no change
        assertArrayEquals(new int[]{1, 2, 3, 4}, RotateArray.rotate(new int[]{1, 2, 3, 4}, 100));
    }

    @Test
    void rotateByLengthMinusOne() {
        assertArrayEquals(new int[]{2, 3, 4, 1}, RotateArray.rotate(new int[]{1, 2, 3, 4}, 3));
    }
}
