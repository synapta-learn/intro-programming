import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumEvenHiddenTest {

    @Test
    void sumEvenUpToZero() {
        assertEquals(0, SumEven.sumEven(0));
    }

    @Test
    void sumEvenNegativeInput() {
        assertEquals(0, SumEven.sumEven(-5));
    }

    @Test
    void sumEvenUpToTwenty() {
        assertEquals(110, SumEven.sumEven(20));
    }

    @Test
    void sumEvenUpToHundred() {
        assertEquals(2550, SumEven.sumEven(100));
    }

    @Test
    void sumEvenUpToThree() {
        assertEquals(2, SumEven.sumEven(3));
    }

    @Test
    void sumEvenUpToFour() {
        assertEquals(6, SumEven.sumEven(4));
    }
}
