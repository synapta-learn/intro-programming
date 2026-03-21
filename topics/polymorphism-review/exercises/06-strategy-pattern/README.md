# Strategy Pattern

## Problem

The **strategy pattern** lets you swap algorithms at runtime by hiding them behind an interface. Build a sorting system where the sort algorithm can be chosen dynamically.

### SortStrategy (interface)
- `void sort(int[] array)` — sorts the array in place (ascending)
- `String name()` — returns the name of the sort algorithm

### BubbleSort (implements SortStrategy)
- `sort(int[] array)` — implement bubble sort: repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order. Repeat until no swaps are needed.
- `name()` — returns `"BubbleSort"`

### SelectionSort (implements SortStrategy)
- `sort(int[] array)` — implement selection sort: find the minimum element in the unsorted part of the array and swap it with the first unsorted element. Repeat until the array is sorted.
- `name()` — returns `"SelectionSort"`

### Sorter
- Constructor: `Sorter(SortStrategy strategy)` — sets the sorting strategy
- `setStrategy(SortStrategy strategy)` — changes the strategy
- `getStrategyName()` — returns the current strategy's name
- `sort(int[] array)` — delegates to the current strategy's sort method

## Examples

```java
int[] data = {5, 2, 8, 1, 9};
Sorter sorter = new Sorter(new BubbleSort());
sorter.getStrategyName();  // "BubbleSort"
sorter.sort(data);
// data is now [1, 2, 5, 8, 9]

int[] data2 = {3, 1, 4, 1, 5};
sorter.setStrategy(new SelectionSort());
sorter.sort(data2);
// data2 is now [1, 1, 3, 4, 5]
```

## Hints

**Bubble Sort:**
```
repeat until no swaps:
    for i from 0 to length-2:
        if array[i] > array[i+1]:
            swap them
```

**Selection Sort:**
```
for i from 0 to length-1:
    find index of minimum from i to end
    swap array[i] with array[minIndex]
```
