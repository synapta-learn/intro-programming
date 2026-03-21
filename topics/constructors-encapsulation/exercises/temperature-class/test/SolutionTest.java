import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void getCelsius() {
        Solution t = new Solution(100.0);
        assertEquals(100.0, t.getCelsius(), 0.001);
    }

    @Test
    void boilingPointFahrenheit() {
        Solution t = new Solution(100.0);
        assertEquals(212.0, t.getFahrenheit(), 0.001);
    }

    @Test
    void freezingPointFahrenheit() {
        Solution t = new Solution(0.0);
        assertEquals(32.0, t.getFahrenheit(), 0.001);
    }

    @Test
    void kelvinConversion() {
        Solution t = new Solution(0.0);
        assertEquals(273.15, t.getKelvin(), 0.001);
    }

    @Test
    void belowAbsoluteZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Solution(-300.0);
        });
    }
}
