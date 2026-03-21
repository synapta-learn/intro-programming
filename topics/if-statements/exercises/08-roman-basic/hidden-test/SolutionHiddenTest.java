import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void zero() {
        assertEquals("Invalid", Solution.toRoman(0));
    }

    @Test
    void negative() {
        assertEquals("Invalid", Solution.toRoman(-1));
    }

    @Test
    void eleven() {
        assertEquals("Invalid", Solution.toRoman(11));
    }

    @Test
    void eight() {
        assertEquals("VIII", Solution.toRoman(8));
    }

    @Test
    void allValues() {
        String[] expected = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals(expected[i - 1], Solution.toRoman(i));
        }
    }
}
