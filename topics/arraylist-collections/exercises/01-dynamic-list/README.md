# Dynamic List

## Problem

Write a class with static methods that demonstrate basic ArrayList operations.

### Methods to Implement

1. **`createList(String[] items)`** — Create an `ArrayList<String>` containing all elements from the given array, in the same order. Return the ArrayList.

2. **`removeByIndex(ArrayList<String> list, int index)`** — Remove the element at the given index and return the removed element. If the index is out of bounds, return `null` without modifying the list.

3. **`removeByValue(ArrayList<String> list, String value)`** — Remove the first occurrence of the given value. Return `true` if the value was found and removed, `false` otherwise.

4. **`toArray(ArrayList<String> list)`** — Convert the ArrayList to a `String[]` array and return it.

## Examples

```java
String[] data = {"Alice", "Bob", "Carol", "Dave"};
ArrayList<String> list = Solution.createList(data);
// list → [Alice, Bob, Carol, Dave]

String removed = Solution.removeByIndex(list, 1);
// removed → "Bob", list → [Alice, Carol, Dave]

boolean found = Solution.removeByValue(list, "Carol");
// found → true, list → [Alice, Dave]

String[] array = Solution.toArray(list);
// array → ["Alice", "Dave"]
```

## Hints

- Use `list.add(item)` to add elements
- `list.remove(int index)` returns the removed element
- `list.remove(Object value)` returns `true` or `false`
- `list.toArray(new String[0])` converts to a String array
