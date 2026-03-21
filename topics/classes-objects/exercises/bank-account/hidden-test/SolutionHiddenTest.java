import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeDepositIgnored() {
        Solution account = new Solution();
        account.deposit(-100.0);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void zeroDepositIgnored() {
        Solution account = new Solution();
        account.deposit(0);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void negativeWithdrawIgnored() {
        Solution account = new Solution();
        account.deposit(100.0);
        account.withdraw(-50.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    void multipleDepositsAndWithdrawals() {
        Solution account = new Solution();
        account.deposit(500.0);
        account.deposit(300.0);
        account.withdraw(200.0);
        account.withdraw(100.0);
        assertEquals(500.0, account.getBalance(), 0.001);
    }
}
