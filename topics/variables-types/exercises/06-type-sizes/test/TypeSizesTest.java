import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TypeSizesTest {

    @Test
    public void testMinInt() {
        assertEquals(Integer.MIN_VALUE, TypeSizes.getMinInt());
    }

    @Test
    public void testMaxInt() {
        assertEquals(Integer.MAX_VALUE, TypeSizes.getMaxInt());
    }

    @Test
    public void testIntRange() {
        assertEquals(4294967296L, TypeSizes.getIntRange());
    }
}
