import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XorWithoutXorHiddenTest {

    @Test
    void doesNotUseXorOperator() throws Exception {
        // Read the source file to verify ^ is not used
        String source = new String(
            java.nio.file.Files.readAllBytes(
                java.nio.file.Path.of("XorWithoutXor.java")));
        assertFalse(source.contains("^"),
            "You should not use the ^ operator — implement XOR with &&, ||, and ! only");
    }

    @Test
    void symmetry() {
        // XOR should be symmetric: xor(a,b) == xor(b,a)
        assertEquals(XorWithoutXor.xor(true, false), XorWithoutXor.xor(false, true));
        assertEquals(XorWithoutXor.xor(true, true), XorWithoutXor.xor(true, true));
    }
}
