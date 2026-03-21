# Builder Pattern

## Problem

Create a `Solution` class that acts as a builder for creating person descriptions. The builder uses **method chaining** — each setter returns `this` so calls can be chained together. It should have:

- `setName(String name)` — sets the name, returns `this`
- `setAge(int age)` — sets the age, returns `this`
- `setEmail(String email)` — sets the email, returns `this`
- `build()` — returns a formatted string: `"Name: [name], Age: [age], Email: [email]"`. If any field was not set, use `"unknown"` for name, `0` for age, and `"unknown"` for email.

The key insight is that each setter returns `this` (the builder itself), enabling chained calls.

## Examples

```java
String person = new Solution()
    .setName("Alice")
    .setAge(30)
    .setEmail("alice@example.com")
    .build();
// "Name: Alice, Age: 30, Email: alice@example.com"

String partial = new Solution()
    .setName("Bob")
    .build();
// "Name: Bob, Age: 0, Email: unknown"
```

## Hints

- Each setter method has return type `Solution` and ends with `return this;`
- Initialize fields with default values
- `build()` assembles the final string from the current field values
