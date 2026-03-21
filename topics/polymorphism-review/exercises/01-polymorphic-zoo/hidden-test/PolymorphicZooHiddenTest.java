import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolymorphicZooHiddenTest {

    @Test
    void emptyZoo() {
        Animal[] zoo = {};
        assertEquals(0, PolymorphicZoo.rollCall(zoo).length);
        assertEquals(0, PolymorphicZoo.countByType(zoo, "Dog"));
    }

    @Test
    void polymorphicAccess() {
        Animal a = new Dog("Spot");
        assertEquals("Woof!", a.speak());
        assertEquals("Dog", a.type());
        assertEquals("Spot", a.getName());
    }

    @Test
    void mixedZooRollCall() {
        Animal[] zoo = {new Parrot("P"), new Dog("D"), new Cat("C"), new Parrot("Q")};
        String[] roll = PolymorphicZoo.rollCall(zoo);
        assertEquals(4, roll.length);
        assertEquals("P the Parrot says Squawk!", roll[0]);
        assertEquals("D the Dog says Woof!", roll[1]);
        assertEquals("C the Cat says Meow!", roll[2]);
        assertEquals("Q the Parrot says Squawk!", roll[3]);
    }
}
