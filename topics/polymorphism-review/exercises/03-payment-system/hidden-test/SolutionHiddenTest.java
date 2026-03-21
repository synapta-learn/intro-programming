import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void emptyPayments() {
        ArrayList<Payment> payments = new ArrayList<>();
        assertTrue(Solution.processAll(payments).isEmpty());
        assertEquals(0.0, Solution.totalAmount(payments), 0.001);
    }

    @Test
    void creditCardLastFourDigits() {
        CreditCard cc = new CreditCard(10.00, "9999");
        assertEquals("Paid $10.00 via Credit Card ending in 9999", cc.receipt());
    }

    @Test
    void mixedPaymentsTotal() {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new Cash(10.50));
        payments.add(new BankTransfer(200.00, "Wells Fargo"));
        payments.add(new CreditCard(75.25, "4444333322221111"));
        assertEquals(285.75, Solution.totalAmount(payments), 0.01);
    }
}
