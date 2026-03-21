import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void rollCallOutput() {
        Animal[] zoo = {new Dog("Rex"), new Cat("Luna")};
        String[] roll = Solution.rollCall(zoo);
        assertEquals("Rex the Dog says Woof!", roll[0]);
        assertEquals("Luna the Cat says Meow!", roll[1]);
    }

    @Test
    void rollCallWithParrot() {
        Animal[] zoo = {new Parrot("Polly")};
        String[] roll = Solution.rollCall(zoo);
        assertEquals("Polly the Parrot says Squawk!", roll[0]);
    }

    @Test
    void countByTypeFinds() {
        Animal[] zoo = {new Dog("A"), new Cat("B"), new Dog("C"), new Dog("D")};
        assertEquals(3, Solution.countByType(zoo, "Dog"));
        assertEquals(1, Solution.countByType(zoo, "Cat"));
    }

    @Test
    void countByTypeNotFound() {
        Animal[] zoo = {new Dog("A"), new Cat("B")};
        assertEquals(0, Solution.countByType(zoo, "Parrot"));
    }
}
