import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConvertTest {

    @Test
    public void testFreezingPoint() {
        assertEquals(0.0, TemperatureConvert.fahrenheitToCelsius(32.0), 0.01);
    }

    @Test
    public void testBoilingPoint() {
        assertEquals(100.0, TemperatureConvert.fahrenheitToCelsius(212.0), 0.01);
    }

    @Test
    public void testBodyTemperature() {
        assertEquals(37.0, TemperatureConvert.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitFreezing() {
        assertEquals(32.0, TemperatureConvert.celsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitBoiling() {
        assertEquals(212.0, TemperatureConvert.celsiusToFahrenheit(100.0), 0.01);
    }
}
