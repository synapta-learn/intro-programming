import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanBasicTest {

    @Test
    void one() {
        assertEquals("I", RomanBasic.toRoman(1));
    }

    @Test
    void four() {
        assertEquals("IV", RomanBasic.toRoman(4));
    }

    @Test
    void five() {
        assertEquals("V", RomanBasic.toRoman(5));
    }

    @Test
    void nine() {
        assertEquals("IX", RomanBasic.toRoman(9));
    }

    @Test
    void ten() {
        assertEquals("X", RomanBasic.toRoman(10));
    }
}
