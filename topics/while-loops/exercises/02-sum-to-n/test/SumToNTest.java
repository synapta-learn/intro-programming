import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumToNTest {

    @Test
    void sumToFive() {
        assertEquals(15, SumToN.sumToN(5));
    }

    @Test
    void sumToOne() {
        assertEquals(1, SumToN.sumToN(1));
    }

    @Test
    void sumToTen() {
        assertEquals(55, SumToN.sumToN(10));
    }

    @Test
    void sumToZero() {
        assertEquals(0, SumToN.sumToN(0));
    }
}
