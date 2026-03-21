import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureMessageTest {

    @Test
    public void testPositiveTemperature() {
        String result = TemperatureMessage.formatTemperature(23.5);
        assertEquals("The temperature is 23.5 degrees Celsius.", result);
    }

    @Test
    public void testZeroTemperature() {
        String result = TemperatureMessage.formatTemperature(0.0);
        assertEquals("The temperature is 0.0 degrees Celsius.", result);
    }

    @Test
    public void testNegativeTemperature() {
        String result = TemperatureMessage.formatTemperature(-15.0);
        assertEquals("The temperature is -15.0 degrees Celsius.", result);
    }
}
