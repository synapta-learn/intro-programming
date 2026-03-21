import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodChainingTest {

    @Test
    void setAndGet() {
        assertEquals(5, new MethodChaining().set(5).getResult());
    }

    @Test
    void addChain() {
        assertEquals(8, new MethodChaining().set(5).add(3).getResult());
    }

    @Test
    void subChain() {
        assertEquals(18, new MethodChaining().set(10).sub(4).mul(3).getResult());
    }

    @Test
    void defaultIsZero() {
        assertEquals(0, new MethodChaining().getResult());
    }

    @Test
    void addWithoutSet() {
        assertEquals(10, new MethodChaining().add(5).add(5).getResult());
    }
}
