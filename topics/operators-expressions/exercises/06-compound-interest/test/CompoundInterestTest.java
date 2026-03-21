import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestTest {

    @Test
    public void testBasicCompounding() {
        double result = CompoundInterest.compoundInterest(1000.0, 0.05, 12, 10);
        assertEquals(1647.01, result, 0.01);
    }

    @Test
    public void testHigherRate() {
        double result = CompoundInterest.compoundInterest(5000.0, 0.08, 4, 5);
        assertEquals(7429.74, result, 0.01);
    }

    @Test
    public void testSimpleCase() {
        double result = CompoundInterest.compoundInterest(1000.0, 0.10, 1, 1);
        assertEquals(1100.00, result, 0.01);
    }
}
