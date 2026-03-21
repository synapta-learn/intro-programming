abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String speak();
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
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String speak() {
        // TODO: return "Quack!"
        return "";
    }
}
