import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTypesTest {

    @Test
    void employeeToString() {
        Employee e = new Employee("Alice", 50000);
        assertEquals("Employee: Alice ($50000.00)", e.toString());
    }

    @Test
    void managerTotalCompensation() {
        Manager m = new Manager("Bob", 80000, 15000);
        assertEquals(95000.0, m.getTotalCompensation(), 0.001);
    }

    @Test
    void managerToString() {
        Manager m = new Manager("Bob", 80000, 15000);
        assertEquals("Manager: Bob ($80000.00 + $15000.00 bonus)", m.toString());
    }

    @Test
    void internToString() {
        Intern i = new Intern("Carol");
        assertEquals("Intern: Carol (unpaid)", i.toString());
        assertEquals(0.0, i.getSalary(), 0.001);
    }
}
