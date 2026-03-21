# Student Record

## Problem

Create a `Solution` class that represents a student with a name and a list of grades. It should have:

- A `String` field `name`
- An `int[]` field `grades`
- `averageGrade()` — returns the average of all grades as a `double`. Returns `0.0` if there are no grades.
- `highestGrade()` — returns the highest grade. Returns `0` if there are no grades.
- `gradeCount()` — returns the number of grades

## Examples

```java
Solution student = new Solution();
student.name = "Alice";
student.grades = new int[]{85, 92, 78, 95, 88};

student.gradeCount();    // 5
student.averageGrade();  // 87.6
student.highestGrade();  // 95
```

## Hints

- `averageGrade()` needs to sum all grades and divide by the number of grades
- Cast to `double` before dividing to avoid integer division: `(double) sum / grades.length`
- Check for empty or null `grades` array before calculating
- `highestGrade()` uses the same "find max" pattern you learned with arrays
