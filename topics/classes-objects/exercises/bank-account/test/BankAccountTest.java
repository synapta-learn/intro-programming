import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void startsWithZeroBalance() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void depositIncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawDecreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(1000.0);
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test
    void overdraftPrevented() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(200.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
