abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String speak();
    public abstract String type();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        // TODO: return "Woof!"
        return "";
    }

    @Override
    public String type() {
        // TODO: return "Dog"
        return "";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        // TODO: return "Meow!"
        return "";
    }

    @Override
    public String type() {
        // TODO: return "Cat"
        return "";
    }
}

class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String speak() {
        // TODO: return "Squawk!"
        return "";
    }

    @Override
    public String type() {
        // TODO: return "Parrot"
        return "";
    }
}

public class PolymorphicZoo {

    /**
     * Returns an array of roll call strings: "[name] the [type] says [speak]"
     */
    public static String[] rollCall(Animal[] animals) {
        // TODO: Build a string for each animal
        return new String[0];
    }

    /**
     * Counts how many animals have the given type.
     */
    public static int countByType(Animal[] animals, String type) {
        // TODO: Count animals whose type() matches
        return 0;
    }
}
