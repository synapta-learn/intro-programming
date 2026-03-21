# Classes and Objects

## Beyond Primitive Values

So far, you have worked with simple types like `int`, `double`, `boolean`, and `String`. These are useful, but they only represent one piece of data at a time. What if you need to represent something more complex — a student with a name and grades, a bank account with a balance, or a point on a 2D grid with x and y coordinates?

You could use separate variables:

```java
String studentName = "Alice";
int studentAge = 20;
double studentGPA = 3.7;
```

But this falls apart quickly. What if you have 30 students? You would need 30 names, 30 ages, and 30 GPAs, with no way to keep them connected. This is where **classes** come in.

## What Is a Class?

A **class** is a blueprint for creating a new type. It defines what data the type holds (called **fields**) and what operations it can perform (called **methods**).

```java
public class Student {
    String name;
    int age;
    double gpa;
}
```

This defines a new type called `Student`. It does not create any students — it just describes what a student looks like.

## What Is an Object?

An **object** is an instance of a class — a specific thing built from the blueprint. You create objects using the `new` keyword:

```java
Student alice = new Student();
alice.name = "Alice";
alice.age = 20;
alice.gpa = 3.7;

Student bob = new Student();
bob.name = "Bob";
bob.age = 21;
bob.gpa = 3.2;
```

Each object is independent. Changing `alice.name` does not affect `bob.name`. They are separate instances of the same type.

## Fields (Instance Variables)

Fields are the data that each object carries. Every object gets its own copy of every field:

```java
public class Rectangle {
    double width;
    double height;
}
```

When you create a `Rectangle` object, it has its own `width` and `height`:

```java
Rectangle r1 = new Rectangle();
r1.width = 5.0;
r1.height = 3.0;

Rectangle r2 = new Rectangle();
r2.width = 10.0;
r2.height = 7.0;
```

Fields that are not explicitly initialized get default values: `0` for numbers, `false` for booleans, and `null` for objects/strings.

## Methods

Methods are actions that an object can perform. They can use and modify the object's fields:

```java
public class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}
```

You call methods on a specific object using the dot operator:

```java
Rectangle r = new Rectangle();
r.width = 5.0;
r.height = 3.0;

System.out.println(r.area());       // 15.0
System.out.println(r.perimeter());  // 16.0
```

Notice that `area()` and `perimeter()` are **not** `static`. They belong to an instance, not to the class. This is a key difference from the `static` methods you have been writing.

## The `this` Keyword

Inside a method, `this` refers to the current object — the object whose method is being called:

```java
public class Counter {
    int count;

    void increment() {
        this.count++;  // 'this' refers to the specific Counter object
    }

    int getCount() {
        return this.count;
    }
}
```

You can usually omit `this` when there is no ambiguity:

```java
void increment() {
    count++;  // same as this.count++
}
```

But `this` becomes essential when a method parameter has the same name as a field, as you will see when we cover constructors in the next topic.

## Creating Objects with `new`

The `new` keyword does three things:
1. Allocates memory for the object
2. Initializes all fields to their default values
3. Returns a reference to the object

```java
Rectangle r = new Rectangle();  // creates a new Rectangle object
```

The variable `r` does not contain the rectangle itself — it contains a **reference** (a pointer) to where the rectangle lives in memory. This is important for understanding how objects behave when passed to methods.

## Reference Types vs. Primitives

This is one of the most important concepts in Java. Primitive types (`int`, `double`, `boolean`, `char`) hold their values directly. Reference types (objects, arrays, strings) hold a reference to the value.

```java
// Primitives: independent copies
int a = 5;
int b = a;
b = 10;
System.out.println(a);  // still 5

// References: shared object
Rectangle r1 = new Rectangle();
r1.width = 5.0;
Rectangle r2 = r1;      // r2 points to the SAME object
r2.width = 99.0;
System.out.println(r1.width);  // 99.0 — r1 and r2 are the same object!
```

When you assign one object variable to another, you are copying the reference, not the object. Both variables now point to the same object in memory.

## null

A reference variable that does not point to any object has the value `null`:

```java
Rectangle r = null;  // r does not point to any Rectangle
System.out.println(r.width);  // CRASH — NullPointerException
```

Trying to use a `null` reference causes a `NullPointerException`, one of the most common errors in Java. Always make sure an object has been created with `new` before you use it.

## Multiple Objects, One Class

A class is just a template. You can create as many objects from it as you need:

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();

c1.increment();
c1.increment();
c2.increment();

System.out.println(c1.getCount());  // 2
System.out.println(c2.getCount());  // 1
System.out.println(c3.getCount());  // 0
```

Each object maintains its own state. Calling `c1.increment()` does not affect `c2` or `c3`.

## Putting It Together — A Complete Example

```java
public class BankAccount {
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}
```

Using it:

```java
BankAccount savings = new BankAccount();
savings.deposit(1000.0);
savings.deposit(500.0);
savings.withdraw(200.0);
System.out.println(savings.getBalance());  // 1300.0

savings.withdraw(5000.0);  // rejected — insufficient funds
System.out.println(savings.getBalance());  // still 1300.0
```

## Static vs. Instance

You have been writing `static` methods since your first program. Now you are meeting instance methods. Here is the key difference:

| Static methods | Instance methods |
|----------------|-----------------|
| Belong to the class | Belong to an object |
| Called with `ClassName.method()` | Called with `object.method()` |
| Cannot access instance fields | Can access instance fields |
| Declared with `static` keyword | No `static` keyword |

For the exercises in this topic, you will write classes with instance fields and instance methods — no `static` keyword.

## Summary

- A **class** is a blueprint that defines fields (data) and methods (behavior)
- An **object** is a specific instance created with `new`
- Each object has its own copy of the fields
- Methods can read and modify the object's fields
- `this` refers to the current object
- Objects are reference types — assigning one variable to another shares the same object
- `null` means "no object" — using it causes a crash
- You can create many objects from one class, each with independent state

The exercises will have you build your own classes from scratch. Focus on getting comfortable with fields, methods, and the `new` keyword.
