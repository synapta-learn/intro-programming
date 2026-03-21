# Animal Sounds

## Problem

Create an abstract `Animal` class and three concrete subclasses that each make a different sound.

### Animal (abstract)
- Constructor: `Animal(String name)`
- `getName()` — returns the animal's name
- Abstract method `speak()` — returns a String representing the sound

### Dog
- Constructor: `Dog(String name)`
- `speak()` returns `"Woof!"`

### Cat
- Constructor: `Cat(String name)`
- `speak()` returns `"Meow!"`

### Duck
- Constructor: `Duck(String name)`
- `speak()` returns `"Quack!"`

## Examples

```java
Dog d = new Dog("Rex");
d.getName();   // "Rex"
d.speak();     // "Woof!"

Cat c = new Cat("Whiskers");
c.speak();     // "Meow!"

Animal a = new Duck("Donald");
a.speak();     // "Quack!"
```

## Hints

- Each subclass constructor should call `super(name)` to pass the name to the Animal constructor
- Use `@Override` on every `speak()` implementation
