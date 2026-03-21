import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void areaWithDecimals() {
        Solution rect = new Solution();
        rect.width = 2.5;
        rect.height = 4.0;
        assertEquals(10.0, rect.area(), 0.001);
    }

    @Test
    void perimeterOfSquare() {
        Solution square = new Solution();
        square.width = 7.0;
        square.height = 7.0;
        assertEquals(28.0, square.perimeter(), 0.001);
    }

    @Test
    void defaultValuesGiveZero() {
        Solution rect = new Solution();
        assertEquals(0.0, rect.area(), 0.001);
        assertEquals(0.0, rect.perimeter(), 0.001);
    }
}
