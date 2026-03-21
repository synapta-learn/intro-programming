import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void underweight() {
        assertEquals("Underweight", Solution.bmiCategory(16.0));
    }

    @Test
    void normal() {
        assertEquals("Normal", Solution.bmiCategory(22.5));
    }

    @Test
    void overweight() {
        assertEquals("Overweight", Solution.bmiCategory(27.3));
    }

    @Test
    void obese() {
        assertEquals("Obese", Solution.bmiCategory(35.0));
    }
}
