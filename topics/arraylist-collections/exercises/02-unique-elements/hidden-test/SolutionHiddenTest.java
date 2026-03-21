import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    private ArrayList<String> listOf(String... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void allSameElement() {
        ArrayList<String> result = Solution.uniqueElements(listOf("x", "x", "x", "x"));
        assertEquals(listOf("x"), result);
    }

    @Test
    void singleElement() {
        ArrayList<String> result = Solution.uniqueElements(listOf("solo"));
        assertEquals(listOf("solo"), result);
    }

    @Test
    void doesNotModifyOriginal() {
        ArrayList<String> original = listOf("a", "b", "a");
        Solution.uniqueElements(original);
        assertEquals(3, original.size());
        assertEquals("a", original.get(2));
    }
}
