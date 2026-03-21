import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {

    @Test
    void racecarIsPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("racecar"));
    }

    @Test
    void caseInsensitive() {
        assertTrue(IsPalindrome.isPalindrome("Racecar"));
    }

    @Test
    void helloIsNotPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("hello"));
    }

    @Test
    void singleCharacter() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    @Test
    void emptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test
    void reverseStringWorks() {
        assertEquals("olleh", IsPalindrome.reverseString("hello"));
    }
}
