import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinOfTwoTest {

    @Test
    void minIntFirstSmaller() {
        assertEquals(3, MinOfTwo.min(3, 7));
    }

    @Test
    void minIntSecondSmaller() {
        assertEquals(2, MinOfTwo.min(10, 2));
    }

    @Test
    void minIntEqual() {
        assertEquals(5, MinOfTwo.min(5, 5));
    }

    @Test
    void minDoubleSecondSmaller() {
        assertEquals(2.71, MinOfTwo.min(3.14, 2.71), 0.001);
    }

    @Test
    void minStringShorter() {
        assertEquals("hi", MinOfTwo.min("hi", "hello"));
    }

    @Test
    void minStringSameLength() {
        assertEquals("cat", MinOfTwo.min("cat", "dog"));
    }
}
