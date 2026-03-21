# Frequency Map

## Problem

Without using HashMap (which you have not learned yet), implement frequency counting using **parallel ArrayLists** — one list for the unique values and another for their counts.

Write a class `FrequencyCounter` with:

### Constructor
- **`FrequencyCounter(ArrayList<String> items)`** — Analyze the given list and count how many times each unique item appears.

### Methods
- **`countOf(String item)`** — Return how many times the given item appeared. Return `0` if the item was not in the original list.
- **`mostCommon()`** — Return the item that appeared most frequently. If there is a tie, return whichever appeared first in the original list. Return `null` if the list was empty.
- **`uniqueCount()`** — Return how many unique items there are.

## Examples

```java
ArrayList<String> data = new ArrayList<>();
data.add("cat"); data.add("dog"); data.add("cat"); data.add("bird"); data.add("cat"); data.add("dog");

FrequencyCounter fc = new FrequencyCounter(data);
fc.countOf("cat");    // 3
fc.countOf("dog");    // 2
fc.countOf("bird");   // 1
fc.countOf("fish");   // 0
fc.mostCommon();      // "cat"
fc.uniqueCount();     // 3
```

## Hints

- Use two parallel ArrayLists: `ArrayList<String> keys` and `ArrayList<Integer> counts`
- When processing each item, check if it is already in `keys` using `indexOf()`
- If found, increment the count at the same index in `counts`
- If not found, add it to `keys` and add `1` to `counts`
- For `mostCommon()`, find the index of the maximum value in `counts`
