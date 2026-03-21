import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolymorphicZooTest {

    @Test
    void rollCallOutput() {
        Animal[] zoo = {new Dog("Rex"), new Cat("Luna")};
        String[] roll = PolymorphicZoo.rollCall(zoo);
        assertEquals("Rex the Dog says Woof!", roll[0]);
        assertEquals("Luna the Cat says Meow!", roll[1]);
    }

    @Test
    void rollCallWithParrot() {
        Animal[] zoo = {new Parrot("Polly")};
        String[] roll = PolymorphicZoo.rollCall(zoo);
        assertEquals("Polly the Parrot says Squawk!", roll[0]);
    }

    @Test
    void countByTypeFinds() {
        Animal[] zoo = {new Dog("A"), new Cat("B"), new Dog("C"), new Dog("D")};
        assertEquals(3, PolymorphicZoo.countByType(zoo, "Dog"));
        assertEquals(1, PolymorphicZoo.countByType(zoo, "Cat"));
    }

    @Test
    void countByTypeNotFound() {
        Animal[] zoo = {new Dog("A"), new Cat("B")};
        assertEquals(0, PolymorphicZoo.countByType(zoo, "Parrot"));
    }
}
