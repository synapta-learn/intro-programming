import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumEvenTest {

    @Test
    void sumEvenUpToTen() {
        assertEquals(30, SumEven.sumEven(10));
    }

    @Test
    void sumEvenUpToSeven() {
        assertEquals(12, SumEven.sumEven(7));
    }

    @Test
    void sumEvenUpToOne() {
        assertEquals(0, SumEven.sumEven(1));
    }

    @Test
    void sumEvenUpToTwo() {
        assertEquals(2, SumEven.sumEven(2));
    }
}
