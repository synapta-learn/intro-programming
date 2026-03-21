# Hello, World! — Your First Java Program

## What Is Programming?

Imagine giving directions to someone who follows instructions *exactly* as written — no guessing, no improvising. That is what programming is: writing precise instructions that a computer can follow.

A **program** is just a text file containing these instructions. The computer reads your file, translates it into something it understands, and executes the steps one by one, top to bottom.

## What Is Java?

Java is one of the most widely used programming languages in the world. It runs on billions of devices — from banking systems to Android phones to Minecraft. We chose Java for this course because:

- It enforces good habits (you must be explicit about types, structure, etc.)
- It runs on any operating system without changes
- It has been around since 1995 and is not going anywhere

## The Structure of a Java Program

Here is the smallest useful Java program:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

If you run this program, it prints:

```
Hello, World!
```

Let's break it down piece by piece.

### The Class

```java
public class Hello {
    // everything goes inside here
}
```

Every Java program lives inside a **class**. Think of the class as a container for your code. The name of the class (`Hello`) must match the filename (`Hello.java`). The curly braces `{` and `}` mark where the class starts and ends.

### The Main Method

```java
public static void main(String[] args) {
    // your instructions go here
}
```

When you run a Java program, the computer looks for a special method called `main`. This is the **entry point** — the first thing that runs. Every word in that line has a meaning, but for now, just memorize the pattern. You will understand each keyword over the coming weeks.

### The Body

```java
System.out.println("Hello, World!");
```

This is the actual instruction. It tells Java: "Print the text `Hello, World!` to the screen, then move to a new line."

Notice:
- The text you want to print goes inside double quotes `" "`
- The line ends with a semicolon `;` — this is how Java knows the instruction is finished
- Java is case-sensitive: `System` is not the same as `system`

## Printing Text: println() vs print()

Java gives you two ways to display text:

**`System.out.println()`** — prints text and then moves to the **next line**:

```java
System.out.println("Line one");
System.out.println("Line two");
```

Output:
```
Line one
Line two
```

**`System.out.print()`** — prints text but stays on the **same line**:

```java
System.out.print("Hello ");
System.out.print("World");
System.out.println("!");
```

Output:
```
Hello World!
```

The `ln` in `println` stands for "line" — it adds a line break at the end.

## How to Compile and Run

Java is a **compiled** language. You write code in a `.java` file, then convert it into something the computer can run.

**Step 1: Write your code** in a file called `Hello.java`

**Step 2: Compile** — translate your code into bytecode:
```
javac Hello.java
```

If there are no errors, this creates a file called `Hello.class`.

**Step 3: Run** — execute the compiled program:
```
java Hello
```

Notice you use `javac` (Java Compiler) to compile and `java` to run. When running, you do **not** include the `.class` extension.

If you made a typo or mistake, the compiler will give you an error message. Read it carefully — it tells you which line has the problem.

## Comments — Notes for Humans

Comments are lines that Java completely ignores. They exist so you (and other programmers) can leave notes in the code.

**Single-line comment** — everything after `//` on that line is ignored:

```java
// This is a comment
System.out.println("Hello"); // This prints Hello
```

**Multi-line comment** — everything between `/*` and `*/` is ignored:

```java
/* This comment
   spans multiple
   lines */
System.out.println("Hello");
```

Use comments to explain *why* you did something, not *what* the code does. The code itself shows the "what."

## Common Mistakes

Here are errors that every beginner makes at least once:

| Mistake | What happens |
|---|---|
| Forgetting the semicolon `;` | Compiler error |
| Using `system` instead of `System` | Compiler error — Java is case-sensitive |
| Mismatched quotes `"Hello'` | Compiler error |
| Filename doesn't match class name | Compiler error |
| Forgetting curly braces `{}` | Compiler error |

When you get an error, don't panic. Read the message, check the line number, and look for typos.

## Summary

- A Java program has a **class** containing a **main method**
- `System.out.println()` prints text followed by a new line
- `System.out.print()` prints text without a new line
- Compile with `javac`, run with `java`
- Comments (`//` and `/* */`) are ignored by the compiler
- Every statement ends with a semicolon `;`

Now it is time to write some code. Head to the exercises and start typing.
