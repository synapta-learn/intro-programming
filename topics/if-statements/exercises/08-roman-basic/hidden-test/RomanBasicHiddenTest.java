import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanBasicHiddenTest {

    @Test
    void zero() {
        assertEquals("Invalid", RomanBasic.toRoman(0));
    }

    @Test
    void negative() {
        assertEquals("Invalid", RomanBasic.toRoman(-1));
    }

    @Test
    void eleven() {
        assertEquals("Invalid", RomanBasic.toRoman(11));
    }

    @Test
    void eight() {
        assertEquals("VIII", RomanBasic.toRoman(8));
    }

    @Test
    void allValues() {
        String[] expected = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i <= 10; i++) {
            assertEquals(expected[i - 1], RomanBasic.toRoman(i));
        }
    }
}
