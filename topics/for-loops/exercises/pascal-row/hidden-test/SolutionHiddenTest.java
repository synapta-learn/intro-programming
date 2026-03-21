import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void rowTwo() {
        assertArrayEquals(new int[]{1, 2, 1}, Solution.pascalRow(2));
    }

    @Test
    void rowThree() {
        assertArrayEquals(new int[]{1, 3, 3, 1}, Solution.pascalRow(3));
    }

    @Test
    void rowSix() {
        assertArrayEquals(new int[]{1, 6, 15, 20, 15, 6, 1}, Solution.pascalRow(6));
    }

    @Test
    void rowTen() {
        assertArrayEquals(new int[]{1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1}, Solution.pascalRow(10));
    }

    @Test
    void firstAndLastAreOne() {
        int[] row = Solution.pascalRow(8);
        assertEquals(1, row[0]);
        assertEquals(1, row[row.length - 1]);
    }

    @Test
    void isSymmetric() {
        int[] row = Solution.pascalRow(7);
        for (int i = 0; i < row.length / 2; i++) {
            assertEquals(row[i], row[row.length - 1 - i]);
        }
    }
}
