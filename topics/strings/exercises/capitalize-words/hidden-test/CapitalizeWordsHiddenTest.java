import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeWordsHiddenTest {

    @Test
    void mixedCase() {
        assertEquals("Java Programming", CapitalizeWords.capitalizeWords("jAvA pRoGrAmMiNg"));
    }

    @Test
    void singleWord() {
        assertEquals("Hello", CapitalizeWords.capitalizeWords("hello"));
    }

    @Test
    void threeWords() {
        assertEquals("One Two Three", CapitalizeWords.capitalizeWords("one two three"));
    }
}
