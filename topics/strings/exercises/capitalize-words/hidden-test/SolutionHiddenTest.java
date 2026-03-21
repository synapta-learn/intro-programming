import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void mixedCase() {
        assertEquals("Java Programming", Solution.capitalizeWords("jAvA pRoGrAmMiNg"));
    }

    @Test
    void singleWord() {
        assertEquals("Hello", Solution.capitalizeWords("hello"));
    }

    @Test
    void threeWords() {
        assertEquals("One Two Three", Solution.capitalizeWords("one two three"));
    }
}
