import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void boundaryNormal() {
        assertEquals("Normal", Solution.bmiCategory(18.5));
    }

    @Test
    void boundaryOverweight() {
        assertEquals("Overweight", Solution.bmiCategory(25.0));
    }

    @Test
    void boundaryObese() {
        assertEquals("Obese", Solution.bmiCategory(30.0));
    }

    @Test
    void justBelowNormal() {
        assertEquals("Underweight", Solution.bmiCategory(18.4));
    }

    @Test
    void upperNormal() {
        assertEquals("Normal", Solution.bmiCategory(24.9));
    }
}
