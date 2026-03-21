import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionHiddenTest {

    @Test
    void polymorphicSpeak() {
        Animal[] animals = {new Dog("D"), new Cat("C"), new Duck("U")};
        assertEquals("Woof!", animals[0].speak());
        assertEquals("Meow!", animals[1].speak());
        assertEquals("Quack!", animals[2].speak());
    }

    @Test
    void namePreservedThroughSuperclass() {
        Animal duck = new Duck("Daffy");
        assertEquals("Daffy", duck.getName());
        assertEquals("Quack!", duck.speak());
    }

    @Test
    void dogIsAnimal() {
        Dog d = new Dog("Spot");
        assertTrue(d instanceof Animal);
    }
}
