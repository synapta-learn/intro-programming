import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void evenLengthPalindrome() {
        assertTrue(Solution.isPalindrome("abba"));
    }

    @Test
    void mixedCasePalindrome() {
        assertTrue(Solution.isPalindrome("MaDaM"));
    }

    @Test
    void notPalindromeShort() {
        assertFalse(Solution.isPalindrome("ab"));
    }

    @Test
    void twoCharPalindrome() {
        assertTrue(Solution.isPalindrome("aa"));
    }

    @Test
    void longerPalindrome() {
        assertTrue(Solution.isPalindrome("wasitacaroracatisaw"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", Solution.reverseString(""));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("x", Solution.reverseString("x"));
    }

    @Test
    void reverseMultipleChars() {
        assertEquals("dcba", Solution.reverseString("abcd"));
    }

    @Test
    void usesReverseString() {
        // Verify that reverseString is implemented and works
        String original = "test";
        String reversed = Solution.reverseString(original);
        assertEquals("tset", reversed);
    }
}
