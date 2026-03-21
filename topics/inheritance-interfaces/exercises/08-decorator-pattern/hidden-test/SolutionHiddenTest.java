import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void doubleMilk() {
        Coffee c = new Coffee("Latte", 3.00);
        c = new MilkDecorator(c);
        c = new MilkDecorator(c);
        assertEquals("Latte + Milk + Milk", c.getDescription());
        assertEquals(4.00, c.getPrice(), 0.001);
    }

    @Test
    void doubleSugar() {
        Coffee c = new Coffee("Americano", 1.50);
        c = new SugarDecorator(c);
        c = new SugarDecorator(c);
        assertEquals("Americano + Sugar + Sugar", c.getDescription());
        assertEquals(2.00, c.getPrice(), 0.001);
    }

    @Test
    void decoratorsAreCoffee() {
        Coffee base = new Coffee("Drip", 1.00);
        Coffee decorated = new MilkDecorator(new SugarDecorator(base));
        assertTrue(decorated instanceof Coffee);
    }
}
