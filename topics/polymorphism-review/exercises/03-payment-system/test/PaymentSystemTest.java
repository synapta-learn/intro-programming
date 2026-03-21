import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentSystemTest {

    @Test
    void creditCardReceipt() {
        CreditCard cc = new CreditCard(99.99, "4111222233334444");
        assertEquals("Paid $99.99 via Credit Card ending in 4444", cc.receipt());
    }

    @Test
    void bankTransferReceipt() {
        BankTransfer bt = new BankTransfer(500.00, "Chase");
        assertEquals("Paid $500.00 via Bank Transfer from Chase", bt.receipt());
    }

    @Test
    void cashReceipt() {
        Cash c = new Cash(20.00);
        assertEquals("Paid $20.00 in Cash", c.receipt());
    }

    @Test
    void processAllAndTotal() {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new CreditCard(100, "1234567890121234"));
        payments.add(new Cash(50));
        ArrayList<String> receipts = PaymentSystem.processAll(payments);
        assertEquals(2, receipts.size());
        assertEquals(150.0, PaymentSystem.totalAmount(payments), 0.01);
    }

    @Test
    void getMethodNames() {
        assertEquals("Credit Card", new CreditCard(10, "1234").getMethod());
        assertEquals("Bank Transfer", new BankTransfer(10, "Bank").getMethod());
        assertEquals("Cash", new Cash(10).getMethod());
    }
}
