import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void one() {
        assertEquals("I", Solution.toRoman(1));
    }

    @Test
    void four() {
        assertEquals("IV", Solution.toRoman(4));
    }

    @Test
    void five() {
        assertEquals("V", Solution.toRoman(5));
    }

    @Test
    void nine() {
        assertEquals("IX", Solution.toRoman(9));
    }

    @Test
    void ten() {
        assertEquals("X", Solution.toRoman(10));
    }
}
