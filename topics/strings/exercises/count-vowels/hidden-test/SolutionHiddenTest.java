import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void mixedCaseVowels() {
        assertEquals(3, Solution.countVowels("PrOgRaMmInG"));
    }

    @Test
    void allVowelsLowercase() {
        assertEquals(5, Solution.countVowels("aeiou"));
    }

    @Test
    void singleVowel() {
        assertEquals(1, Solution.countVowels("a"));
    }

    @Test
    void singleConsonant() {
        assertEquals(0, Solution.countVowels("z"));
    }
}
