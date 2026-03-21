import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeRestockIgnored() {
        Solution item = new Solution();
        item.restock(-10);
        assertEquals(0, item.getQuantity());
    }

    @Test
    void zeroSellIgnored() {
        Solution item = new Solution();
        item.restock(10);
        item.sell(0);
        assertEquals(10, item.getQuantity());
    }

    @Test
    void totalValueWithZeroQuantity() {
        Solution item = new Solution();
        item.price = 50.0;
        assertEquals(0.0, item.getTotalValue(), 0.001);
    }
}
