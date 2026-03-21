import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void managerIsEmployee() {
        Manager m = new Manager("Test", 60000, 10000);
        assertTrue(m instanceof Employee);
        assertEquals("Test", m.getName());
        assertEquals(60000, m.getSalary(), 0.001);
    }

    @Test
    void internIsEmployee() {
        Intern i = new Intern("Newbie");
        assertTrue(i instanceof Employee);
        assertEquals("Newbie", i.getName());
    }

    @Test
    void managerBonusGetter() {
        Manager m = new Manager("Boss", 100000, 25000);
        assertEquals(25000, m.getBonus(), 0.001);
        assertEquals(125000, m.getTotalCompensation(), 0.001);
    }
}
