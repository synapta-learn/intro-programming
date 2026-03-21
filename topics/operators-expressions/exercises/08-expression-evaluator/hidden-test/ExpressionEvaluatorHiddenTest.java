import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorHiddenTest {

    @Test
    public void testExpression1NotParenthesized() {
        // If they did (2 + 3) * 4 - 1, they'd get 19
        // If they did 2 + 3 * (4 - 1), they'd get 11
        int result = ExpressionEvaluator.expression1();
        assertNotEquals(19, result,
            "Did you add 2+3 first? Multiplication has higher precedence");
        assertNotEquals(11, result,
            "Did you subtract 4-1 first? Standard left-to-right for +/-");
        assertEquals(13, result);
    }

    @Test
    public void testExpression2WithParentheses() {
        // Without parentheses: 2 + 3 * 4 - 1 = 13
        // With parentheses: (2+3) * (4-1) = 15
        int result = ExpressionEvaluator.expression2();
        assertNotEquals(13, result,
            "Don't forget the parentheses change the order");
        assertEquals(15, result);
    }

    @Test
    public void testExpression3IntegerDivisionTrap() {
        double result = ExpressionEvaluator.expression3();
        // Common mistake: thinking 7/2 is 3.5, giving 6.5
        assertNotEquals(6.5, result, 0.001,
            "7/2 is integer division and gives 3, not 3.5");
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testExpression4ModuloAndDivision() {
        int result = ExpressionEvaluator.expression4();
        // 17 % 5 = 2, 10 / 3 = 3, total = 5
        assertEquals(5, result);
    }

    @Test
    public void testExpression5CastBeforeDivide() {
        double result = ExpressionEvaluator.expression5();
        // (double)(13) / 4 = 13.0 / 4 = 3.25
        assertNotEquals(3.0, result, 0.001,
            "The cast converts 13 to 13.0 before dividing by 4");
        assertEquals(3.25, result, 0.001);
    }

    @Test
    public void testExpression1Exact() {
        assertEquals(13, ExpressionEvaluator.expression1(),
            "2 + 3*4 - 1 = 2 + 12 - 1 = 13");
    }

    @Test
    public void testExpression3Exact() {
        assertEquals(6.0, ExpressionEvaluator.expression3(), 0.0001,
            "7/2 + 3.0 = 3 + 3.0 = 6.0");
    }

    @Test
    public void testExpression4Exact() {
        assertEquals(5, ExpressionEvaluator.expression4(),
            "17%5 + 10/3 = 2 + 3 = 5");
    }
}
