# Polymorphic Zoo

## Problem

Build a simple zoo system that demonstrates dynamic dispatch — calling the same method on different object types and getting different behavior.

### Animal (abstract)
- Constructor: `Animal(String name)`
- `getName()` — returns the name
- Abstract method `speak()` — returns the animal's sound as a String
- Abstract method `type()` — returns the animal type (e.g., "Dog", "Cat", "Parrot")

### Dog, Cat, Parrot (subclasses)
- Each takes a `String name` in the constructor
- `speak()` returns: Dog = `"Woof!"`, Cat = `"Meow!"`, Parrot = `"Squawk!"`
- `type()` returns: `"Dog"`, `"Cat"`, `"Parrot"` respectively

### Zoo (static methods in Solution class)
- **`Solution.rollCall(Animal[] animals)`** — returns a String[] where each entry is `"[name] the [type] says [speak]"`
- **`Solution.countByType(Animal[] animals, String type)`** — returns how many animals have the given type

## Examples

```java
Animal[] zoo = {
    new Dog("Rex"), new Cat("Whiskers"), new Parrot("Polly"), new Dog("Buddy")
};

String[] roll = Solution.rollCall(zoo);
// ["Rex the Dog says Woof!", "Whiskers the Cat says Meow!",
//  "Polly the Parrot says Squawk!", "Buddy the Dog says Woof!"]

Solution.countByType(zoo, "Dog");     // 2
Solution.countByType(zoo, "Cat");     // 1
Solution.countByType(zoo, "Fish");    // 0
```

## Hints

- `rollCall` creates a new String array of the same length as the input
- Use polymorphism — call `animals[i].speak()` and `animals[i].type()` in the loop
- `countByType` loops through and checks `animals[i].type().equals(type)`
