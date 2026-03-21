# Mini Project — Student Grade Tracker

## Problem

Build a complete student grade tracking system that brings together classes, inheritance, interfaces, polymorphism, and collections.

### Student (abstract, implements Comparable<Student>)
- Constructor: `Student(String name)`
- `getName()` — returns the name
- `addGrade(double grade)` — adds a grade (0-100) to the student's grade list
- `getGrades()` — returns a new `ArrayList<Double>` copy of the grades
- Abstract method `calculateGPA()` — returns the GPA as a double (0.0 to 4.0)
- `toString()` — returns `"[name] (GPA: [gpa])"` with GPA to 2 decimal places
- `compareTo(Student other)` — sort by GPA **descending**; if tied, by name **ascending**

### Undergrad (extends Student)
- Constructor: `Undergrad(String name)`
- `calculateGPA()` — standard conversion: average grade / 25 (e.g., 100 avg = 4.0, 75 avg = 3.0). Cap at 4.0. Return 0.0 if no grades.

### Graduate (extends Student)
- Constructor: `Graduate(String name)`
- `calculateGPA()` — stricter: (average grade - 10) / 22.5 (e.g., 100 avg = 4.0, 82.5 avg = approx 3.22). Cap at 4.0, floor at 0.0. Return 0.0 if no grades.

### GradeTracker (static methods in Solution)
- **`Solution.addStudent(ArrayList<Student> roster, Student student)`** — add a student to the roster
- **`Solution.getHonorRoll(ArrayList<Student> roster)`** — return a new sorted ArrayList of students with GPA >= 3.5
- **`Solution.classAverage(ArrayList<Student> roster)`** — return the average GPA of all students. Return 0.0 if empty.
- **`Solution.topStudent(ArrayList<Student> roster)`** — return the student with the highest GPA, or `null` if empty. Break ties by name (alphabetically first).

## Examples

```java
ArrayList<Student> roster = new ArrayList<>();
Undergrad u = new Undergrad("Alice");
u.addGrade(95);
u.addGrade(90);
// avg = 92.5, GPA = 92.5/25 = 3.70

Graduate g = new Graduate("Bob");
g.addGrade(95);
g.addGrade(90);
// avg = 92.5, GPA = (92.5-10)/22.5 = 3.67

Solution.addStudent(roster, u);
Solution.addStudent(roster, g);
Solution.topStudent(roster);  // Alice (higher GPA)
```

## Hints

- Use an `ArrayList<Double>` inside Student to store grades
- For `getGrades()`, return a **copy**: `new ArrayList<>(grades)`
- Use `Math.min(result, 4.0)` to cap and `Math.max(result, 0.0)` to floor
- Use `Collections.sort()` in `getHonorRoll` — this works because Student implements Comparable
