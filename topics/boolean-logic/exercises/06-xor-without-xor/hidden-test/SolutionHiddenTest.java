import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void doesNotUseXorOperator() throws Exception {
        // Read the source file to verify ^ is not used
        String source = new String(
            java.nio.file.Files.readAllBytes(
                java.nio.file.Path.of("Solution.java")));
        assertFalse(source.contains("^"),
            "You should not use the ^ operator — implement XOR with &&, ||, and ! only");
    }

    @Test
    void symmetry() {
        // XOR should be symmetric: xor(a,b) == xor(b,a)
        assertEquals(Solution.xor(true, false), Solution.xor(false, true));
        assertEquals(Solution.xor(true, true), Solution.xor(true, true));
    }
}
