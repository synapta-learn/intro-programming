# Employee Types

## Problem

Create an `Employee` class hierarchy with two specialized subclasses.

### Employee
- Constructor: `Employee(String name, double salary)`
- `getName()` — returns the name
- `getSalary()` — returns the salary
- `toString()` — returns `"Employee: [name] ($[salary])"` where salary is formatted to 2 decimal places

### Manager (extends Employee)
- Constructor: `Manager(String name, double salary, double bonus)`
- `getBonus()` — returns the bonus
- `getTotalCompensation()` — returns salary + bonus
- Override `toString()` — returns `"Manager: [name] ($[salary] + $[bonus] bonus)"` (both formatted to 2 decimal places)

### Intern (extends Employee)
- Constructor: `Intern(String name)` — interns always have a salary of 0 (fixed stipend handled separately)
- Override `toString()` — returns `"Intern: [name] (unpaid)"`

## Examples

```java
Employee e = new Employee("Alice", 50000);
e.toString();  // "Employee: Alice ($50000.00)"

Manager m = new Manager("Bob", 80000, 15000);
m.getTotalCompensation();  // 95000.0
m.toString();  // "Manager: Bob ($80000.00 + $15000.00 bonus)"

Intern i = new Intern("Carol");
i.getSalary();   // 0.0
i.toString();    // "Intern: Carol (unpaid)"
```

## Hints

- Use `String.format("%.2f", value)` to format numbers to 2 decimal places
- Intern should call `super(name, 0)` in its constructor
- Use `@Override` on all `toString()` implementations
