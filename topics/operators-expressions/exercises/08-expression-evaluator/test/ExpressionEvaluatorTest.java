import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorTest {

    @Test
    public void testExpression1() {
        // 2 + 3 * 4 - 1 = 2 + 12 - 1 = 13
        assertEquals(13, ExpressionEvaluator.expression1());
    }

    @Test
    public void testExpression2() {
        // (2 + 3) * (4 - 1) = 5 * 3 = 15
        assertEquals(15, ExpressionEvaluator.expression2());
    }

    @Test
    public void testExpression3() {
        // 7 / 2 + 3.0 = 3 + 3.0 = 6.0
        assertEquals(6.0, ExpressionEvaluator.expression3(), 0.001);
    }

    @Test
    public void testExpression4() {
        // 17 % 5 + 10 / 3 = 2 + 3 = 5
        assertEquals(5, ExpressionEvaluator.expression4());
    }

    @Test
    public void testExpression5() {
        // (double)(10 + 3) / 4 = 13.0 / 4 = 3.25
        assertEquals(3.25, ExpressionEvaluator.expression5(), 0.001);
    }
}
