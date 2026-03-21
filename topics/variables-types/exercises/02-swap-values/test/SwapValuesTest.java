import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwapValuesTest {

    @Test
    public void testSwapBasic() {
        int[] result = SwapValues.swap(3, 7);
        assertEquals(7, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testSwapReturnsArray() {
        int[] result = SwapValues.swap(1, 2);
        assertEquals(2, result.length);
    }
}
