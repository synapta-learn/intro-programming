import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiCategoryHiddenTest {

    @Test
    void boundaryNormal() {
        assertEquals("Normal", BmiCategory.bmiCategory(18.5));
    }

    @Test
    void boundaryOverweight() {
        assertEquals("Overweight", BmiCategory.bmiCategory(25.0));
    }

    @Test
    void boundaryObese() {
        assertEquals("Obese", BmiCategory.bmiCategory(30.0));
    }

    @Test
    void justBelowNormal() {
        assertEquals("Underweight", BmiCategory.bmiCategory(18.4));
    }

    @Test
    void upperNormal() {
        assertEquals("Normal", BmiCategory.bmiCategory(24.9));
    }
}
