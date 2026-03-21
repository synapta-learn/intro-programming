# Variables and Types — Storing Data

## What Is a Variable?

A variable is a **named container** that holds a value. Think of it like a labeled box: the label is the name, and whatever is inside the box is the value.

```java
int age = 25;
```

Here, `age` is the name of the box. The number `25` is what is inside. The word `int` tells Java what *kind* of thing the box is allowed to hold (in this case, a whole number).

You can change what is inside the box at any time:

```java
age = 26;  // happy birthday
```

But you cannot put the wrong kind of thing in it:

```java
age = "twenty-six";  // ERROR — age holds ints, not text
```

## Declaring and Assigning Variables

Creating a variable is a two-part process:

**Declaration** — telling Java the type and name:
```java
int score;
```

**Assignment** — putting a value in the variable:
```java
score = 100;
```

You can do both at once (and usually should):
```java
int score = 100;
```

You can also declare multiple variables of the same type:
```java
int x = 5, y = 10, z = 15;
```

## The Primitive Types

Java has eight built-in (primitive) types. For now, focus on these four:

### int — Whole Numbers

```java
int students = 30;
int temperature = -5;
int million = 1000000;
```

An `int` can hold values from about -2.1 billion to +2.1 billion. That covers most counting needs.

### double — Decimal Numbers

```java
double price = 9.99;
double pi = 3.14159;
double tiny = 0.001;
```

Use `double` whenever you need a decimal point. The name "double" refers to "double-precision floating point" — you do not need to understand that yet, just know it means "decimal number."

### boolean — True or False

```java
boolean isRaining = true;
boolean hasLicense = false;
```

A `boolean` can hold exactly two values: `true` or `false`. No quotes — these are keywords, not text.

### char — A Single Character

```java
char grade = 'A';
char initial = 'J';
char digit = '7';
```

A `char` holds exactly one character. Notice that `char` values use **single quotes** `' '`, not double quotes.

## String — Text

A `String` is not a primitive type — it is a **reference type** (more on that later). But you will use it from day one, so let's introduce it now:

```java
String name = "Ada Lovelace";
String greeting = "Hello!";
String empty = "";
```

Notice:
- `String` starts with a capital `S` (unlike `int`, `double`, etc.)
- String values use **double quotes** `" "`
- A String can be empty (`""`) — that is a valid value

You can glue Strings together with the `+` operator:

```java
String first = "Ada";
String last = "Lovelace";
String full = first + " " + last;  // "Ada Lovelace"
```

You can also combine Strings with other types:

```java
int age = 36;
String message = "Age: " + age;  // "Age: 36"
```

When Java sees `+` between a String and a number, it converts the number to text automatically.

## Naming Conventions

Variable names in Java follow these rules:

**Must:**
- Start with a letter, underscore `_`, or dollar sign `$`
- Contain only letters, digits, underscores, or dollar signs
- Not be a Java keyword (`int`, `class`, `public`, etc.)

**Should (by convention):**
- Use `camelCase` — start lowercase, capitalize each new word:
  ```java
  int studentCount = 30;
  double averageScore = 87.5;
  boolean isLoggedIn = false;
  String firstName = "Ada";
  ```
- Be descriptive — `studentCount` is better than `sc` or `x`
- Boolean variables often start with `is`, `has`, or `can`

## Type Matters

Java is a **statically typed** language. Every variable has a fixed type, and you cannot change it:

```java
int count = 10;
count = 20;       // OK — same type
count = 3.14;     // ERROR — can't put a double in an int
count = "hello";  // ERROR — can't put a String in an int
```

This might seem strict, but it catches mistakes *before* your program runs. If you accidentally try to store someone's name in an age variable, the compiler stops you immediately.

## Printing Variables

You already know `System.out.println()`. It works with variables too:

```java
int x = 42;
System.out.println(x);           // prints: 42
System.out.println("x = " + x); // prints: x = 42
```

You can print any type:

```java
double pi = 3.14;
boolean ready = true;
char letter = 'Z';
String word = "Java";

System.out.println(pi);     // 3.14
System.out.println(ready);  // true
System.out.println(letter); // Z
System.out.println(word);   // Java
```

## Common Mistakes

| Mistake | Example | What happens |
|---|---|---|
| Using a variable before declaring it | `x = 5;` (no `int`) | Compiler error |
| Wrong type on assignment | `int x = 3.14;` | Compiler error |
| Single quotes for String | `String s = 'hi';` | Compiler error |
| Double quotes for char | `char c = "A";` | Compiler error |
| Uninitialized variable | `int x; println(x);` | Compiler error |
| Case-sensitive names | `String s; println(S);` | Compiler error |

## Summary

- Variables store values and have a **name** and a **type**
- Four key primitive types: `int`, `double`, `boolean`, `char`
- `String` stores text (capital S, double quotes)
- Use `camelCase` for variable names
- Java enforces types — you cannot put the wrong kind of value in a variable
- Concatenation with `+` lets you build messages from variables

Time to practice. The exercises will have you create, combine, and use variables of every type.
