import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountDivisorsHiddenTest {

    @Test
    void divisorsOfTwo() {
        assertEquals(2, CountDivisors.countDivisors(2));
    }

    @Test
    void divisorsOfSix() {
        assertEquals(4, CountDivisors.countDivisors(6));
    }

    @Test
    void divisorsOfTwentyFour() {
        assertEquals(8, CountDivisors.countDivisors(24));
    }

    @Test
    void divisorsOfPerfectSquare() {
        // 36: 1,2,3,4,6,9,12,18,36
        assertEquals(9, CountDivisors.countDivisors(36));
    }

    @Test
    void divisorsOfPrime() {
        assertEquals(2, CountDivisors.countDivisors(29));
    }

    @Test
    void divisorsOfHundred() {
        // 100: 1,2,4,5,10,20,25,50,100
        assertEquals(9, CountDivisors.countDivisors(100));
    }
}
