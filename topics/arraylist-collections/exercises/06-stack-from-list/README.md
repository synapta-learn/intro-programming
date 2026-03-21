# Stack from List

## Problem

A **stack** is a data structure that follows "Last In, First Out" (LIFO) — like a stack of plates. The last item you put on top is the first one you take off.

Implement a `Stack` class backed by an `ArrayList<Integer>` with these methods:

- **`Stack()`** — Create an empty stack.
- **`push(int value)`** — Add a value to the top of the stack.
- **`pop()`** — Remove and return the value on top. Return `-1` if the stack is empty.
- **`peek()`** — Return the value on top without removing it. Return `-1` if the stack is empty.
- **`isEmpty()`** — Return `true` if the stack has no elements.
- **`size()`** — Return the number of elements in the stack.

## Examples

```java
Stack s = new Stack();
s.isEmpty();   // true
s.push(10);
s.push(20);
s.push(30);
s.peek();      // 30
s.pop();       // 30
s.pop();       // 20
s.size();      // 1
s.peek();      // 10
```

## Hints

- The "top" of the stack is the **last** element in the ArrayList
- `push` adds to the end, `pop` removes from the end
- `list.get(list.size() - 1)` gives you the last element
- `list.remove(list.size() - 1)` removes and returns the last element
