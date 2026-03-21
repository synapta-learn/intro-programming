import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWithHistoryHiddenTest {

    @Test
    void undoOnEmptyDoesNothing() {
        Calculator calc = new Calculator();
        calc.undo();
        assertEquals(0.0, calc.getValue(), 0.001);
        assertTrue(calc.getHistory().isEmpty());
    }

    @Test
    void addNegativeValues() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(-10));
        assertEquals(-10.0, calc.getValue(), 0.001);
        assertEquals("+ -10.0", calc.getHistory().get(0));
    }

    @Test
    void multiplyAndUndoPreservesValue() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(6));
        calc.apply(new MultiplyCommand(7));
        assertEquals(42.0, calc.getValue(), 0.001);
        calc.undo();
        assertEquals(6.0, calc.getValue(), 0.001);
    }

    @Test
    void applyAfterUndo() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(100));
        calc.undo();
        calc.apply(new MultiplyCommand(5));
        // 0 * 5 = 0
        assertEquals(0.0, calc.getValue(), 0.001);
        assertEquals(1, calc.getHistory().size());
    }
}
