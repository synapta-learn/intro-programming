import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void sumEvenUpToZero() {
        assertEquals(0, Solution.sumEven(0));
    }

    @Test
    void sumEvenNegativeInput() {
        assertEquals(0, Solution.sumEven(-5));
    }

    @Test
    void sumEvenUpToTwenty() {
        assertEquals(110, Solution.sumEven(20));
    }

    @Test
    void sumEvenUpToHundred() {
        assertEquals(2550, Solution.sumEven(100));
    }

    @Test
    void sumEvenUpToThree() {
        assertEquals(2, Solution.sumEven(3));
    }

    @Test
    void sumEvenUpToFour() {
        assertEquals(6, Solution.sumEven(4));
    }
}
