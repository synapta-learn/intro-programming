# Comparable Student

## Problem

Create a `Student` class that implements `Comparable<Student>` so students can be sorted.

### Student
- Constructor: `Student(String name, double gpa)`
- `getName()` — returns the name
- `getGpa()` — returns the GPA
- `toString()` — returns `"[name] ([gpa])"` with GPA formatted to 1 decimal place
- `compareTo(Student other)` — sorts by GPA **descending** (highest first); if GPAs are equal, sort by name **ascending** (alphabetical)

## Examples

```java
Student s1 = new Student("Alice", 3.8);
Student s2 = new Student("Bob", 3.5);
Student s3 = new Student("Carol", 3.8);

s1.compareTo(s2);  // negative (Alice comes first — higher GPA)
s2.compareTo(s1);  // positive (Bob comes after — lower GPA)
s1.compareTo(s3);  // negative (same GPA, Alice < Carol alphabetically)

s1.toString();  // "Alice (3.8)"
```

After sorting an ArrayList of these students with `Collections.sort()`, the order would be: Alice (3.8), Carol (3.8), Bob (3.5).

## Hints

- For descending GPA: compare `other.gpa` to `this.gpa` (reverse the natural order)
- Use `Double.compare(a, b)` for safe double comparison
- For ascending name: use `this.name.compareTo(other.name)`
- Use `String.format("%.1f", gpa)` for formatting
