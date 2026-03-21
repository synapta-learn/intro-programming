# ArrayList and Collections — Dynamic Lists

## The Limitation of Arrays

Arrays are powerful, but they have one major constraint: **their size is fixed** when you create them. Once you write `new int[5]`, you have exactly 5 slots. No more, no less.

What if you are reading data from a file and you do not know how many items there will be? What if your program needs to grow and shrink a list as the user adds and removes items? With arrays, you would have to create a new, larger array, copy everything over, and throw away the old one. Every single time.

Java provides a better solution: **ArrayList**.

## What Is an ArrayList?

An `ArrayList` is a **resizable list** that grows automatically as you add elements. Under the hood it uses an array, but it handles all the resizing for you. You never worry about capacity.

To use it, you need this import at the top of your file:

```java
import java.util.ArrayList;
```

## Creating an ArrayList

An ArrayList is a generic type, meaning you tell it what kind of objects it will hold using angle brackets:

```java
ArrayList<String> names = new ArrayList<>();
ArrayList<Integer> scores = new ArrayList<>();
```

The type in the angle brackets (called a **type parameter**) specifies what the list will store. The `<>` on the right side (called the "diamond") lets Java infer the type from the left side.

**Important:** You cannot use primitive types like `int` or `double` directly. You must use their **wrapper types**:

| Primitive | Wrapper Type |
|-----------|-------------|
| `int` | `Integer` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

## Wrapper Types and Autoboxing

Java automatically converts between primitive types and their wrappers. This is called **autoboxing** (primitive to wrapper) and **unboxing** (wrapper to primitive):

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(42);       // autoboxing: int 42 becomes Integer 42
int value = numbers.get(0);  // unboxing: Integer 42 becomes int 42
```

You almost never need to think about this — Java handles it silently. Just remember to write `Integer` in the angle brackets, not `int`.

## Essential ArrayList Methods

Here are the methods you will use constantly:

### Adding Elements

```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");      // adds to the end → [Apple]
fruits.add("Banana");     // adds to the end → [Apple, Banana]
fruits.add("Cherry");     // adds to the end → [Apple, Banana, Cherry]

fruits.add(1, "Blueberry");  // inserts at index 1 → [Apple, Blueberry, Banana, Cherry]
```

### Getting Elements

```java
String first = fruits.get(0);   // "Apple"
String second = fruits.get(1);  // "Blueberry"
```

Just like arrays, indices start at **0**. Accessing an invalid index throws `IndexOutOfBoundsException`.

### Setting Elements

```java
fruits.set(0, "Avocado");  // replaces index 0 → [Avocado, Blueberry, Banana, Cherry]
```

### Removing Elements

```java
fruits.remove(2);          // removes by index → [Avocado, Blueberry, Cherry]
fruits.remove("Cherry");   // removes by value → [Avocado, Blueberry]
```

When removing by value, it removes the **first occurrence** and returns `true` if the element was found.

### Size

```java
int count = fruits.size();  // 2
```

Note: it is `.size()` with parentheses, not `.length` like arrays.

### Checking Contents

```java
boolean hasIt = fruits.contains("Avocado");  // true
boolean empty = fruits.isEmpty();             // false
```

## The For-Each Loop

Java provides a cleaner way to iterate over collections called the **for-each loop** (also called the "enhanced for loop"):

```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Carol");

for (String name : names) {
    System.out.println(name);
}
```

Read this as "for each String `name` in `names`." The loop variable `name` takes on each value in the list, one at a time.

Compare this to the index-based approach:

```java
// Index-based (still works, sometimes needed)
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}

// For-each (cleaner when you don't need the index)
for (String name : names) {
    System.out.println(name);
}
```

Use the for-each loop when you need to process every element and do not need the index. Use the index-based loop when you need to know the position or modify the list during iteration.

**Warning:** Do not add or remove elements from an ArrayList while iterating over it with a for-each loop. This causes a `ConcurrentModificationException`. If you need to remove elements while iterating, use an index-based loop and be careful with the indices, or iterate backwards.

## The For-Each Loop Works with Arrays Too

The for-each loop is not exclusive to ArrayList — it works with regular arrays as well:

```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}
```

## ArrayList vs Array — When to Use Each

| Feature | Array | ArrayList |
|---------|-------|-----------|
| Size | Fixed at creation | Grows and shrinks |
| Syntax | `int[]` | `ArrayList<Integer>` |
| Access | `array[i]` | `list.get(i)` |
| Length | `array.length` | `list.size()` |
| Primitives | Yes (`int[]`) | No (use `Integer`) |
| Add/remove | Manual (painful) | Built-in methods |

**Rule of thumb:** Use an array when you know the exact size up front and it will not change. Use an ArrayList when the size might change or you do not know it in advance.

## Common Patterns with ArrayList

### Building a Filtered List

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);

ArrayList<Integer> evens = new ArrayList<>();
for (int n : numbers) {
    if (n % 2 == 0) {
        evens.add(n);
    }
}
// evens → [2, 4]
```

### Converting Between ArrayList and Array

```java
// ArrayList to array
ArrayList<String> list = new ArrayList<>();
list.add("a"); list.add("b"); list.add("c");
String[] array = list.toArray(new String[0]);

// Array to ArrayList
String[] arr = {"x", "y", "z"};
ArrayList<String> fromArray = new ArrayList<>();
for (String s : arr) {
    fromArray.add(s);
}
```

### Finding a Value

```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice"); names.add("Bob");

int index = names.indexOf("Bob");  // 1
int missing = names.indexOf("Eve");  // -1 (not found)
```

## Summary

- **ArrayList** is a resizable list that grows as you add elements
- Use **wrapper types** (`Integer`, `Double`) instead of primitives in the angle brackets
- Key methods: `add()`, `get()`, `set()`, `remove()`, `size()`, `contains()`
- The **for-each loop** (`for (Type item : collection)`) is the cleanest way to iterate
- **Autoboxing** converts between primitives and wrappers automatically
- Use ArrayList when the size is unknown or changes; use arrays when the size is fixed

The exercises will let you practice building, filtering, and transforming ArrayLists. These skills form the foundation for working with collections throughout your programming career.
