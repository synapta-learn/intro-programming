# ArrayList and Collections — Post-Class Review

## What You Learned

In this topic you worked with Java's ArrayList — a dynamic, resizable alternative to arrays. You practiced:

- **Creating ArrayLists** with type parameters and wrapper types
- **Adding, removing, and accessing** elements with `add()`, `remove()`, `get()`, `set()`
- **Iterating** with the for-each loop and index-based loops
- **Building new lists** by filtering and transforming existing ones
- **Converting** between ArrayLists and arrays

## Key Takeaways

**ArrayList vs array is about flexibility vs simplicity.** When you know the exact size and it will not change, an array is simpler and faster. When the size is dynamic, ArrayList handles the resizing for you.

**The for-each loop is your default.** Unless you need the index or plan to modify the list during iteration, prefer `for (Type item : list)` over `for (int i = 0; ...)`. It is cleaner and less error-prone.

**Removing while iterating is tricky.** Never add or remove elements during a for-each loop. Use an index-based loop (iterating backwards if removing) instead.

**Wrapper types are nearly invisible.** Thanks to autoboxing, you rarely need to think about `Integer` vs `int` beyond the type parameter declaration. But be aware that `Integer` can be `null`, which would cause a `NullPointerException` when unboxing.

## Common Patterns to Remember

```java
// Build a filtered list
ArrayList<Integer> result = new ArrayList<>();
for (int item : original) {
    if (condition(item)) {
        result.add(item);
    }
}

// Remove duplicates (preserve order)
ArrayList<String> unique = new ArrayList<>();
for (String item : original) {
    if (!unique.contains(item)) {
        unique.add(item);
    }
}

// Transform each element
ArrayList<Integer> doubled = new ArrayList<>();
for (int item : original) {
    doubled.add(item * 2);
}
```

## What Comes Next

Now that you can work with dynamic collections, the next step is **inheritance and interfaces** — building families of related classes that share behavior. You will learn how classes can extend other classes, override methods, and implement contracts defined by interfaces.
