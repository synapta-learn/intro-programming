# Methods — Reusable Blocks of Code

## Why Methods?

As your programs grow, you start to notice two problems:

1. **Repetition** — You write the same logic in several places. If you need to change it, you have to find and update every copy.
2. **Complexity** — Your `main` method becomes hundreds of lines long, and it is hard to understand what it does at a glance.

**Methods** solve both problems. A method is a named block of code that you can call whenever you need it. Write the logic once, give it a name, and call it from anywhere.

## Defining a Method

Here is a simple method that adds two numbers:

```java
public static int add(int a, int b) {
    return a + b;
}
```

Let's break down each part:

| Part | Meaning |
|------|---------|
| `public` | Accessible from anywhere (we will always use this for now) |
| `static` | Belongs to the class, not to an object (more on this later) |
| `int` | The **return type** — what type of value the method gives back |
| `add` | The **name** of the method |
| `(int a, int b)` | The **parameters** — inputs the method needs |
| `return a + b;` | The **return statement** — sends a value back to the caller |

## Calling a Method

Once defined, you call a method by its name and pass the required arguments:

```java
public static void main(String[] args) {
    int result = add(3, 5);
    System.out.println(result);  // 8

    System.out.println(add(10, 20));  // 30
}
```

The values you pass (`3` and `5`) are called **arguments**. They get assigned to the parameters (`a` and `b`) inside the method.

## Parameters and Arguments

**Parameters** are the variables listed in the method definition. **Arguments** are the actual values you pass when calling the method.

```java
//         parameters: x and y
public static int multiply(int x, int y) {
    return x * y;
}

public static void main(String[] args) {
    //              arguments: 4 and 7
    int product = multiply(4, 7);  // 28
}
```

A method can have zero, one, or many parameters:

```java
public static double pi() {          // zero parameters
    return 3.14159;
}

public static int square(int n) {    // one parameter
    return n * n;
}

public static int max(int a, int b) { // two parameters
    if (a >= b) return a;
    return b;
}
```

## Return Types

Every method declares what type of value it returns: `int`, `double`, `boolean`, `String`, `int[]`, etc.

The `return` statement does two things:
1. Sends a value back to the caller
2. Ends the method immediately

```java
public static boolean isAdult(int age) {
    if (age >= 18) {
        return true;   // method ends here if age >= 18
    }
    return false;      // only reached if age < 18
}
```

A more concise version:
```java
public static boolean isAdult(int age) {
    return age >= 18;  // the expression itself is a boolean
}
```

## Void Methods

Some methods perform an action without returning a value. These use `void` as the return type:

```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
```

A `void` method does not need a `return` statement. If you want to exit early, you can use `return;` (with no value):

```java
public static void printPositive(int n) {
    if (n <= 0) {
        return;  // exit early, print nothing
    }
    System.out.println(n);
}
```

## Method Overloading

Java allows you to define multiple methods with the **same name** but **different parameter lists**. This is called **overloading**.

```java
public static int max(int a, int b) {
    return a >= b ? a : b;
}

public static double max(double a, double b) {
    return a >= b ? a : b;
}

public static int max(int a, int b, int c) {
    return max(max(a, b), c);
}
```

When you call `max(3, 5)`, Java picks the version with two `int` parameters. When you call `max(3.14, 2.71)`, it picks the `double` version. When you call `max(1, 2, 3)`, it picks the three-parameter version.

The rules:
- Overloaded methods must differ in the **number** or **types** of parameters
- The return type alone is not enough to distinguish them
- Java picks the most specific match

## Decomposition

The real power of methods is **decomposition** — breaking a complex problem into smaller, manageable pieces.

Consider checking if a year is a leap year:

**Without methods (one big block):**
```java
boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
```

**With a method (clear and reusable):**
```java
public static boolean isLeapYear(int year) {
    if (year % 400 == 0) return true;
    if (year % 100 == 0) return false;
    return year % 4 == 0;
}
```

Now you can call `isLeapYear(2024)` anywhere in your program. The method name tells you *what* it does. The body tells you *how*.

Good decomposition follows these guidelines:
- Each method does **one thing**
- The method name describes what it does
- Methods are short (ideally under 20 lines)
- If you find yourself copying code, extract it into a method

## Methods Calling Methods

Methods can call other methods. This is how you build programs out of small, composable pieces:

```java
public static boolean isDivisible(int n, int divisor) {
    return n % divisor == 0;
}

public static boolean isEven(int n) {
    return isDivisible(n, 2);
}

public static int countEvenInRange(int start, int end) {
    int count = 0;
    for (int i = start; i <= end; i++) {
        if (isEven(i)) {
            count++;
        }
    }
    return count;
}
```

Each method is simple on its own, but together they solve a bigger problem.

## The Call Stack

When a method calls another method, Java remembers where to come back to. It uses a **call stack** — a stack of "frames," one for each active method call.

```java
public static void main(String[] args) {
    int result = double(5);     // 1. main calls double(5)
    System.out.println(result); // 4. back in main, prints 10
}

public static int double(int n) {
    return add(n, n);           // 2. double calls add(5, 5)
}

public static int add(int a, int b) {
    return a + b;               // 3. add returns 10 to double
}
```

The call stack at step 3 looks like:
```
add(5, 5)       <-- currently executing
double(5)       <-- waiting for add to return
main            <-- waiting for double to return
```

Each frame has its own local variables. When a method finishes, its frame is removed and execution continues in the caller.

## Common Mistakes

| Mistake | What happens |
|---|---|
| Forgetting `return` in a non-void method | Compile error |
| Returning the wrong type | Compile error |
| Calling a method without enough arguments | Compile error |
| Forgetting `static` on a method called from `main` | Compile error |
| Using a variable from another method | Compile error — variables are local to their method |

That last point is important: each method has its own **scope**. A variable declared inside one method does not exist in another.

```java
public static int square(int n) {
    int result = n * n;
    return result;
}

public static void main(String[] args) {
    square(5);
    // System.out.println(result); // ERROR — result does not exist here
    System.out.println(square(5)); // Correct — use the return value
}
```

## Summary

- A **method** is a named, reusable block of code
- Methods have a return type, name, and parameters
- Use `return` to send a value back; use `void` when nothing is returned
- **Overloading** lets you define multiple methods with the same name but different parameters
- **Decomposition** means breaking a big problem into small methods
- Each method has its own **scope** — variables are local
- Methods call other methods, building a **call stack**

The exercises will have you write methods that take parameters, return values, work with arrays, and use overloading. Focus on making each method do one thing well.
