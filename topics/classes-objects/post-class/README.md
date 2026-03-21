# Classes and Objects — Post-Class Review

## What You Learned

In this topic you built your own classes for the first time. You practiced:

- **Defining fields** to store an object's state
- **Writing instance methods** that operate on that state
- **Creating objects** with `new` and calling methods on them
- **Managing object state** — incrementing counters, updating balances, tracking positions
- **Object interaction** — methods that take other objects as parameters

## Key Takeaways

**Think about what data an object needs.** Before writing methods, decide what fields the class needs. A `Rectangle` needs `width` and `height`. A `BankAccount` needs `balance`. Get the data right first, then the methods follow naturally.

**Instance methods do not use `static`.** This is the biggest syntax change from what you have been doing. Instance methods can access `this` and the object's fields directly.

**Objects are independent.** Creating two `Counter` objects gives you two separate counters. Incrementing one does not affect the other. Each object has its own copy of every field.

**Guard your state.** The `BankAccount` exercise showed a key principle: methods should protect the object from invalid states. A withdrawal should not be allowed if it would make the balance negative.

## Common Patterns to Remember

```java
// Basic class structure
public class MyClass {
    // fields (instance variables)
    int value;

    // methods that use the fields
    void doSomething() {
        value = value + 1;
    }

    int getValue() {
        return value;
    }
}

// Creating and using objects
MyClass obj = new MyClass();
obj.doSomething();
System.out.println(obj.getValue());
```

## What Comes Next

Now that you can define your own types, the next topic introduces **constructors and encapsulation** — ways to initialize objects properly and protect their internal data from misuse. You will learn about `private` fields, getters and setters, and constructor parameters.
