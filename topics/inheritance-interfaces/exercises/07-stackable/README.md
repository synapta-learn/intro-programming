# Stackable

## Problem

Define a generic `Stackable<T>` interface and implement it with an `ArrayStack<T>` class backed by an ArrayList.

### Stackable<T> (interface)
- `void push(T item)` — add an item to the top
- `T pop()` — remove and return the top item, return `null` if empty
- `T peek()` — return the top item without removing it, return `null` if empty
- `boolean isEmpty()` — return `true` if the stack is empty
- `int size()` — return the number of items

### ArrayStack<T> (implements Stackable<T>)
- Constructor: `ArrayStack()` — creates an empty stack
- Implements all methods from Stackable<T> using an `ArrayList<T>` internally

## Examples

```java
Stackable<String> stack = new ArrayStack<>();
stack.push("first");
stack.push("second");
stack.push("third");

stack.peek();     // "third"
stack.pop();      // "third"
stack.size();     // 2
stack.pop();      // "second"
stack.pop();      // "first"
stack.pop();      // null
stack.isEmpty();  // true
```

## Hints

- The interface uses a type parameter `<T>` so it can work with any type
- The implementation uses `ArrayList<T>` and treats the end of the list as the top
- `pop()` and `peek()` return `null` instead of crashing when empty
