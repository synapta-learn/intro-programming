import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeHiddenTest {

    @Test
    void evenLengthPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("abba"));
    }

    @Test
    void mixedCasePalindrome() {
        assertTrue(IsPalindrome.isPalindrome("MaDaM"));
    }

    @Test
    void notPalindromeShort() {
        assertFalse(IsPalindrome.isPalindrome("ab"));
    }

    @Test
    void twoCharPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("aa"));
    }

    @Test
    void longerPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("wasitacaroracatisaw"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", IsPalindrome.reverseString(""));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("x", IsPalindrome.reverseString("x"));
    }

    @Test
    void reverseMultipleChars() {
        assertEquals("dcba", IsPalindrome.reverseString("abcd"));
    }

    @Test
    void usesReverseString() {
        // Verify that reverseString is implemented and works
        String original = "test";
        String reversed = IsPalindrome.reverseString(original);
        assertEquals("tset", reversed);
    }
}
