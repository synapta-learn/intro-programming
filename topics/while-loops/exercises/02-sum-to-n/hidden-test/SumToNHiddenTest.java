import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumToNHiddenTest {

    @Test
    void negativeInput() {
        assertEquals(0, SumToN.sumToN(-5));
    }

    @Test
    void sumToHundred() {
        assertEquals(5050, SumToN.sumToN(100));
    }

    @Test
    void sumToTwo() {
        assertEquals(3, SumToN.sumToN(2));
    }
}
