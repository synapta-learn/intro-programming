# Inheritance and Interfaces — Post-Class Review

## What You Learned

In this topic you built class hierarchies and implemented interfaces. You practiced:

- **Extending classes** with `extends` and using `super` to call parent constructors
- **Overriding methods** with `@Override` to specialize behavior
- **Abstract classes** that define a template for subclasses to fill in
- **Interfaces** that define contracts any class can adopt
- **`Comparable`** for making objects sortable

## Key Takeaways

**Inheritance is about "is-a" relationships.** A Dog "is an" Animal. A Circle "is a" Shape. If the relationship does not sound natural, inheritance is probably the wrong tool.

**Favor interfaces over deep hierarchies.** When you find yourself building chains of three or four levels, step back and ask whether an interface would be cleaner. Real-world Java code uses interfaces heavily.

**Always use `@Override`.** It costs nothing and catches real bugs. Without it, a typo in a method name creates a new method instead of overriding the parent — a subtle bug that is very hard to find.

**Abstract classes vs interfaces is about state.** If your base type needs fields (like a name shared by all subclasses), use an abstract class. If it just defines behavior (like "can be printed"), use an interface.

## Common Patterns to Remember

```java
// Abstract class with concrete helper method
abstract class Shape {
    public abstract double area();

    public String describe() {
        return "Area: " + area();  // calls the subclass implementation
    }
}

// Interface with multiple implementations
interface Printable {
    String toPrintString();
}

// Calling super constructor
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // must be first line
    }
}

// Implementing Comparable
public int compareTo(Student other) {
    return Double.compare(this.gpa, other.gpa);
}
```

## What Comes Next

With inheritance and interfaces in place, you are ready for **polymorphism** — writing code that works with any object in a type hierarchy. You will see how a single variable can hold different types of objects and how Java picks the right method at runtime.
