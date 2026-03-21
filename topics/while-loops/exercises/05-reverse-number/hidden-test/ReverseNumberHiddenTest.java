import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberHiddenTest {

    @Test
    void palindrome() {
        assertEquals(12321, ReverseNumber.reverseNumber(12321));
    }

    @Test
    void oneZeroInMiddle() {
        assertEquals(201, ReverseNumber.reverseNumber(102));
    }

    @Test
    void ten() {
        assertEquals(1, ReverseNumber.reverseNumber(10));
    }

    @Test
    void allSameDigits() {
        assertEquals(111, ReverseNumber.reverseNumber(111));
    }
}
