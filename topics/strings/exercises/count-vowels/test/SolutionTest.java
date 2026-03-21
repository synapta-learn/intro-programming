import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void helloHasTwoVowels() {
        assertEquals(2, Solution.countVowels("hello"));
    }

    @Test
    void allVowelsUppercase() {
        assertEquals(5, Solution.countVowels("AEIOU"));
    }

    @Test
    void noVowels() {
        assertEquals(0, Solution.countVowels("bcdfg"));
    }

    @Test
    void emptyString() {
        assertEquals(0, Solution.countVowels(""));
    }
}
