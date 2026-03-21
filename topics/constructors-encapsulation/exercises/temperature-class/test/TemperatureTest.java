import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @Test
    void getCelsius() {
        Temperature t = new Temperature(100.0);
        assertEquals(100.0, t.getCelsius(), 0.001);
    }

    @Test
    void boilingPointFahrenheit() {
        Temperature t = new Temperature(100.0);
        assertEquals(212.0, t.getFahrenheit(), 0.001);
    }

    @Test
    void freezingPointFahrenheit() {
        Temperature t = new Temperature(0.0);
        assertEquals(32.0, t.getFahrenheit(), 0.001);
    }

    @Test
    void kelvinConversion() {
        Temperature t = new Temperature(0.0);
        assertEquals(273.15, t.getKelvin(), 0.001);
    }

    @Test
    void belowAbsoluteZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-300.0);
        });
    }
}
