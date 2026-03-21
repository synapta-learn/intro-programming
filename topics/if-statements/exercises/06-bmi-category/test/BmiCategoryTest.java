import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiCategoryTest {

    @Test
    void underweight() {
        assertEquals("Underweight", BmiCategory.bmiCategory(16.0));
    }

    @Test
    void normal() {
        assertEquals("Normal", BmiCategory.bmiCategory(22.5));
    }

    @Test
    void overweight() {
        assertEquals("Overweight", BmiCategory.bmiCategory(27.3));
    }

    @Test
    void obese() {
        assertEquals("Obese", BmiCategory.bmiCategory(35.0));
    }
}
