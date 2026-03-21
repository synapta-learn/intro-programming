import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void applyAddCommand() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(10));
        assertEquals(10.0, calc.getValue(), 0.001);
    }

    @Test
    void applyMultipleCommands() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(10));
        calc.apply(new MultiplyCommand(3));
        calc.apply(new AddCommand(-5));
        assertEquals(25.0, calc.getValue(), 0.001);
    }

    @Test
    void undoReverses() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(10));
        calc.apply(new MultiplyCommand(5));
        assertEquals(50.0, calc.getValue(), 0.001);
        calc.undo();
        assertEquals(10.0, calc.getValue(), 0.001);
        calc.undo();
        assertEquals(0.0, calc.getValue(), 0.001);
    }

    @Test
    void historyTracking() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(5));
        calc.apply(new MultiplyCommand(2));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("+ 5.0", "* 2.0"));
        assertEquals(expected, calc.getHistory());
    }

    @Test
    void historyAfterUndo() {
        Calculator calc = new Calculator();
        calc.apply(new AddCommand(1));
        calc.apply(new AddCommand(2));
        calc.undo();
        assertEquals(1, calc.getHistory().size());
        assertEquals("+ 1.0", calc.getHistory().get(0));
    }
}
