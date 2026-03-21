import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsHiddenTest {

    @Test
    void mixedCaseVowels() {
        assertEquals(3, CountVowels.countVowels("PrOgRaMmInG"));
    }

    @Test
    void allVowelsLowercase() {
        assertEquals(5, CountVowels.countVowels("aeiou"));
    }

    @Test
    void singleVowel() {
        assertEquals(1, CountVowels.countVowels("a"));
    }

    @Test
    void singleConsonant() {
        assertEquals(0, CountVowels.countVowels("z"));
    }
}
