import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ListStatisticsTest {

    private ArrayList<Integer> listOf(Integer... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void basicStatistics() {
        double[] result = ListStatistics.statistics(listOf(10, 20, 30));
        assertEquals(10.0, result[0]);
        assertEquals(30.0, result[1]);
        assertEquals(60.0, result[2]);
        assertEquals(20.0, result[3], 0.001);
    }

    @Test
    void singleElement() {
        double[] result = ListStatistics.statistics(listOf(5));
        assertEquals(5.0, result[0]);
        assertEquals(5.0, result[1]);
        assertEquals(5.0, result[2]);
        assertEquals(5.0, result[3]);
    }

    @Test
    void withNegatives() {
        double[] result = ListStatistics.statistics(listOf(-3, 7, -1, 4));
        assertEquals(-3.0, result[0]);
        assertEquals(7.0, result[1]);
        assertEquals(7.0, result[2]);
        assertEquals(1.75, result[3], 0.001);
    }

    @Test
    void emptyListReturnsZeros() {
        double[] result = ListStatistics.statistics(new ArrayList<>());
        assertArrayEquals(new double[]{0, 0, 0, 0}, result);
    }
}
