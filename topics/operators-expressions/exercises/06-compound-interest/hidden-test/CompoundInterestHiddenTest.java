import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestHiddenTest {

    @Test
    public void testZeroRate() {
        double result = CompoundInterest.compoundInterest(1000.0, 0.0, 12, 10);
        assertEquals(1000.0, result, 0.01,
            "With 0% interest, the amount should stay the same");
    }

    @Test
    public void testZeroYears() {
        double result = CompoundInterest.compoundInterest(1000.0, 0.05, 12, 0);
        assertEquals(1000.0, result, 0.01,
            "After 0 years, the amount should be the principal");
    }

    @Test
    public void testAnnualCompounding() {
        // $1000 at 10%, compounded annually for 3 years
        // 1000 * (1.10)^3 = 1331.00
        double result = CompoundInterest.compoundInterest(1000.0, 0.10, 1, 3);
        assertEquals(1331.00, result, 0.01);
    }

    @Test
    public void testMonthlyCompounding() {
        // $1000 at 12%, compounded monthly for 1 year
        // 1000 * (1 + 0.12/12)^12 = 1000 * (1.01)^12 ≈ 1126.83
        double result = CompoundInterest.compoundInterest(1000.0, 0.12, 12, 1);
        assertEquals(1126.83, result, 0.01);
    }

    @Test
    public void testDailyCompounding() {
        // $1000 at 5%, compounded daily for 1 year
        double result = CompoundInterest.compoundInterest(1000.0, 0.05, 365, 1);
        assertEquals(1051.27, result, 0.01);
    }

    @Test
    public void testLargePrincipal() {
        double result = CompoundInterest.compoundInterest(100000.0, 0.03, 12, 20);
        double expected = 100000.0 * Math.pow(1 + 0.03 / 12, 12 * 20);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testResultLargerThanPrincipal() {
        double result = CompoundInterest.compoundInterest(500.0, 0.05, 4, 3);
        assertTrue(result > 500.0,
            "With positive interest rate, the result should be larger than the principal");
    }

    @Test
    public void testQuarterlyCompounding() {
        // $2000 at 6%, compounded quarterly for 5 years
        double expected = 2000.0 * Math.pow(1 + 0.06 / 4, 4 * 5);
        double result = CompoundInterest.compoundInterest(2000.0, 0.06, 4, 5);
        assertEquals(expected, result, 0.01);
    }
}
