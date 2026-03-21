import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testSwapBasic() {
        int[] result = Solution.swap(3, 7);
        assertEquals(7, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testSwapReturnsArray() {
        int[] result = Solution.swap(1, 2);
        assertEquals(2, result.length);
    }
}
