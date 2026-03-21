import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void tableOfThree() {
        String expected = "3 x 1 = 3\n3 x 2 = 6\n3 x 3 = 9\n3 x 4 = 12\n" +
                "3 x 5 = 15\n3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n" +
                "3 x 9 = 27\n3 x 10 = 30\n";
        assertEquals(expected, Solution.multiplicationTable(3));
    }

    @Test
    void tableOfOne() {
        String expected = "1 x 1 = 1\n1 x 2 = 2\n1 x 3 = 3\n1 x 4 = 4\n" +
                "1 x 5 = 5\n1 x 6 = 6\n1 x 7 = 7\n1 x 8 = 8\n" +
                "1 x 9 = 9\n1 x 10 = 10\n";
        assertEquals(expected, Solution.multiplicationTable(1));
    }

    @Test
    void tableOfFive() {
        String expected = "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n" +
                "5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n" +
                "5 x 9 = 45\n5 x 10 = 50\n";
        assertEquals(expected, Solution.multiplicationTable(5));
    }

    @Test
    void tableHasTenLines() {
        String result = Solution.multiplicationTable(7);
        String[] lines = result.split("\n");
        assertEquals(10, lines.length);
    }
}
