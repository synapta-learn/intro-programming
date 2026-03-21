import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorPatternTest {

    @Test
    void baseCoffee() {
        Coffee c = new Coffee("Espresso", 2.00);
        assertEquals("Espresso", c.getDescription());
        assertEquals(2.00, c.getPrice(), 0.001);
    }

    @Test
    void milkDecorator() {
        Coffee c = new MilkDecorator(new Coffee("Espresso", 2.00));
        assertEquals("Espresso + Milk", c.getDescription());
        assertEquals(2.50, c.getPrice(), 0.001);
    }

    @Test
    void sugarDecorator() {
        Coffee c = new SugarDecorator(new Coffee("Espresso", 2.00));
        assertEquals("Espresso + Sugar", c.getDescription());
        assertEquals(2.25, c.getPrice(), 0.001);
    }

    @Test
    void stackedDecorators() {
        Coffee c = new Coffee("Espresso", 2.00);
        c = new MilkDecorator(c);
        c = new SugarDecorator(c);
        assertEquals("Espresso + Milk + Sugar", c.getDescription());
        assertEquals(2.75, c.getPrice(), 0.001);
    }
}
