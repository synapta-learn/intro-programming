# Polymorphism and Review — Dynamic Dispatch in Action

## What Is Polymorphism?

The word "polymorphism" means "many forms." In programming, it means that a single variable can hold objects of different types, and the correct method is called automatically based on the actual object — not the variable type.

You have already used polymorphism without knowing it:

```java
Animal a = new Dog("Rex");
a.speak();  // "Woof!" — calls Dog's speak(), not Animal's
```

The variable `a` has type `Animal`, but it holds a `Dog` object. When you call `speak()`, Java looks at the **actual object** (Dog) and calls Dog's version of the method. This is called **dynamic dispatch**.

## Variable Type vs Object Type

Every object has two types to think about:

```java
Animal a = new Dog("Rex");
//  ^         ^
//  |         |
//  variable  actual object
//  type      type
```

- **Variable type** (Animal): determines what methods you can call. The compiler only lets you call methods defined in `Animal`.
- **Object type** (Dog): determines which version of the method runs. At runtime, Java calls Dog's implementation.

This is why polymorphism works — the variable type provides the interface, and the object type provides the behavior.

## Upcasting

When you assign a subclass object to a superclass variable, Java does this automatically. It is called **upcasting**:

```java
Dog d = new Dog("Rex");
Animal a = d;          // upcasting — automatic, always safe
a.speak();             // "Woof!" — still calls Dog's version
```

Upcasting is always safe because a Dog "is an" Animal. You can use a Dog anywhere an Animal is expected.

## Polymorphic Collections

The real power of polymorphism shows up when you put different objects in the same collection:

```java
ArrayList<Shape> shapes = new ArrayList<>();
shapes.add(new Circle(5));
shapes.add(new Rectangle(3, 4));
shapes.add(new Circle(2));

double totalArea = 0;
for (Shape s : shapes) {
    totalArea += s.area();  // calls Circle.area() or Rectangle.area() automatically
}
```

You wrote one loop, but it handles every shape type correctly. If you later add a `Triangle` class, the loop works without any changes. This is the core value of polymorphism — **writing code once that works with all types in a hierarchy**.

## The `instanceof` Operator

Sometimes you need to check the actual type of an object. The `instanceof` operator does this:

```java
Animal a = new Dog("Rex");

if (a instanceof Dog) {
    System.out.println("It's a dog!");
}

if (a instanceof Animal) {
    System.out.println("It's an animal!");  // also true — Dog is an Animal
}
```

You can also use `instanceof` with a cast to access subclass-specific methods:

```java
Shape s = getRandomShape();
if (s instanceof Circle) {
    Circle c = (Circle) s;
    System.out.println("Radius: " + c.getRadius());
}
```

**Use `instanceof` sparingly.** If you find yourself writing long chains of `instanceof` checks, you probably need to add a method to the base class instead. The whole point of polymorphism is to avoid checking types manually.

## Designing Good Hierarchies

Not every grouping of classes should use inheritance. Here are some guidelines:

**Use inheritance when there is a clear "is-a" relationship:**
- A Circle **is a** Shape (good)
- A Dog **is an** Animal (good)
- A Stack **is an** ArrayList (bad — a Stack *uses* an ArrayList, it is not one)

**Keep hierarchies shallow.** One or two levels of inheritance is common. Three or more levels become hard to understand and maintain.

**Prefer interfaces for shared behavior across unrelated classes.** If a Book and a Receipt can both be printed, they share a capability, not an identity. Use a `Printable` interface.

**Put common behavior in the base class, specific behavior in subclasses:**
```java
abstract class Shape {
    // Common to all shapes
    public String describe() {
        return "Shape with area " + area();
    }

    // Each shape computes differently
    public abstract double area();
}
```

## Course Review — Key Concepts

This is the final topic in the course. Here is a summary of everything you have learned:

### Variables and Types
- Primitive types: `int`, `double`, `boolean`, `char`
- Reference types: `String`, arrays, ArrayList, your own classes
- Variables store values (primitives) or references (objects)

### Control Flow
- `if`/`else if`/`else` — conditional execution
- `while` loops — repeat while a condition is true
- `for` loops — repeat a known number of times
- `for-each` loops — iterate over collections

### Methods
- Define reusable blocks of code with parameters and return types
- Static methods belong to the class, instance methods belong to objects
- Method overloading — same name, different parameter types

### Arrays and ArrayList
- Arrays: fixed-size, use `[]`, `.length`
- ArrayList: dynamic size, use `.get()`, `.add()`, `.size()`
- Both use zero-based indexing

### Classes and Objects
- Fields store state, methods define behavior
- Constructors initialize new objects
- Encapsulation: private fields with public getters/setters
- `this` refers to the current object

### Inheritance and Interfaces
- `extends` — a class inherits from another class
- `abstract` — a class or method that cannot be instantiated / has no body
- `interface` — a contract of methods a class promises to implement
- `@Override` — annotation for overridden methods

### Polymorphism
- A superclass variable can hold a subclass object
- The correct method is called based on the actual object type (dynamic dispatch)
- Polymorphic collections let you process mixed types uniformly
- `instanceof` checks the actual type at runtime

## Summary

- **Polymorphism** lets one variable hold different types and call the right method automatically
- **Dynamic dispatch** picks the correct method based on the actual object, not the variable type
- **Upcasting** (subclass to superclass) is automatic and safe
- **Polymorphic collections** let you process different types with one loop
- **`instanceof`** checks the actual type — use sparingly
- **Good hierarchies** are shallow, use "is-a" relationships, and combine abstract classes with interfaces

The exercises in this final topic bring together everything you have learned. They are larger and more integrated than earlier exercises — that is intentional. They reflect what real programming looks like.
