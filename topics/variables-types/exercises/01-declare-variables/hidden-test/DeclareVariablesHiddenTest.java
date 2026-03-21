import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeclareVariablesHiddenTest {

    @Test
    public void testGetAgeExact() {
        int result = DeclareVariables.getAge();
        assertEquals(25, result, "getAge() should return exactly 25");
    }

    @Test
    public void testGetPriceExact() {
        double result = DeclareVariables.getPrice();
        assertEquals(9.99, result, 0.0001, "getPrice() should return exactly 9.99");
    }

    @Test
    public void testIsStudentTrue() {
        boolean result = DeclareVariables.isStudent();
        assertTrue(result, "isStudent() should return true");
    }

    @Test
    public void testGetInitialExact() {
        char result = DeclareVariables.getInitial();
        assertEquals('J', result, "getInitial() should return 'J' (uppercase)");
        assertNotEquals('j', result, "getInitial() should return uppercase 'J', not lowercase 'j'");
    }

    @Test
    public void testGetNameExact() {
        String result = DeclareVariables.getName();
        assertEquals("Java", result, "getName() should return \"Java\"");
        assertNotEquals("java", result, "getName() should return \"Java\" with capital J");
    }

    @Test
    public void testGetNameNotNull() {
        String result = DeclareVariables.getName();
        assertNotNull(result, "getName() should not return null");
    }

    @Test
    public void testGetNameNotEmpty() {
        String result = DeclareVariables.getName();
        assertFalse(result.isEmpty(), "getName() should not return an empty string");
    }
}
