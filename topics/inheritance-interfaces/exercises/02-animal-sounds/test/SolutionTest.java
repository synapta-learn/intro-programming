import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void dogSpeaks() {
        Dog d = new Dog("Rex");
        assertEquals("Woof!", d.speak());
    }

    @Test
    void catSpeaks() {
        Cat c = new Cat("Whiskers");
        assertEquals("Meow!", c.speak());
    }

    @Test
    void duckSpeaks() {
        Duck d = new Duck("Donald");
        assertEquals("Quack!", d.speak());
    }

    @Test
    void animalNames() {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Luna");
        assertEquals("Buddy", dog.getName());
        assertEquals("Luna", cat.getName());
    }
}
