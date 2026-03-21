import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PascalRowTest {

    @Test
    void rowZero() {
        assertArrayEquals(new int[]{1}, PascalRow.pascalRow(0));
    }

    @Test
    void rowOne() {
        assertArrayEquals(new int[]{1, 1}, PascalRow.pascalRow(1));
    }

    @Test
    void rowFour() {
        assertArrayEquals(new int[]{1, 4, 6, 4, 1}, PascalRow.pascalRow(4));
    }

    @Test
    void rowHasCorrectLength() {
        assertEquals(6, PascalRow.pascalRow(5).length);
    }
}
