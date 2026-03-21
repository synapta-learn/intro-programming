import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void restockIncreasesQuantity() {
        Solution item = new Solution();
        item.price = 10.0;
        item.restock(50);
        assertEquals(50, item.getQuantity());
    }

    @Test
    void sellDecreasesQuantity() {
        Solution item = new Solution();
        item.price = 10.0;
        item.restock(50);
        item.sell(20);
        assertEquals(30, item.getQuantity());
    }

    @Test
    void cannotSellMoreThanAvailable() {
        Solution item = new Solution();
        item.price = 10.0;
        item.restock(10);
        item.sell(20);
        assertEquals(10, item.getQuantity());
    }

    @Test
    void totalValue() {
        Solution item = new Solution();
        item.price = 9.99;
        item.restock(100);
        assertEquals(999.0, item.getTotalValue(), 0.01);
    }

    @Test
    void isInStock() {
        Solution item = new Solution();
        assertFalse(item.isInStock());
        item.restock(1);
        assertTrue(item.isInStock());
    }
}
