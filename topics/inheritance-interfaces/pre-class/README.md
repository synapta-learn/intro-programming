# Inheritance and Interfaces — Code Reuse and Contracts

## The Problem: Repeated Code

Imagine you are building a system with different kinds of employees. A manager has a name, a salary, and a bonus. An intern has a name and a fixed stipend. A developer has a name, a salary, and a programming language.

If you write separate classes with no relationship between them, you end up duplicating the name and salary logic in every class. When you need to change how names are stored, you change it in three places. When you add a fourth employee type, you copy the same code again.

**Inheritance** solves this by letting one class build on another.

## What Is Inheritance?

Inheritance lets you create a new class (the **subclass**) based on an existing class (the **superclass**). The subclass inherits all fields and methods from the superclass, and can add new ones or change existing behavior.

```java
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "...";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);  // call the superclass constructor
    }

    public String speak() {
        return "Woof!";
    }
}
```

The keyword **`extends`** establishes the relationship: `Dog extends Animal` means "Dog is a kind of Animal."

## The `super` Keyword

The `super` keyword refers to the superclass. It has two main uses:

**Calling the superclass constructor:**
```java
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // MUST be the first line in the constructor
    }
}
```

If the superclass constructor requires parameters, you **must** call `super(...)` as the very first line of the subclass constructor.

**Calling a superclass method:**
```java
class Dog extends Animal {
    public String describe() {
        return super.getName() + " says " + speak();
    }
}
```

## Method Overriding

When a subclass defines a method with the same name and parameters as the superclass, it **overrides** the superclass version. The subclass version is used when the method is called on a subclass object:

```java
Animal a = new Dog("Rex");
a.speak();  // "Woof!" — the Dog version is called
```

Use the **`@Override`** annotation to tell Java (and readers of your code) that you intend to override a method:

```java
class Dog extends Animal {
    @Override
    public String speak() {
        return "Woof!";
    }
}
```

The annotation is optional but strongly recommended. If you make a typo in the method name, `@Override` will cause a compile error instead of silently creating a new method.

## Abstract Classes

Sometimes you want to create a superclass that should never be instantiated on its own — it exists only to be extended. For this, use the **`abstract`** keyword:

```java
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    public String describe() {
        return "A shape with area " + area();
    }
}
```

Key rules:
- An **abstract method** has no body — just a declaration ending with `;`
- Any class with an abstract method **must** be declared `abstract`
- You **cannot** create an instance of an abstract class: `new Shape()` is a compile error
- Subclasses **must** implement all abstract methods, or be abstract themselves

```java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
```

Now you can create a `Circle` (concrete) but not a `Shape` (abstract).

## Interfaces

An **interface** defines a contract — a set of methods that a class promises to implement. Unlike a class, an interface contains no state (fields) and no method bodies (in basic usage):

```java
interface Printable {
    String toPrintString();
}
```

A class uses the **`implements`** keyword to adopt an interface:

```java
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toPrintString() {
        return "Book: " + title;
    }
}
```

### Why Use Interfaces?

1. **A class can implement multiple interfaces** (but can only extend one class):
   ```java
   class Book implements Printable, Comparable<Book> {
       // must implement methods from both interfaces
   }
   ```

2. **Interfaces define what an object can do**, not what it is. A `Book` and an `Invoice` are very different things, but both can be `Printable`.

3. **Code can work with the interface type** without knowing the specific class:
   ```java
   public static void printAll(Printable[] items) {
       for (Printable item : items) {
           System.out.println(item.toPrintString());
       }
   }
   ```

## Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Can have fields | Yes | No (only constants) |
| Can have constructors | Yes | No |
| Can have method bodies | Yes | No (basic usage) |
| A class can extend/implement | One class | Multiple interfaces |
| Use when | Classes share state and behavior | Classes share a capability |

**Rule of thumb:** Use an abstract class when subclasses share fields and some behavior. Use an interface when unrelated classes need to share a capability.

## The `Comparable` Interface

Java includes many built-in interfaces. One of the most useful is `Comparable<T>`, which lets objects be sorted:

```java
class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        // Negative = this comes first
        // Zero = equal
        // Positive = other comes first
        if (this.gpa != other.gpa) {
            return Double.compare(other.gpa, this.gpa);  // higher GPA first
        }
        return this.name.compareTo(other.name);  // alphabetical for ties
    }
}
```

Once a class implements `Comparable`, you can sort lists of that class using `Collections.sort()`.

## Inheritance Chain

A subclass can itself be a superclass:

```java
class Animal { }
class Dog extends Animal { }
class GuideDog extends Dog { }
```

`GuideDog` inherits everything from both `Dog` and `Animal`. This forms an **inheritance chain**. Keep these chains short — deep hierarchies become hard to understand.

## Common Mistakes

| Mistake | What happens |
|---|---|
| Forgetting `super(...)` when superclass has no default constructor | Compile error |
| Not implementing all abstract methods | Compile error — class must be abstract |
| Using `extends` with an interface | Compile error — use `implements` |
| Creating an instance of an abstract class | Compile error |
| Deep inheritance hierarchies | Hard to understand and maintain |

## Summary

- **Inheritance** (`extends`) lets a subclass reuse and specialize a superclass
- **`super`** calls the superclass constructor or methods
- **Method overriding** replaces the superclass behavior with the subclass version
- **`@Override`** annotation catches mistakes at compile time
- **Abstract classes** define methods without implementing them — subclasses must fill in the gaps
- **Interfaces** define a contract of methods that any class can implement
- A class can extend **one** class but implement **many** interfaces
- **`Comparable<T>`** is a built-in interface for making objects sortable

The exercises will give you hands-on practice building class hierarchies and implementing interfaces. These concepts are fundamental to how professional Java programs are structured.
