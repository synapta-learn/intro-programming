import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void racecarIsPalindrome() {
        assertTrue(Solution.isPalindrome("racecar"));
    }

    @Test
    void caseInsensitive() {
        assertTrue(Solution.isPalindrome("Racecar"));
    }

    @Test
    void helloIsNotPalindrome() {
        assertFalse(Solution.isPalindrome("hello"));
    }

    @Test
    void singleCharacter() {
        assertTrue(Solution.isPalindrome("a"));
    }

    @Test
    void emptyString() {
        assertTrue(Solution.isPalindrome(""));
    }

    @Test
    void reverseStringWorks() {
        assertEquals("olleh", Solution.reverseString("hello"));
    }
}
