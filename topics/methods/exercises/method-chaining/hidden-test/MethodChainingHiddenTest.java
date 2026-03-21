import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodChainingHiddenTest {

    @Test
    void longChain() {
        int result = new MethodChaining().set(10).add(5).sub(3).mul(2).getResult();
        assertEquals(24, result);
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, new MethodChaining().set(100).mul(0).getResult());
    }

    @Test
    void setOverwritesPrevious() {
        assertEquals(3, new MethodChaining().set(100).set(3).getResult());
    }

    @Test
    void subtractToNegative() {
        assertEquals(-5, new MethodChaining().set(0).sub(5).getResult());
    }

    @Test
    void multipleAdds() {
        assertEquals(15, new MethodChaining().add(1).add(2).add(3).add(4).add(5).getResult());
    }

    @Test
    void multiplyNegative() {
        assertEquals(-10, new MethodChaining().set(5).mul(-2).getResult());
    }

    @Test
    void chainingReturnsThis() {
        MethodChaining calc = new MethodChaining();
        MethodChaining returned = calc.set(5);
        assertSame(calc, returned);
    }

    @Test
    void complexChain() {
        // 0 + 10 = 10, * 3 = 30, - 5 = 25, + 5 = 30, * 2 = 60
        assertEquals(60, new MethodChaining().add(10).mul(3).sub(5).add(5).mul(2).getResult());
    }
}
