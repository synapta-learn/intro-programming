import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void negativeIncome() {
        assertEquals(0.0, Solution.calculateTax(-5000), 0.01);
    }

    @Test
    void exactlySecondBracketEnd() {
        // 1000 + (30000 * 0.20) = 1000 + 6000 = 7000
        assertEquals(7000.0, Solution.calculateTax(40000), 0.01);
    }

    @Test
    void justOverSecondBracket() {
        // 1000 + 6000 + (1 * 0.30) = 7000.30
        assertEquals(7000.30, Solution.calculateTax(40001), 0.01);
    }

    @Test
    void largeIncome() {
        // 1000 + 6000 + (60000 * 0.30) = 1000 + 6000 + 18000 = 25000
        assertEquals(25000.0, Solution.calculateTax(100000), 0.01);
    }
}
