import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureHiddenTest {

    @Test
    void absoluteZeroIsValid() {
        Temperature t = new Temperature(-273.15);
        assertEquals(-273.15, t.getCelsius(), 0.001);
        assertEquals(0.0, t.getKelvin(), 0.001);
    }

    @Test
    void negativeTemperatureAboveAbsoluteZero() {
        Temperature t = new Temperature(-40.0);
        assertEquals(-40.0, t.getFahrenheit(), 0.001);  // -40 C == -40 F
    }

    @Test
    void justBelowAbsoluteZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-273.16);
        });
    }
}
