# Flatten

## Problem

Write a method `flatten(ArrayList<ArrayList<Integer>> nested)` that takes a list of lists and returns a single `ArrayList<Integer>` containing all elements in order.

The elements should appear in the result in the same order they appear in the nested structure — all elements of the first inner list, then all elements of the second inner list, and so on.

## Examples

```java
// Input: [[1, 2], [3, 4], [5]]
// Output: [1, 2, 3, 4, 5]

// Input: [[10], [], [20, 30]]
// Output: [10, 20, 30]

// Input: []
// Output: []
```

## Hints

- Use a nested for-each loop: the outer loop iterates over the inner lists, the inner loop iterates over each element
- Empty inner lists contribute no elements — the loop just skips them naturally
