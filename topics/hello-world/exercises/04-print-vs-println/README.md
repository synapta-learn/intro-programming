# Exercise: Print vs Println

## Goal

Use a mix of `System.out.print()` and `System.out.println()` to produce exactly this output:

```
Name: Ada Lovelace
Age: 36
City: London
```

## The Catch

You must build each line using **two** print calls: one `print()` for the label and one `println()` for the value. This teaches you the difference between the two methods.

For example, the first line should be produced by:
```java
System.out.print("Name: ");
System.out.println("Ada Lovelace");
```

## Instructions

1. Open `Solution.java`
2. For each of the three lines, use `print()` for the label and `println()` for the value
3. You should have exactly 6 print/println calls total

## Hints

- `print()` does NOT add a newline — the next print starts on the same line
- `println()` DOES add a newline — the next print starts on a new line
- Make sure there is a space after the colon in each label
