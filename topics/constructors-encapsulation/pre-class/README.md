# Constructors and Encapsulation

## The Problem with Public Fields

In the previous topic, you created classes where anyone could set any field to any value:

```java
Rectangle r = new Rectangle();
r.width = -5.0;   // Negative width? That makes no sense.
r.height = 0.0;   // Zero height? Also questionable.
```

There is nothing stopping someone from putting your object into an invalid state. And if fields start in a bad state, your methods will produce garbage results. We need two things:

1. A way to **initialize** objects properly when they are created
2. A way to **protect** fields from being set to invalid values

These are **constructors** and **encapsulation**.

## Constructors

A constructor is a special method that runs when you create an object with `new`. It has the same name as the class and no return type:

```java
public class Rectangle {
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
```

Now you create rectangles like this:

```java
Rectangle r = new Rectangle(5.0, 3.0);  // width=5, height=3
```

You can no longer write `new Rectangle()` without arguments — Java only provides a free no-argument constructor if you do not define any constructors yourself.

### The `this` Keyword in Constructors

When a parameter has the same name as a field, you need `this` to distinguish them:

```java
public Rectangle(double width, double height) {
    this.width = width;    // this.width = the field, width = the parameter
    this.height = height;
}
```

Without `this`, `width = width` would just assign the parameter to itself, leaving the field unchanged. This is one of the most common bugs when writing constructors.

## The Default Constructor

If you do not write any constructor, Java provides a **default constructor** that takes no arguments and does nothing (fields get their default values: 0, false, null):

```java
public class Counter {
    int count;
    // Java provides: public Counter() { }
}

Counter c = new Counter();  // works fine, count starts at 0
```

But the moment you write **any** constructor, the free default is gone:

```java
public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

Rectangle r = new Rectangle();  // COMPILE ERROR — no such constructor
```

## Constructor Overloading

You can have multiple constructors with different parameter lists:

```java
public class Rectangle {
    double width;
    double height;

    // Constructor with both dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor for a square
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }
}

Rectangle rect = new Rectangle(5.0, 3.0);  // 5x3 rectangle
Rectangle square = new Rectangle(4.0);      // 4x4 square
```

### Constructor Chaining with `this()`

One constructor can call another using `this(...)`. This must be the first statement in the constructor:

```java
public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this(side, side);  // calls the two-parameter constructor
    }

    public Rectangle() {
        this(1.0, 1.0);   // default 1x1 rectangle
    }
}
```

This avoids duplicating initialization logic.

## Validation in Constructors

Constructors are the perfect place to enforce rules about what constitutes a valid object:

```java
public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero");
        }
        this.celsius = celsius;
    }
}

Temperature t1 = new Temperature(100.0);   // fine
Temperature t2 = new Temperature(-300.0);  // throws exception
```

By validating in the constructor, you guarantee that **every** Temperature object has a valid value from the moment it is created.

## Encapsulation — The `private` Keyword

**Encapsulation** means hiding an object's internal data and only exposing it through controlled methods. The key tool is the `private` access modifier:

```java
public class BankAccount {
    private double balance;  // only this class can access 'balance'

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

Now nobody can write `account.balance = -1000000`. They must go through `deposit()`, which enforces the rules. The field `balance` is `private` — only code inside `BankAccount` can read or write it directly.

## Getters and Setters

A **getter** is a method that returns the value of a private field. A **setter** is a method that sets it, usually with validation:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);  // reuse the setter's validation
    }

    // Getter
    public String getName() {
        return name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter with validation
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
}
```

**Not every field needs a setter.** Some fields should only be set in the constructor and never changed. This makes the object **immutable** (or partially immutable). Only provide a setter if external code genuinely needs to change the value.

## Why Encapsulation Matters

Consider a class that tracks a percentage:

```java
// Without encapsulation
public class Progress {
    public int percent;  // should be 0-100
}

Progress p = new Progress();
p.percent = 250;  // nonsense, but nothing stops it
```

With encapsulation:

```java
public class Progress {
    private int percent;

    public Progress(int percent) {
        setPercent(percent);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        this.percent = percent;
    }
}

Progress p = new Progress(250);
System.out.println(p.getPercent());  // 100 — clamped to valid range
```

Encapsulation protects **invariants** — rules that should always be true about your object. If a percentage must be 0-100, encapsulation guarantees it.

## Immutable Objects

An **immutable** object cannot be changed after creation. All fields are `private final`, set only in the constructor, and there are no setters:

```java
public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
```

The `final` keyword means the field can only be assigned once (in the constructor). After that, it cannot be changed. Immutable objects are easy to reason about because they never change state.

## Summary

- **Constructors** initialize objects when they are created with `new`
- Constructors have the same name as the class and no return type
- Use `this.field = parameter` when names collide
- You can have multiple constructors (**overloading**) and chain them with `this()`
- If you write any constructor, Java stops providing the default no-arg constructor
- **`private`** fields can only be accessed within the class
- **Getters** expose field values; **setters** allow controlled modification
- Validate in constructors and setters to protect **invariants**
- **Immutable** objects use `private final` fields with no setters
- Encapsulation = private fields + public methods = controlled access to data

The exercises will have you build classes that combine constructors, private fields, validation, and getters. Focus on the idea that **objects should always be in a valid state**.
