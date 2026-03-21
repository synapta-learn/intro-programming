import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {

    @Test
    void helloHasTwoVowels() {
        assertEquals(2, CountVowels.countVowels("hello"));
    }

    @Test
    void allVowelsUppercase() {
        assertEquals(5, CountVowels.countVowels("AEIOU"));
    }

    @Test
    void noVowels() {
        assertEquals(0, CountVowels.countVowels("bcdfg"));
    }

    @Test
    void emptyString() {
        assertEquals(0, CountVowels.countVowels(""));
    }
}
