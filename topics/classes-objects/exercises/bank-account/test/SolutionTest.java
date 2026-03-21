import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void startsWithZeroBalance() {
        Solution account = new Solution();
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void depositIncreasesBalance() {
        Solution account = new Solution();
        account.deposit(500.0);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawDecreasesBalance() {
        Solution account = new Solution();
        account.deposit(1000.0);
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test
    void overdraftPrevented() {
        Solution account = new Solution();
        account.deposit(100.0);
        account.withdraw(200.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
